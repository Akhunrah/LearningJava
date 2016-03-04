public class Student extends Person{
 private String CLASS_STATUS;
 
 
 public Student(){
 }
 
 
 public void setStatus(String newStatus){
  if(newStatus.equals("Freshman")){
   this.CLASS_STATUS = "Freshman";
  }
  else if(newStatus.equals("Sophomore")){
   this.CLASS_STATUS = "Sophomore";
  }
  else if(newStatus.equals("Junior")){
   this.CLASS_STATUS = "Junior";
  }
  else if(newStatus.equals("Senior")){
   this.CLASS_STATUS = "Senior";
  }
 }
 
 
 public String toString(){
  return "Class is Student. Name is " + getName();
 }
}