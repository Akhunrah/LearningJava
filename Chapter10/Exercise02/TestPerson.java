public class TestPerson{
 public static void main(String args[]){
  
  Person person = new Person();
  Student student = new Student();
  Employee employee = new Employee();
  Faculty faculty = new Faculty();
  Staff staff = new Staff();
 
  person.setName("Aaron");
  student.setName("Brendan");
  employee.setName("Cameron");
  faculty.setName("Danny Bhoy");
  staff.setName("Edward");

  System.out.println(person.toString());
  System.out.println(student.toString());
  System.out.println(employee.toString());
  System.out.println(faculty.toString());
  System.out.println(staff.toString());
  
 }
}