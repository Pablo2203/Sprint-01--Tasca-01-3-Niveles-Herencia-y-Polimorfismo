package Nivel01.Ejercicio01.Instruments.Main;

import Nivel01.Ejercicio01.Instruments.PercussionInstrument;
import Nivel01.Ejercicio01.Instruments.StringedInstrument;
import Nivel01.Ejercicio01.Instruments.WindInstruments;



public class Main {
    public static void main(String[] args) {
        WindInstruments flute = new WindInstruments("Flute", 120.50);
        WindInstruments saxophone = new WindInstruments("Saxophone", 850.00);

        StringedInstrument guitar = new StringedInstrument("Guitar", 300.00);
        StringedInstrument violin = new StringedInstrument("Violin", 450.00);

        PercussionInstrument drum = new PercussionInstrument("Drum", 200.00);
        PercussionInstrument maracas = new PercussionInstrument("Maracas", 35.75);

        System.out.println(flute);
        System.out.println(saxophone);
        System.out.println(guitar);
        System.out.println(violin);
        System.out.println(drum);
        System.out.println(maracas);

        flute.play();
        drum.play();
        violin.play();
    }
}
