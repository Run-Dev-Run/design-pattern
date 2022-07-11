package decorator;

public class Decorator4wd extends DecoratorCar {
    public Decorator4wd(Car car) {
        super(car);
    }

    @Override
    public String add() {
        String status = super.add() + " + [4륜]";
        System.out.println(status);
        return status;
    }
}
