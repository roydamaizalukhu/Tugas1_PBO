public class KonversiSuhu {
    public static final double REAMUR_TO_CELSUS = 0.8;
    public static final double REAMUR_TO_FAHRENHEIT = ((9 / 5) * REAMUR_TO_CELSUS) + 32;
    public static final double REAMUR_TO_KELVIN = REAMUR_TO_CELSUS + 273.15;

    public static void main(String[] args) {
        // Menetapkan suhu Reamur secara langsung
        double suhuReamur = 80;
        
        double suhuCelsius = suhuReamur * REAMUR_TO_CELSUS;
        double suhuFahrenheit = Math.round((suhuReamur * REAMUR_TO_FAHRENHEIT) * 100) / 100;
        double suhuKelvin = suhuReamur * REAMUR_TO_KELVIN;
        
        System.out.println("Suhu Reamur\t:\t" + suhuReamur + "\u00B0R");
        System.out.println("Suhu Celsius \t:\t" + suhuCelsius + "\u00B0C");
        System.out.println("Suhu Fahrenheit \t:\t" + suhuFahrenheit + "\u00B0F");
        System.out.println("Suhu Kelvin     \t:\t" + suhuKelvin + "\u212A");
    }
}