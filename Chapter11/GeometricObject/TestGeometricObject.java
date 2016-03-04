public class TestGeometricObject{
  public static void main(String[] args){
    GeometricObject geoObj1 = new Circle(5);
    GeometricObject geoObj2 = new Rectangle(5,3);
    
    System.out.println("Same area? " + equalArea(geoObj1,geoObj2));
    
    
    displayGeometricObject(geoObj1);
    displayGeometricObject(geoObj2);
    
  }
  
  public static boolean equalArea(GeometricObject obj1, GeometricObject obj2){
    return obj1.getArea() == obj2.getArea();
  }
  
  public static void displayGeometricObject(GeometricObject object){
    System.out.println();
    System.out.println("The area is " +object.getArea() +".");
    System.out.println("The perimeter is " +object.getPerimeter() + ".");
  }
}