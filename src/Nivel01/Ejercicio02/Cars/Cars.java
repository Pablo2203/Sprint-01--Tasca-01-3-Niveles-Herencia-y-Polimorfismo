package Nivel01.Ejercicio02.Cars;

public class Cars {
    private static final String BRAND = "BMW";
    private static String model;
    private final int POWER;

    public Cars(int POWER) {
        this.POWER = POWER;
    }

    public static void brake () {
        System.out.println("The vehicle is braking");
    }

    public void accelerate (){
        System.out.println("The vehicle is accelerating");

    }

    @Override
    public String toString() {
        return "Cars{" +
                "POWER=" + POWER +
                '}';
    }
}



