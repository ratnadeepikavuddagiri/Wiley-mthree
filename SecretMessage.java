public class SecretMessage {

    public static void main(String[] args) {
        String secretMessage = "Bzwarz!1It9is3java2whzn1you5arz4using3phonzs8during1thz9szssions";
        System.out.println(secretMessage);
        String decodedMessage = (((secretMessage.replace('z','e')).replaceAll("[0-9]"," ")).replaceFirst("java","obvious")).toUpperCase();
        System.out.println(decodedMessage);
    }    
}
