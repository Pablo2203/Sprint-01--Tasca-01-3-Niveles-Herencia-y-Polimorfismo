package Nivel01.Ejercicio01.Instruments;

public class WindInstruments extends Instruments {
    public WindInstruments(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Wind Instrument is being played");
    }
}
