import utils.CarWithLombok;

public class App {
    public static void main(String[] args) {
        CarWithLombok carWithLombok1 = new CarWithLombok(
            "GLE",
            "Mercedes",
            2020,
            350_000,
            "white",
            5
        );

        CarWithLombok carWithLombok2 = new CarWithLombok(
            "GLC",
            "Mercedes",
            2023,
            200_000,
            "silver",
            5
        );

        System.out.println(carWithLombok1);
        System.out.println(carWithLombok2);
        System.out.println(carWithLombok1.getColor());

        System.out.println("Are the cars equal? " + carWithLombok1.equals(carWithLombok2));
        System.out.println("HashCode of Car 1: " + carWithLombok1.hashCode());
        System.out.println("HashCode of Car 2: " + carWithLombok2.hashCode());

        carWithLombok1.setColor("black");
        System.out.println(carWithLombok1.getColor());
        System.out.println(carWithLombok1.getYear());
    }
}
