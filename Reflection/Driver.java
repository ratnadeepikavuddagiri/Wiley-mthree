package Reflection;

import java.lang.Class;
import java.lang.reflect.*;
import java.text.*;
import java.util.*;

class Vehicle{
    public String brand;
    public int noOfWheels;
    public boolean isRegistered = false;

    public Vehicle() {
    }

    public Vehicle(String brand, int noOfWheels) {
        this.brand = brand;
        this.noOfWheels = noOfWheels;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getNoOfWheels() {
        return noOfWheels;
    }
    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    public boolean isRegistered() {
        return isRegistered;
    }

    public void displayDrivingOrientation(){
        System.out.println("Driving Orientation : Right Side");
    }
    public void register(String brand,int noOfWheels) {
        setBrand(brand);
        setNoOfWheels(noOfWheels);
        this.isRegistered = true;
        System.out.println(this.toString());
        displayDrivingOrientation();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String str = formatter.format(date);
        System.out.println("Date Of Registration : "+str);
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", isRegistered=" + isRegistered + ", noOfWheels=" + noOfWheels ;
    } 
}

class Car extends Vehicle {
    public String carName;
    public Date yearOfManufacture;

    public Car(String brand, int noOfWheels,String carName) throws ParseException {
        super(brand, noOfWheels);
        this.carName = carName;
        Date date = new SimpleDateFormat("yyyy").parse("2021");
        this.yearOfManufacture = date;
    }

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Date getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void registerCar() {
        super.register(brand, noOfWheels);
    }

    @Override
    public String toString() {
        return super.toString() +" carName=" + carName + ", yearOfManufacture=" + yearOfManufacture ;
    }

    
}
public class Driver {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ParseException {
        Car car = new Car("Toyota",4,"Car1");
        car.registerCar();
        Class cls = car.getClass();
        Class supercls = cls.getSuperclass();
        System.out.println("Name of Class : "+cls.getSimpleName());
        System.out.println("Name of Super Class : "+supercls.getSimpleName());

        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor name: " + c.getName());
            System.out.println("Constructor modifier: " + Modifier.toString(c.getModifiers()));
            System.out.println("Parameters: " + c.getParameterCount());
        }
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method name: " + m.getName());
            System.out.println("Method modifier: " + Modifier.toString(m.getModifiers()));
            System.out.println("Parameters: " + m.getParameterCount());
            System.out.println("Return Type: " + m.getReturnType());
        }
        Field field1 = cls.getField("carName");
        System.out.println("Before Modification: "+field1.get(car));
        field1.set(car,"BMW");
        System.out.println("After Modification: "+field1.get(car));

        Field field2 = cls.getField("isRegistered");
        System.out.println("Before Modification: "+field2.get(car));
        field2.set(car,false);
        System.out.println("After Modification: "+field2.get(car));

        System.out.println(car);
    }
}
