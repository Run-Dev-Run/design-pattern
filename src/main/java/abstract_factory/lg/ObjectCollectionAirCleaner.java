package abstract_factory.lg;

import abstract_factory.AirCleaner;

public class ObjectCollectionAirCleaner implements AirCleaner {
    private static final String DESCRIPTION = "엘지 오브제 컬렉션 공기청정기입니다.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
