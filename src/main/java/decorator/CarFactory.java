package decorator;

public class CarFactory {
    public static void main(String[] args) {
        Car defaultCar = new DefaultCar();
        defaultCar.add();

        Car option1Car = new Decorator4wd(defaultCar);
        option1Car.add();

        Car option2Car = new DecoratorAutoEngine(option1Car);
        option2Car.add();
    }
}
