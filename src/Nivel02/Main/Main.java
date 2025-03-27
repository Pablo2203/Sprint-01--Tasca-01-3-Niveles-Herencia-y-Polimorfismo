package Nivel02.Main;

import Nivel02.Smartphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Smartphone T1 = new Smartphone("Galaxy 25","Samsung");

        String calling = T1.call("4480-9300");

        System.out.println(T1);
        System.out.println("---------------------------------------");
        System.out.println("Calling: " + calling);
        System.out.println("---------------------------------------");
        T1.takeAPicture();
        System.out.println("---------------------------------------");
        T1.alarm();
    }
}