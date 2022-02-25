abstract class Vehicle{
    abstract void drive();
    abstract void steeringMechanism();
    void start(){
        System.out.println("Vehicle Started");
    }
    void stop(){
        System.out.println("Vehicle Stopped");
    }
}
class Bike extends Vehicle{

    @Override
    void drive() {
    System.out.println("Drive method of Bike Class");
        
    }

    @Override
    void steeringMechanism() {
        System.out.println("Steering Mechanism method of Bike Class");
    }
    
}
class Car extends Vehicle{

    @Override
    void drive() {
        System.out.println("Drive method of Car Class");
    }

    @Override
    void steeringMechanism() {
        
        System.out.println("Steering Mechanism method of Car Class");
    }
    
}
class Abstraction{
    public static void main(String[] args){
        Bike bike = new Bike();
        Car car = new Car();
        bike.drive();
        bike.steeringMechanism();
        bike.start();
        bike.stop();
        car.drive();
        car.steeringMechanism();
        car.start();
        car.stop();
    }
}