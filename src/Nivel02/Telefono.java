package Nivel02;

public class Telefono {
    private String brand;
    private String model;

    public Telefono(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    public String call(String telephoneNumber){

        return telephoneNumber;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
