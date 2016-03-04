//import java.lang.math;

public class MyPoint{
 // -value: double x; Stores the x-variable of the point.
 // -value: double y; Stores the y-variable of the point.
 // ====================================================
 // +MyPoint(); Creates a default point of (0,0).
 // +MyPoint(double x, double y); Creates a point with coordinates (x,y).
 // +xGet(); Returns the x-coordinate.
 // +yGet(); Returns the y-coordinate.
 // +distance(MyPoint newPoint); Calculates the distance between this point and newPoint.
 // +distance(double x,double y); Calculates the distance between this point and (x,y).
 
 private double x;
 private double y;
 
 public MyPoint(){
  this(0.,0.);
 }
 
 public MyPoint(double xCoord, double yCoord){
  this.x = xCoord;
  this.y = yCoord;
 }
 
 public double xGet(){
  return x;
 }
 
 public double yGet(){
  return y;
 }
 
 public double distance(MyPoint newPoint){
  double distSquared = Math.pow((x-newPoint.xGet()),2) + Math.pow((y-newPoint.yGet()),2);
  return Math.sqrt(distSquared);
 }
 
 public double distance(double newX, double newY){
  double distSquared = Math.pow(x-newX,2)+Math.pow(y-newY,2);
  return Math.sqrt(distSquared);
 }
 
}