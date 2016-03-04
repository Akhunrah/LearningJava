import java.lang.Math;

public class Triangle2D{
 // -MyPoint p1,p2,p3; 3 points of the triangle.
 // =======================================================================
 // +Triangle2D(); Makes default triangle with points (0,0), (1,1), (2,5).
 // +Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3); Makes a triangle with points p1,p2,p3.
 // +getPoint1(); returns the first point. 
 // +getPoint2(); returns the second point. 
 // +getPoint3(); returns the third point.
 // +setPoint1(MyPoint); sets the first point. 
 // +setPoint2(MyPoint); sets the second point. 
 // +setPoint3(MyPoint); sets the third point.
 // +getArea(); returns the area of the triangle.
 // +getPerimeter(); returns the perimeter of the triangle.
 // +contains(MyPoint p); returns true if point is in the triangle.
 // +contains(Triangle2D t); returns true if triangle t is in the triangle.
 // +overlaps(Triangle2D t); returns true if triangle t overlaps the triangle.
 
 
  
 private MyPoint p1;
 private MyPoint p2;
 private MyPoint p3;
 
 
 
 
 public Triangle2D(){
  this.p1 = new MyPoint(0,0);
  this.p2 = new MyPoint(1,1);
  this.p3 = new MyPoint(2,5);
 }
 
 
 public Triangle2D(MyPoint p1New, MyPoint p2New, MyPoint p3New){
  this.p1 = p1New;
  this.p2 = p2New;
  this.p3 = p3New;
 }
 
 
 
 
 public MyPoint getPoint1(){
  return p1;
 }
 
 public MyPoint getPoint2(){
  return p2;
 }
 
 public MyPoint getPoint3(){
  return p3;
 }



 public void setPoint1(MyPoint p1New){
  this.p1 = p1New;
 }
 
 public void setPoint2(MyPoint p2New){
  this.p2 = p2New;
 }
 
 public void setPoint3(MyPoint p3New){
  this.p3 = p3New;
 }
 
 
 
 public double getArea(){
  return 0.5*Math.abs(p1.xGet()*(p2.yGet()-p3.yGet())+p2.xGet()*(p3.yGet()-p1.yGet())+p3.xGet()*(p1.yGet()-p2.yGet()));
 }
 
 
 public double getPerimeter(){
  return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);  
 }
 
 
 
 public boolean contains(MyPoint p){
  MyPoint B = new MyPoint(p2.xGet()-p1.xGet(),p2.yGet()-p1.yGet());
  MyPoint C = new MyPoint(p3.xGet()-p1.xGet(),p3.yGet()-p1.yGet());
  MyPoint P = new MyPoint(p.xGet()-p1.xGet(),p.yGet()-p1.yGet());
  double d = B.xGet()*C.yGet() - C.xGet()*B.yGet();
  
  double weight1 = (P.xGet()*(B.yGet()-C.yGet())+P.yGet()*(C.xGet()-B.xGet())+d)/d;
  double weight2 = (P.xGet()*C.yGet()-P.yGet()*C.xGet())/d;
  double weight3 = (P.yGet()*B.xGet()-P.xGet()*B.yGet())/d;
  
  boolean cond1 = weight1>=0 && weight1<=1;
  boolean cond2 = weight2>=0 && weight2<=1;
  boolean cond3 = weight3>=0 && weight3<=1;
  
  if(cond1 && cond2 && cond3){
   return true;
  }
  else{
   return false;
  }
 }
 
 
 
 public boolean contains(Triangle2D t){
  if(this.contains(t.getPoint1()) && this.contains(t.getPoint2()) && this.contains(t.getPoint3())){
   return true;
  }
  else{
   return false;
  }
 }
 
 
 
 public boolean overlaps(Triangle2D t){
  if(this.contains(t.getPoint1()) || this.contains(t.getPoint2()) || this.contains(t.getPoint3())){
   return true;
  }
  else if(t.contains(p1)||t.contains(p2)||t.contains(p3)){
   return true;
  }
  else{
   return false;
  }
 }
}