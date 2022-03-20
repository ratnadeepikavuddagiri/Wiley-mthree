package generics;
class GenericMethod{
    
    <T> T multiplication(Integer num, T param){
        if(param.getClass().getSimpleName().equals("Integer")){
             int x= (int)param;
            return (T) (Integer)(num*x);
        }
        else if(param.getClass().getSimpleName().equals("Double")){
            double x= (double)param;
            return (T) (Double)(num*x);
        }
        else if(param.getClass().getSimpleName().equals("String")){
            return (T) "Cannot perform Multiplication";
        }
        else if(param.getClass().getSimpleName().equals("Boolean")){
            return (T) (Boolean)false;
        }
        return param;
    }
}
public class GenericMethodDemo {
    
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.multiplication(10,20));
        System.out.println(genericMethod.multiplication(10,2.5));
        System.out.println(genericMethod.multiplication(10,"Hi"));
        System.out.println(genericMethod.multiplication(10,true));

    }
}