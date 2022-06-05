
public class NoLoggedIn implements State {
	
	private Login login;
	
	NoLoggedIn(Login login){
		this.login = login;
	}
	@Override
	public void getLogin() {
		// TODO Auto-generated method stub
		// 로그인을 했다면 로그인 상태로 이동 
		login.setState(login.getLoggedInState());
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("로그인이 되어 있지 않습니다.");
	}
	
}
