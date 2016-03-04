public class Test{
  public static void main(String[] args) throws CloneNotSupportedException{
    Octagon oct1 = new Octagon(5);
    Octagon oct2 = (Octagon)oct1.clone();
    
    System.out.println("Area: " + oct1.getArea());
    System.out.println("Perimeter: " + oct1.getPerimeter());
    System.out.println("oct1==oct2? " + (oct1.compareTo(oct2)==0));
  }
}