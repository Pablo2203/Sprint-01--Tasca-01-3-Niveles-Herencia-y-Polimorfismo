package Nivel01.Ejercicio01.Instruments;

public class StringedInstrument extends Instruments {

    public StringedInstrument(String name,double price) {
        super(name,price);
    }
    @Override
    public void play() {
        System.out.println("Stringed Instrument is being played");
    }
}
