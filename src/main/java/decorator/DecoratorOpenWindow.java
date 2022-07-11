package decorator;

public class DecoratorOpenWindow extends DecoratorCar {
    public DecoratorOpenWindow(Car car) {
        super(car);
    }

    @Override
    public String add() {
        String status = super.add() + " + [오픈형 창문]";
        System.out.println(status);
        return status;
    }
}
