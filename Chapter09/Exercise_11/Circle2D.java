import java.lang.Math;

public class Circle2D{
 
 // -value double x; Stores the x-coordinate of the circle's centre.
 // -value double y; Stores the y-coordinate of the circle's centre.
 // -value double r; Stores the radius of the circle.
 // ===============================================================
 // +xGet(); Returns the x-coordinate of the centre.
 // +yGet(); Returns the y-coordinate of the centre.
 // +rGet(); Returns the radius of the centre.
 // +Circle2D(); Creates a default circle with centre (0,0) and radius 1.
 // +Circle2D(double x, double y, double r); Creates a circle with centre (x,y) and radius r.
 // +getArea(); Returns the area of the circle.
 // +getPerimeter; Returns the perimeter of the circle.
 // +contains(double x, double y); Returns true if the point (x,y) is in the circle.
 // +contains(Circle2D circle); Returns true if circle is completely contained within this circle.
 // +overlaps(Circle2D circle); Returns true if the two circles overlap.
 
 
 private double x;
 private double y;
 private double r;


 
 public Circle2D(){
  this.x = 0;
  this.y = 0;
  this.r = 1;
 }


 
 public Circle2D(double xNew, double yNew, double rNew){
  this.x = xNew;
  this.y = yNew;
  this.r = rNew;
 }
 
 
 
 public double xGet(){
  return x;
 }
 
 
 public double yGet(){
  return y;
 }
 
 
 public double rGet(){
  return r;
 }
 

  
 public double getArea(){
  return Math.PI*r*r;
 }
 


 public double getPerimeter(){
  return 2*Math.PI*r;
 }
 


 public boolean contains(double xNew, double yNew){
  double distance = Math.sqrt(Math.pow(x-xNew,2) + Math.pow(y-yNew,2));
  
  if(distance <= r){
   return true;
  }
  else{
   return false;
  }

 }



 public boolean contains(Circle2D circle){
  double distanceBtwnCentres = Math.sqrt(Math.pow(x-circle.xGet(),2) + Math.pow(y-circle.yGet(),2));
  double outerRadius = r;
  double innerRadius = circle.rGet();
  
  if(outerRadius-innerRadius >= distanceBtwnCentres){
   return true;
  }
  else{
   return false;
  }
 }
 
 
 
 public boolean overlaps(Circle2D circle){
  double distanceBtwnCentres = Math.sqrt(Math.pow(x-circle.xGet(),2) + Math.pow(y-circle.yGet(),2));
  double radius1 = r;
  double radius2 = circle.rGet();
  
  if(radius1+radius2 >= distanceBtwnCentres){
   return true;
  }
  else{
   return false;
  }
 }
 
 
}