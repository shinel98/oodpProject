import java.util.Scanner;

public class LoginOption {
	Scanner sc = new Scanner(System.in);
	public int show_loginOpt() {
		int choice;
		while(true) {
			System.out.println("0.나가기");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.print("=> ");
			choice = sc.nextInt();
			sc.nextLine();
			if(choice == 0) {
				System.out.println("Exit program");
				System.exit(1);
			}
			if(choice == 1 || choice == 2)
				break;
			System.out.println("옵션에서 골라주세요.");
		}
		return choice;
	}
}
