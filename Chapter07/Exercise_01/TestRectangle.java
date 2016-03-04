
public class TestRectangle{
 public static void main(String[] args){
  
  // Create two new rectangles.
  Rectangle rectangle1 = new Rectangle(4,40);
  Rectangle rectangle2 = new Rectangle(3.5,35.9);
  
  // Set both colours of the rectangles to red.
  rectangle1.setColour("red");
  rectangle2.setColour("red");
  
  // Display the properties of each rectangle.
  System.out.println("The first rectangle has colour " +rectangle1.getColour()+ ", area " +rectangle1.getArea()+ ", and perimeter " +rectangle1.getPerimeter()+ ".");
  System.out.println("The second rectangle has colour " +rectangle2.getColour()+ ", area " +rectangle2.getArea()+ ", and perimeter " +rectangle2.getPerimeter()+ ".");
  
 }
}




class Rectangle{
  
  // Data fields.
  private double width=1;
  private double height=1;
  private String colour="white";
  
  // Construct a default rectangle.
  public Rectangle(){
  }
  
  // Construct a rectangle with a specified width and height.
  public Rectangle(double newWidth, double newHeight){
    width=newWidth;
    height=newHeight;
  }
  
  // Return the width.
  public double getWidth(){
    return width;
  }
  
  // Return the height.
  public double getHeight(){
    return height;
  }
  
  // Return the colour.
  public String getColour(){
    return colour;
  }

  // Set a new width.
  public void setWidth(double newWidth){
    width = (newWidth>=0) ? newWidth : 0;
  }

  // Set a new width.
  public void setHeight(double newHeight){
    height = (newHeight>=0) ? newHeight : 0;
  }
  
  // Set a new colour.
  public void setColour(String newColour){
    colour = newColour;
  }
  
  // Return the area of the rectangle.
  public double getArea(){
    return width*height;
  }
  
  // Return the perimeter of the rectangle.
  public double getPerimeter(){
    return 2*(width + height);
  }
}