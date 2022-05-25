package abstract_factory.lg;

import abstract_factory.DishWasher;

public class ObjectCollectionDishWasher implements DishWasher {
    private static final String DESCRIPTION = "엘지 오브제 컬렉션 식기 세척기입니다.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
