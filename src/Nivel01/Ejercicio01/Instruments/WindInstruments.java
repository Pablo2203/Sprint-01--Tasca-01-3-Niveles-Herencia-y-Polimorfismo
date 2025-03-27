package Nivel01.Ejercicio01.Instruments;

public class WindInstruments extends Instruments {
    public static String name = "Classic Wind Instrument";
    public WindInstruments(String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Wind Instrument is being played");
    }
}
