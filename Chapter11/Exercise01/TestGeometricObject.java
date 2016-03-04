public class TestGeometricObject{
  public static void main(String[] args){
    GeometricObject object1 = new Circle(3);
    GeometricObject object2 = new Circle(5);
    GeometricObject object3 = new Rectangle(4,4);
    GeometricObject object4 = new Rectangle(3,5);
    
    System.out.println("The area of the larger circle is " +((GeometricObject)GeometricObject.max(object1,object2)).getArea() +".");
    System.out.println("The area of the larger rectangle is " +((GeometricObject)GeometricObject.max(object3,object4)).getArea() +".");
  }
}