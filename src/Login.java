import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Login {
	private State currentState;
	private State noLoggedInState;
	private State LoggedInState;
	private String id = null;
	private String pw = null;
	private Scanner sc = new Scanner(System.in);
	private static Login login = new Login();

	
	
	public Login() {
		// 처음엔 Login이 안된 상태 (NoLoggedIn)
		this.LoggedInState = new LoggedIn(this);
		this.noLoggedInState = new NoLoggedIn(this);
				
		this.currentState = noLoggedInState;
	}
	//회원 가입
	public int register() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("register.txt", true));
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("ID: ");
			id = sc.nextLine();
			System.out.print("PW: ");
			pw = sc.nextLine();
			
			bw.write(id);
			bw.newLine();
			bw.write(pw);
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return 1;	
	}
	// 로그인한 정보가 파일에 저장되어있는지 확인  
	public int login_check() {
		String input_id;
		String input_pw;
		try {
			BufferedReader br = new BufferedReader(new FileReader("register.txt"));
			System.out.print("ID: ");
			input_id = sc.nextLine();
			System.out.print("PW: ");
			input_pw = sc.nextLine();
			while((id = br.readLine()) != null) {
				if(id.equals(input_id)) {
					pw = br.readLine();
					if(pw.equals(input_pw)) {
						br.close();
						// 로그인 상태로 이동 
						currentState.getLogin();
						return  1;
					}
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return 0;
	}
	

	public static Login getInstance() {
		return login;
	}

	public void setState(State newState) {
		this.currentState = newState;
	}
	
	public State getLoggedInState() {
		return LoggedInState;
	}
	
	public State getNoLoggedInState() {
		return noLoggedInState;
	}
	
	public void logout_check() {
		currentState.printMessage();
	}
	
}
