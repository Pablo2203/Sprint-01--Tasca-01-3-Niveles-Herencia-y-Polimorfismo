package Nivel01.Ejercicio01.Instruments;

public class PercussionInstrument extends Instruments {
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Percussion Instrument is being played");
    }

}
