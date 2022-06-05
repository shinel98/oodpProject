
public class LoggedIn implements State{

	private Login login;
	
	LoggedIn(Login login){
		this.login = login;
	}
	
	@Override
	public void getLogin() {
		// TODO Auto-generated method stub
		System.out.println("이미 로그인 되어 있습니다.");
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		login.setState(login.getNoLoggedInState());
		System.out.println("로그아웃 되었습니다.");
	}
	

}
