package Nivel01.Ejercicio02.Cars.Main;

import Nivel01.Ejercicio02.Cars.Cars;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cars.brake();
        Cars X3 = new Cars(1000);
        X3.accelerate();


        System.out.println(X3);


    }
}
