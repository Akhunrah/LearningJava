
import javax.swing.JOptionPane;

public class CylinderVolume{
 public static void main(String[] args){
  
  // Declare variables and constants.
  double radius;
  double length;
  double area;
  double volume;
  final double PI = 3.1415926539;
  String radiusString;
  String lengthString;

  // Read in radius and length.
  radiusString = JOptionPane.showInputDialog("Enter radius of cylinder:");
  radius = Double.parseDouble(radiusString);
  lengthString = JOptionPane.showInputDialog("Enter length of cylinder:");
  length = Double.parseDouble(lengthString);  
  
  // Calculate volume.
  area = PI*radius*radius;
  volume = area*length;
  
  // Output the volume.
  JOptionPane.showMessageDialog(null, "The volume of the cylinder is " + volume + ".");
  
 }
}