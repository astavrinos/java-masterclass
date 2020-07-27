public class Main {

    public static void main(String[] args) {
//        Vehicle firstCar = new Car();
//        firstCar.setColor("Green");
//        System.out.println(firstCar.color);
//
//        firstCar = new Suzuki();
//
//        Vehicle swift = new Suzuki();
//        swift.setColor("green");
//        swift.setEngine("V8");
//        swift.setSeats(4);
//        swift.setWheels(4);
//
//        System.out.println("Seats: " + swift.getSeats());
//        System.out.println("Engine: " + swift.getEngine());
//        System.out.println("Color: " + swift.getColor());
//        System.out.println("Wheels: " + swift.getWheels());

        Vehicle firstCar = new Car(4,"Type A",4,"Yellow", 2, 3,false);
        System.out.println(firstCar.getWheels());
        System.out.println(firstCar.getColor());
        System.out.println(firstCar.getEngine());
        System.out.println(firstCar.getSeats());


        System.out.println();

        Car swift2 = new Suzuki();
        System.out.println(swift2.toString());

    }

}
