public class MyDate{
 private String year;
 private String month;
 private String day;

 
 public MyDate(){
 }
 
 
 public void setYear(String newYear){
  this.year=newYear;
 }
 
 public void setMonth(String newMonth){
  this.month = newMonth;
 }
 
 public void setDay(String newDay){
  this.day = newDay;
 }
 
 public String getYear(){
  return year;
 }
 
 public String getMonth(){
  return month;
 }
 
 public String getDay(){
  return day;
 }
 
 public String getDate(){
  return year + "-" + month + "-" + day;
 }
}