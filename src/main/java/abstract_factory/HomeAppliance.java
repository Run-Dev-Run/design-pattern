package abstract_factory;

import abstract_factory.lg.ObjectCollectionFactory;
import abstract_factory.samsung.BespokeFactory;

public class HomeAppliance {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private AirCleaner airCleaner;

    public static class FactoryMaker {

        public enum HomeApplianceType {
            OBJECT_COLLECTION,
            BESPOKE
        }

        public static HomeApplianceFactory makeFactory(HomeApplianceType type) {
            switch (type) {
                case OBJECT_COLLECTION:
                    return new ObjectCollectionFactory();
                case BESPOKE:
                    return new BespokeFactory();
                default:
                    throw new IllegalArgumentException("없는 가전 제품군입니다.");
            }
        }
    }

}
