import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Press (1) for Fahrenheit to Celsius and (2) for Celsius to Fahrenheit ");
        int i = scan.nextInt();
        Converter converter = new Converter();
        if(i  == 1) {
            System.out.println("Type the temperature in Celsius");
            double temp = scan.nextDouble();
            converter.toCelsius(temp);
        }
        else if(i == 2) {
            System.out.println("Type the temperature in Fahrenheit");
            double temp = scan.nextDouble();
            converter.toFahrenheit(temp);
        }
        else
            System.out.println("You can only use 1 or 2!!");
    }

}