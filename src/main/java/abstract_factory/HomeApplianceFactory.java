package abstract_factory;

public interface HomeApplianceFactory {
    Refrigerator createRefrigerator();

    DishWasher createDishWasher();

    AirCleaner createAirCleaner();
}
