public class Converter {

    Converter(){}

    public void toCelsius(double temp){
        System.out.println((temp-32.0)/1.8 + "C degrees");
    }

    public void toFahrenheit(double temp){
        System.out.println((temp*1.8)+32.0 + "F degrees");
    }

}
