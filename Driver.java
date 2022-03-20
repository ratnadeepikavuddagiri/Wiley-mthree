class Point{
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.x;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public double distance(Point p1,Point p2) {
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
    }
    
}
class Line{
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public Line(int x1,int y1,int x2,int y2){
        this.start = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line [end=" + end + ", start=" + start + "]";
    }

    public double length(){
        return start.distance(start,end);
    }
    
}
public class Driver {
    public static void main(String[] args) {
        Line line = new Line(1,2,3,4);
        System.out.println(line.length());
    }
}
