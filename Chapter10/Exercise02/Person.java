public class Person{
 
 private String name;
 private String address;
 private String phoneNumber;
 private String email;
 
 public Person(){
 }
 
 public void setName(String newName){
  this.name = newName;
 }
 
 public void setAddress(String newAddress){
  this.address = newAddress;
 }
 
 public void setPhoneNumber(String newPhoneNumber){
  this.phoneNumber = newPhoneNumber;
 }
 
 public void setEmail(String newEmail){
  this.email = newEmail;
 }
 
 
 public String getName(){
  return name;
 }
 
 public String getAddress(){
  return address;
 }
 
 public String getPhoneNumber(){
  return phoneNumber;
 }
 
 public String getEmail(){
  return email;
 }
 
 

 public String toString(){
  return "Class is Person. Name is " + name;
 }
}














