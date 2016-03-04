public class TestMyPoint{
 public static void main(String[] args){
  
  MyPoint origin = new MyPoint();
  MyPoint point1 = new MyPoint(1,1);
  
  System.out.println("Point 1: (" + point1.xGet() + "," + point1.yGet() + ")");
  System.out.println("Distance of point 1 from origin: " + point1.distance(origin));
  System.out.println("Distance of point 1 from (4,5): " + point1.distance(4.,5.));
 }
}