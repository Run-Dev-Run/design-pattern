package decorator;

public class DecoratorNavigation extends DecoratorCar {
    public DecoratorNavigation(Car car) {
        super(car);
    }

    @Override
    public String add() {
        String status = super.add() + " + [네비게이션]";
        System.out.println(status);
        return status;
    }
}
