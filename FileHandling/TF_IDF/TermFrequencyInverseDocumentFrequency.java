package FileHandling.TF_IDF;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TermFrequencyInverseDocumentFrequency {

    public static String[] stopWordRemoval(ArrayList<String> arrOfStr) {
        String[] stopWords = new String[] { "i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", 
                "you're", "you've", "you'll", "you'd", "your", "yours", "yourself", "yourselves", "he", "most", "other",
                "some", "such", "no", "nor", "not", "only", "own", "same", "so", "then", "too", "very", "is", "t",
                "can", "will", "just", "don", "don't", "should", "should've", "now", "d", "ll", "m", "o", "re", "ve",
                "y", "ain", "aren't", "could", "couldn't", "didn't", "didn't", "the", "of","a" };
        
        for(int i=0;i<arrOfStr.size();i++){
            for(int j=0;j<stopWords.length;j++) {
                if(arrOfStr.get(i).equals(stopWords[j]))
                    arrOfStr.remove(i);
            }
        }
        String cleanData[] = arrOfStr.toArray(new String[arrOfStr.size()]);
        // for(int i=0;i<cleanData.length;i++)
        // System.out.println(cleanData[i]);
        return cleanData;
    }

    static String[] dataCleaning(String data){
        
            data = data.replaceAll("\\p{Punct}","").toLowerCase();
            ArrayList<String> arrOfStr = new ArrayList<>();
            String[] dataclean =data.split(" ");
            for(int i=0;i<dataclean.length;i++){
                arrOfStr.add(dataclean[i]);
            }
            String[] cleanData = stopWordRemoval(arrOfStr);
            // for(int i=0;i<arrOfStr.size();i++){
            //     System.out.println(arrOfStr.get(i));
            // }
        
        return cleanData;
    }
    
    public static String[] getUniqueWords(String[][] cleanData){
        HashSet<String> uniqueWords = new HashSet<>();
        for (String[] row : cleanData) {
            for (String word : row) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords.toArray(new String[uniqueWords.size()]);
    }

    public static void getTFMatrix(double[][] tfMatrix,String[][] cleanData, String[] uniqueWords){
        for (int i = 0; i < cleanData.length; i++) {
            for (int j = 0; j < uniqueWords.length; j++) {
                int count = 0;
                for (int k = 0; k < cleanData[i].length; k++) {
                    if (uniqueWords[j].equals(cleanData[i][k])) {
                        count++;
                    }
                }
                tfMatrix[i][j] = (double) count / cleanData[i].length;
            }
        }
    } 
    public static void getIDF(double[] idf,String[][] cleanData, String[] uniqueWords){

        int k=0;
        for (String uniqueWord : uniqueWords) {
            int count = 0;
            for (String[] row : cleanData) {
                for (String word : row) {
                    if (word.equals(uniqueWord)) {
                        count++;
                        break;
                    }
                }
            }
            idf[k++] = count;
        }
        int noOfDocuments = cleanData.length;
        for (int i = 0; i < idf.length; i++) {
            idf[i] = Math.log10(noOfDocuments / idf[i]);
        }
    }
    public static void getTF_IDF(double[][] tfidf,double[][] tf, double[] idf){
        for (int i = 0; i < tf.length; i++) {
            for (int j = 0; j < idf.length; j++) {
                tfidf[i][j] = tf[i][j]*idf[j];
            }
        }
    }

 public static void main(String[] args) {

    String[] paths = {"FileHandling/TF_IDF/file1.txt","FileHandling/TF_IDF/file2.txt","FileHandling/TF_IDF/file3.txt","FileHandling/TF_IDF/file4.txt"};
    Scanner sc;
    String[][] cleanData = new String[paths.length][];
    try {
        int i=0;
        for(String x : paths){
            File file = new File(x);
            sc = new Scanner(file);
            while (sc.hasNextLine())
                cleanData[i]=dataCleaning(sc.nextLine());
            i++;
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    // String[][] cleanData =dataCleaning(data);
    // for(int i=0;i<cleanData.length;i++){
    //     for(int j=0;j<cleanData[i].length;j++)
    //         System.out.print(cleanData[i][j]+" ");
    //         System.out.println();
    // }
    String[] uniqueWords = getUniqueWords(cleanData);
    double[][] tfMatrix = new double[paths.length][uniqueWords.length];
    getTFMatrix(tfMatrix, cleanData,uniqueWords);
    // for(int i=0;i<tfMatrix.length;i++){
    //     for(int j=0;j<tfMatrix[0].length;j++)
    //         System.out.print(tfMatrix[i][j]+" ");
    //         System.out.println();    
    // }
    double[] idf = new double[uniqueWords.length];
    getIDF(idf,cleanData,uniqueWords);
    // for(int i=0;i<idf.length;i++){
    //     System.out.print(idf[i]+" ");
    // }
    double[][] tfidf = new double[paths.length][uniqueWords.length];
    getTF_IDF(tfidf,tfMatrix,idf);
    // for(int i=0;i<tfidf.length;i++){
    //         for(int j=0;j<tfidf[0].length;j++)
    //             System.out.print(tfidf[i][j]+" ");
    //             System.out.println();    
    //     }
    System.out.print("Document ");
    for(int i=0;i<uniqueWords.length;i++){
        System.out.print(uniqueWords[i]+"  ");
    }
    System.out.println();
    for(int i=0;i<tfidf.length;i++){
        System.out.print("D"+(i+1)+"\t");
        for(int j=0;j<tfidf[0].length;j++)
            System.out.printf(" %.4f ",tfidf[i][j]);
        System.out.println();
    }
 }   
}
