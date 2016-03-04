public class Faculty extends Employee{
 private String officeHours;
 private String rank;
 

 
 public Faculty(){
 }


 
 public void setOfficeHours(String newOfficeHours){
  this.officeHours = newOfficeHours;
 }
 
 public void setRank(String newRank){
  this.rank=newRank;
 }
 
 public String getOfficeHours(){
  return officeHours;
 }
 
 public String getRank(){
  return rank;
 }
 
 
 
 public String toString(){
  return "Class is Faculty. Name is " + getName();
 }
}
