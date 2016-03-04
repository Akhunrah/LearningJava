public class Octagon extends GeometricObject implements Cloneable, Comparable{
  private double side;
  
  public Octagon(){
    this.side=1;
  }
  
  public Octagon(double newSide){
    this.side = newSide;
  }
  
  public void setSide(double newSide){
    this.side=newSide;
  } 
  
  public double getSide(){
    return side;
  }
  
  public double getArea(){
    return (3.0+4.0/Math.sqrt(2))*side*side;
  }
  
  public double getPerimeter(){
    return 8*side;
  }
  
  public int compareTo(Object o){
    if(getArea() > ((Octagon)o).getArea()){
      return 1;
    }
    else if(getArea() < ((Octagon)o).getArea()){
      return -1;
    }
    else{
      return 0;
    }
  }
  
  @Override
  public Object clone() throws CloneNotSupportedException {
    return (Octagon)super.clone();
  }
  
  
}