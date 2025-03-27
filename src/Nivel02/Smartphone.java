package Nivel02;

public class Smartphone extends Telefono implements Camera, Watch {
    public Smartphone(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void takeAPicture() {
        System.out.println("The phone is taking a picture");
    }
    @Override
    public void alarm() {
        System.out.println("The phone alarm is ringing");
    }
}
