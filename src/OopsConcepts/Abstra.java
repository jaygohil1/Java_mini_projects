package OopsConcepts;

public class Abstra {
    public static void main(String[] args) {
//        Bike b = new Bike();
        Bike fb = new FuelBike();
        Bike ec = new ElectricBike();
        fb.start();
        fb.accelerate();

        ec.start();
        ec.accelerate();

    }
}

abstract class Bike {
    void start() {
        System.out.println("Ready to Race");
    }

    abstract void accelerate();//No body for abstract method
//        System.out.println("Unleashing");


    abstract void brake();
//        System.out.println("Hold yo horses");

}


class FuelBike extends Bike {
    @Override
    void accelerate() {
        System.out.println("Enjoy PetrolHead");
    }

    @Override
    void brake() {
        System.out.println("Hold yo horses");
    }
}

class ElectricBike extends Bike {
    @Override
    void accelerate() {
        System.out.println("Big L");
    }

    @Override
    void brake() {
        System.out.println("Absolute Trashhh");
    }
}


