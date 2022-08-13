package observer.way2;

public class SubwayNoticePlatform {
    public static void main(String[] args) {
        SubwayPlatform platform = new SubwayPlatform();

        DefaultSubway1 defaultSubway1 = new DefaultSubway1();
        DefaultSubway2 defaultSubway2 = new DefaultSubway2();
        DefaultSubway3 defaultSubway3 = new DefaultSubway3();

        platform.attach(defaultSubway1);
        platform.attach(defaultSubway2);
        platform.attach(defaultSubway3);

        platform.notice("오늘의 운행을 멈춰요");
    }
}
