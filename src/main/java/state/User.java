package state;

public class User implements EventState {
    @Override
    public void participate() {
        System.out.println("이벤트에 참여해주셔서 감사합니다!!");
    }

    @Override
    public void provide() {
        System.out.println("이벤트 참여 보상금 10000원");
        System.out.println("메인 홈페이지로 이동");
    }
}
