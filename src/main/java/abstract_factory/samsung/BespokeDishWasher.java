package abstract_factory.samsung;

import abstract_factory.DishWasher;

public class BespokeDishWasher implements DishWasher {
    private static final String DESCRIPTION = "삼성 비스포크 식기 세척기입니다.";
    @Override
    public String getDescription() {
        return null;
    }
}
