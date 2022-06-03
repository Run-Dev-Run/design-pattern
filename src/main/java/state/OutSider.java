package state;

public class OutSider implements EventState {
    @Override
    public void participate() {
        System.out.println("이벤트에 참여해주셔서 감사합니다!!");
        System.out.println("회원가입을 하신다면, 더 많은 혜택을 드려요!~");
    }

    @Override
    public void provide() {
        System.out.println("이벤트 참여 보상금 1000원");
        System.out.println("회원가입 페이지로 이동");
    }
}