interface Shape1{
    void draw();
}

interface Polygon{
    double area=0.0;
    double perimeter=0.0;
    int noOfSides=0;

    double getArea();
    double getPerimeter();
    boolean isPolygon();
}

class Figure implements Shape1,Polygon{
    double area=0.0;
    double perimeter;
    int noOfSides;
    
    
    public Figure(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    @Override
    public boolean isPolygon() {
        if(this.noOfSides<=2)
            return false;
        return true;
    }

    @Override
    public void draw() {
        System.out.println("I am of "+this.getClass().getSimpleName()+" Shape");
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public int getNoOfSides() {
        return noOfSides;
    }
    
    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }
    
}
class  Triangle1 extends Figure{
    int side1;
    int side2;
    int side3;
    int base;
    int height;

    public  Triangle1(int side1, int side2, int side3,int base,int height) {
        super(3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getPerimeter() {
        return this.side1+this.side2+this.side3;
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}

class Rectangle1 extends Figure{
    int length;
    int breadth;
    
    public Rectangle1(int length,int breadth ) {
        super(4);
        this.length = length;
        this.breadth = breadth;        
    }

    @Override
    public double getPerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double getArea() {
        return length*breadth;
    }
}

public class InterfaceAnonymousClass {
    public static void main(String[] args) {
        Triangle1  triangle = new  Triangle1(3,4,5,12,4);
        triangle.draw();
        System.out.println("Area : "+ triangle.getArea());
        System.out.println("Perimeter : "+ triangle.getPerimeter());
        System.out.println("Triangle is a polygon : "+ triangle.isPolygon());
        Rectangle1 rectangle = new Rectangle1(4,5);
        rectangle.draw();
        System.out.println("Area : "+rectangle.getArea());
        System.out.println("Perimeter : "+rectangle.getPerimeter());
        System.out.println("Rectangle is a polygon : "+rectangle.isPolygon());
    }
}
