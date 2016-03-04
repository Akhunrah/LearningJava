public class Staff extends Employee{
 private String title;
 
 
 public Staff(){
 }
 
 public void setTitle(String newTitle){
  this.title = newTitle;
 }
 
 public String getTitle(){
  return title;
 }
 
 
 public String toString(){
  return "Class is Staff. Name is " + getName();
 }
}