
import javax.swing.JOptionPane;

public class CelsiusToFarenheit{
 public static void main(String[] args){
  
  // Declare variables and constants.
  double degreesCelsius;
  double degreesFarenheit;
  String degreesCelsiusString;
  String message;
  
  // Read in degreesCelsius variable.
  degreesCelsiusString = JOptionPane.showInputDialog("Enter temperature in Celsius:");
  degreesCelsius = Double.parseDouble(degreesCelsiusString);
  
  // Perform conversion.
  degreesFarenheit=(9.0/5.0)*degreesCelsius + 32;
  degreesFarenheit= (int) (degreesFarenheit*100);
  degreesFarenheit= degreesFarenheit/100.0;
  
  // Output the result.
  message = "The temperature in degrees Farenheit is " + degreesFarenheit + ".";
  JOptionPane.showMessageDialog(null, message);
  
 }
}