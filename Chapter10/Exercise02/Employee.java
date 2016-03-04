public class Employee extends Person{
 private String office;
 private String salary;
 private MyDate dateHired;
 
 public Employee(){
 }
 
 public void setOffice(String newOffice){
  this.office = newOffice;
 }
 
 public void setSalary(String newSalary){
  this.salary = newSalary;
 }
 
 public String getOffice(){
  return office;
 }
 
 public String getSalary(){
  return salary;
 }
 
 public String toString(){
  return "Class is Employee. Name is " + getName();
 }
}