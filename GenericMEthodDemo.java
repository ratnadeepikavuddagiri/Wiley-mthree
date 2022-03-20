class GenericMethod{
    <T> T multiplication(Integer num, T param){
        if(param.getClass().getName().equals("Integer")){
            return (T) Integer.valueOf(((Integer) param).intValue() * num);
        else if(param.getClass().getName().equals("Double")){
            return (T) Double.valueOf(((Double) param).doubleValue() * num);
        else if(param.getClass().getName().equals("String"))
        return (T) "Cannot perform Multiplication";
        else if(param.getClass().getName().equals("Boolean"))
        return (T) Boolean.valueOf(((Boolean) param).booleanValue());
        return param;
    }
}
public class GenericMEthodDemo {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.multiplication(10,20));
        System.out.println(genericMethod.multiplication(10,2.5));
        System.out.println(genericMethod.multiplication(10,"Hi"));
        System.out.println(genericMethod.multiplication(10,true));

    }
}
