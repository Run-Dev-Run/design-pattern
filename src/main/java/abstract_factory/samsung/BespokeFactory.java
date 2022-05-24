package abstract_factory.samsung;

import abstract_factory.AirCleaner;
import abstract_factory.DishWasher;
import abstract_factory.HomeApplianceFactory;
import abstract_factory.Refrigerator;

public class BespokeFactory implements HomeApplianceFactory {
    @Override
    public Refrigerator createRefrigerator() {
        return new BespokeRefrigerator();
    }

    @Override
    public DishWasher createDishWasher() {
        return new BespokeDishWasher();
    }

    @Override
    public AirCleaner createAirCleaner() {
        return new BespokeAirCleaner();
    }
}
