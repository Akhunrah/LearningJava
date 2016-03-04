public class Temperature{
 public static void main(String[] args){

  double tempCelsius;
  double tempFahrenheit;
  double convertedToFahrenheit;
  double convertedToCelsius;
    
  System.out.println("Celsius  Fahrenheit      Fahrenheit  Celsius");
  

  for(int i=0; i<=9; i++){
   tempCelsius = 40.0 - i*1.0;
   tempFahrenheit = 120.0 -i*10.0;
   convertedToFahrenheit = celsiusToFahrenheit(tempCelsius);
   convertedToCelsius = fahrenheitToCelsius(tempFahrenheit);
   
   System.out.printf("%5.1f%12.1f%16.1f%10.2f%n",tempCelsius,convertedToFahrenheit,tempFahrenheit,convertedToCelsius);
  }
 }

 
 public static double celsiusToFahrenheit(double tempCelsius){
  double convertedTemperature = 9.0*tempCelsius/5.0 +32.0;
  return convertedTemperature;
 }

 public static double fahrenheitToCelsius(double tempFahrenheit){
  double convertedTemperature = (tempFahrenheit-32.0)*5.0/9.0;
  return convertedTemperature;
 }
 
}