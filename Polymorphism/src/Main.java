public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Suzuki suzuki = new Suzuki(8, "Suzuki Swift");
        System.out.println(suzuki.startEngine());
        System.out.println(suzuki.accelerate());
        System.out.println(suzuki.brake());

        Porsche porsche = new Porsche(8, "Porsche 911");
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Ferrari ferrari = new Ferrari(8, "Ferrari 812 GTS");
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

    }

}
