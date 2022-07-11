package decorator;

public class DecoratorAutoEngine extends DecoratorCar {
    public DecoratorAutoEngine(Car car) {
        super(car);
    }

    @Override
    public String add() {
        String status = super.add() + " + [자동]";
        System.out.println(status);
        return status;
    }
}
