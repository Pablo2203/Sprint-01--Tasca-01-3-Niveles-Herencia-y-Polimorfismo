package Nivel01.Ejercicio01.Instruments;

abstract class Instruments {
        private String name;
        private double price;
        private static double orchestraMembers;

    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;

    }
        static {
            orchestraMembers = 20;
            System.out.println("Orchestra Members:" + orchestraMembers);
        }


        public abstract void play();



        @Override
        public String toString() {
            return "Nivel01.Nivel01.Ejercicio01.Instruments.Instruments{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


