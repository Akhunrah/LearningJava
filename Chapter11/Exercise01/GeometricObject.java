public abstract class GeometricObject implements Comparable{
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  protected GeometricObject(){
    dateCreated = new java.util.Date();
  }
  
  /** Return Color */
  public String getColor(){
    return color;
  }
  
  /** Set a new color */
  public void setColor(String color){
    this.color = color;
  }
  
  /** Return filled. */
  public boolean isFilled(){
    return filled;
  }
  
  /** Set a new filled */
  public void setFilled(boolean filled){
    this.filled = filled;
  }
  
  /** Get dateCreated*/
  public java.util.Date getDateCreated(){
    return dateCreated;
  }
  
  /** Return a string representation of this object */
  public String toString(){
    return "Created on " + dateCreated + "\ncolor: " +color+" and filled: " +filled;
  }
  
  /** Override compareTo */
  public int compareTo(Object object){
    if(getArea() > ((GeometricObject)object).getArea()){
      return 1;
    }
    else if(getArea()<((GeometricObject)object).getArea()){
      return -1;
    }
    else{
      return 0;
    }
  }
  
  /** Define a max method */
  public static Comparable max(Comparable object1, Comparable object2){
    if(object1.compareTo(object2)>0){
      return object1;
    }
    else{
      return object2;
    }
  }
  
  
  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}