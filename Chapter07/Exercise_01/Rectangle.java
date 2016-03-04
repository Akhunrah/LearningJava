package myPackage;

public class Rectangle{
  
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