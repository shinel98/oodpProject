
public class LoginFacade {
	Login login = new Login();
	LoginOption loginopt = new LoginOption();
	int choice;
	int subchoice;
	
	public int login() {
		choice = loginopt.show_loginOpt();
		if(choice == 1) {
			subchoice = login.login_check();
			if(subchoice == 0) {
				System.out.println("회원가입된 정보가 없습니다.\n");
				return 0;
			}
			else { 
				System.out.println("로그인 되었습니다.\n");
				return 1;
			}
		}
		else {
			subchoice = login.register();
			if(subchoice == 1) { 
				System.out.println("회원가입 되었습니다.\n");
				return 1;
			}
			else {
				System.out.println("회원가입에 실패했습니다.\n");
				return 0;
			}
		}
	}
	public void logoutCheck() {
		login.logout_check();
	}
}
