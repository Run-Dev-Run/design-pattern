package abstract_factory.samsung;

import abstract_factory.AirCleaner;

public class BespokeAirCleaner implements AirCleaner {
    private static final String DESCRIPTION = "삼성 비스포크 공기청정기입니다.";

    @Override
    public String getDescription() {
        return null;
    }
}
