package decorator;

public abstract class DecoratorCar implements Car {
    private final Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    public String add() {
        return car.add();
    }
}
