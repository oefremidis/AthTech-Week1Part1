public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "BMW";
        car1.year = 2016;
        System.out.println(car1.brand);
        System.out.println(car1.year);

        Driver driver1 = null;
        System.out.println(driver1);

        Driver driver2 = new Driver();
        System.out.println(driver2);

    }
}