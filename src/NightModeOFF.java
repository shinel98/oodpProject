
public class NightModeOFF implements State_DisplayMode {
	
    private static NightModeOFF off = new NightModeOFF(); // OFF 클래스의 인스턴스로 초기화됨
    NightModeOFF() { }
    
    public static NightModeOFF getInstance() { // 초기화된 OFF 클래스의 인스턴스를 반환함
        return off;
    }
    
    public void on_button_pushed(DisplayMode mode){ // Off 상태일 때 On 버튼을 눌러도 On 상태임
        mode.setState(NightModeON.getInstance());
        System.out.println("야간 모드 적용이 설정되었습니다.");
    }
    
    public void off_button_pushed(DisplayMode mode){ // Off 상태일 때 Off 버튼을 눌러도 변화 없음
        System.out.println("반응 없음");
    }
    
}