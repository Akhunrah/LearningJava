public class TestTriangle2D{
 public static void main(String[] args){
  
  Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2), new MyPoint(4.2,3), new MyPoint(5,3.5));
  Triangle2D t2 = new Triangle2D(new MyPoint(2.9,2), new MyPoint(4,1), new MyPoint(1,3.4));
  Triangle2D t3 = new Triangle2D(new MyPoint(2,5.5), new MyPoint(4,-3), new MyPoint(2,6.5));
  
  System.out.println("Triangle area: " + t1.getArea());
  System.out.println("Triangle perimeter: "+ t1.getPerimeter());
  System.out.println(t1.contains(new MyPoint(3,3)));
  System.out.println(t1.contains(t2));
  System.out.println(t1.overlaps(t3));
 }
}