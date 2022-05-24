package abstract_factory.lg;

import abstract_factory.AirCleaner;
import abstract_factory.DishWasher;
import abstract_factory.HomeApplianceFactory;
import abstract_factory.Refrigerator;

public class ObjectCollectionFactory implements HomeApplianceFactory {
    @Override
    public Refrigerator createRefrigerator() {
        return new ObjectCollectionRefrigerator();
    }

    @Override
    public DishWasher createDishWasher() {
        return new ObjectCollectionDishWasher();
    }

    @Override
    public AirCleaner createAirCleaner() {
        return new ObjectCollectionAirCleaner();
    }
}
