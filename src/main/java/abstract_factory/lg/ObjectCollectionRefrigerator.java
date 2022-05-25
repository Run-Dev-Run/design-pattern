package abstract_factory.lg;

import abstract_factory.Refrigerator;

public class ObjectCollectionRefrigerator implements Refrigerator {
    private static final String DESCRIPTION = "엘지 오브제 컬렉션 냉장고입니다.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
