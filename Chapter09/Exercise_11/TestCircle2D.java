public class TestCircle2D{
 public static void main(String[] args){
  
  Circle2D c1 = new Circle2D(2,2,5.5);
  
  System.out.println("Circle centre: (" + c1.xGet() + "," +c1.yGet() +")");
  System.out.println("Circle radius: " + c1.rGet());
  System.out.println("Circle area: "+ c1.getArea());
  System.out.println("Circle perimeter: "+ c1.getPerimeter());
  System.out.println("Circle contains (3,3)?" + c1.contains(3,3));
  System.out.println("Circle contains (10,10)?" + c1.contains(10,10));
  System.out.println("Circle contains the circle (2,2,1)?" + c1.contains(new Circle2D(2,2,1)));
  System.out.println("Circle contains the circle (4,5,10.5)?" + c1.contains(new Circle2D(4,5,10.5)));
  System.out.println("Circle overlaps the circle (3,5,2.3)?" + c1.overlaps(new Circle2D(3,5,2.3)));
  System.out.println("Circle overlaps the circle (10,10,1)?" + c1.overlaps(new Circle2D(10,10,1)));
 }
}