import java.util.Scanner;

public class Option {
	
	static Scanner sc = new Scanner(System.in);
	private String fontType = "바탕체";
	private int fontSize = 5;
	private boolean isAlarm = false;
	private String background = "default";
	
	public int showMenu()
	{
		int choice;
		
		System.out.println("======== Option ========");
		System.out.println("1. 폰트 종류 변경");
		System.out.println("2. 폰트 크기 변경");
		System.out.println("3. 알람 설정");
		System.out.println("4. 배경 설정");
		System.out.println("5. 설정보기");
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("========================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}
	
	public void showOption() {
		System.out.println("폰트 종류: " + getFontType());
		System.out.println("폰트 크기: " + getFontSize());
		System.out.println("알람 설정: " + getisAlarm());
		System.out.println("배경 종류: " + getBackground());
	}
	
	public String getFontType() {
		return fontType;
	}
	
	public void setFontType() {
		
		String font;
		
		sc.nextLine();
		System.out.print("원하는 폰트 이름을 입력하세요: ");
		font = sc.nextLine();
		this.fontType = font;
	}
	
	public int getFontSize() {
		return fontSize;
	}
	
	public void setFontSize() {
		
		int size;
		
		System.out.print("폰트 크기를 입력하세요: ");
		size = sc.nextInt();
		this.fontSize = size;
	}
	
	public boolean getisAlarm() {
		return isAlarm;
	}
	
	public void setisAlarm() {
		
		char c;
		
		System.out.print("알람수신을 원하시면 y, 원치 않으시면 n을 입력하세요. ");
		c = sc.next().charAt(0);
		
		if(c == 'y')
			this.isAlarm = true;
		else if(c == 'n')
			this.isAlarm = false;
		else
			System.out.println("잘못 입력하셨습니다.");
	}
	
	public String getBackground() {
		return background;
	}
	
	public void setBackground() {
		String newBackGround;
		
		sc.nextLine();
		System.out.print("원하는 배경사진을 입력하세요: ");
		newBackGround = sc.nextLine();
		this.background = newBackGround;
	}
	
}
