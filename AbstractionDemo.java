abstract class Shape{
    String name = "Generic Shape";
    double area;
    double perimeter;
    Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    abstract void calculateArea();
    abstract void calulatePerimeter();
    abstract void draw();

}
class Rectangle extends Shape{
    int length = 5;
    int breadth = 4;
    Rectangle(String name) {
        super(name);
        
    }
    
    @Override
    void calculateArea() {
        this.area  = length*breadth;
        System.out.println("Area of Rectangle : " +this.getArea());        
    }

    @Override
    void calulatePerimeter() {
        this.perimeter = (length+breadth)*2;
        System.out.println("Perimeter of Rectangle : "+ this.getPerimeter());
        
    }

    @Override
    void draw() {
        System.out.println("Drawing "+getName());   
    }

}
class SquareFig extends Shape{

    int side = 5;
    SquareFig(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    @Override
    void calculateArea() {
        this.area  = side*side;
        System.out.println("Area of Square : " +this.getArea());  
    }

    @Override
    void calulatePerimeter() {
        this.perimeter = side*4;
        System.out.println("Perimeter of Square : "+ this.getPerimeter());        
    }

    @Override
    void draw() {
        System.out.println("Drawing "+getName());  
    }
    
}
class Circle extends Shape{

    int radius =4;
    Circle(String name) {
        super(name);
    }
    @Override
    void calculateArea() {
        this.area  = (radius * radius*22)/7;
        System.out.println("Area of Circle : " +this.getArea());   
    }

    @Override
    void calulatePerimeter() {
        this.perimeter = (radius*44)/7;
        System.out.println("Perimeter of Circle : "+ this.getPerimeter()); 
    }

    @Override
    void draw() {
        System.out.println("Drawing "+getName());  
    }

}

public class AbstractionDemo {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("rectangle");
        Shape squareFig= new SquareFig("Square");
        Shape circle = new Circle("Circle");
        rectangle.draw();
        rectangle.calculateArea();
        rectangle.calulatePerimeter();
        squareFig.draw();
        squareFig.calculateArea();
        squareFig.calulatePerimeter();
        circle.draw();
        circle.calculateArea();
        circle.calulatePerimeter();

    }
}
