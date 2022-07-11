package decorator;

public class DefaultCar implements Car {
    @Override
    public String add() {
        String status = "깡통 제네시스";
        System.out.println(status);
        return status;
    }
}
