import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OptionChange {
	
	private String fontType;
	private String fontSize;
	private String backgroudSetting;
	
	static Scanner sc = new Scanner(System.in);
	
	public OptionChange() {
		this.fontType = "맑은고딕";
		this.fontSize = "10.0";
		this.backgroudSetting = "기본화면";
	}
	
	public String getFontType() {
		return fontType;
	}
	public void setFontType(String fontType) {
		this.fontType = fontType;
	}
	public String getFontSize() {
		return fontSize;
	}
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	public String getBackgroundSetting() {
		return backgroudSetting;
	}
	public void setBackgroundSetting(String backgroundSetting) {
		this.backgroudSetting = backgroundSetting;
	}
	
	public int showMenu()
	{
		int choice;
		
		System.out.println("======================");
		System.out.println("1. 글꼴 변경");
		System.out.println("2. 글자 크기 변경");
		System.out.println("3. 배경 설정");
		System.out.println("4. 현재 적용되고 있는 옵션 확인");
		System.out.println("0. 메인메뉴로 돌아가기");
		System.out.println("======================");
		
		System.out.print(">> ");
		return sc.nextInt();
	}
		
	public void showCurrentOption()
	{
		System.out.println("현재 적용되고 있는 옵션");
		System.out.println("------------------------");

		System.out.printf("글꼴: %s\n", getFontType());
		System.out.printf("글자 크기: %s\n", getFontSize());
		System.out.printf("배경: %s\n", getBackgroundSetting());
		
		System.out.println("------------------------");
		System.out.println();
	}
	
	public void fontChange()
	{
		String font;
		
		System.out.println("------------------------");
		System.out.print("변경할 글꼴: ");
		sc.nextLine(); // trim \r
		font = sc.nextLine();
		
		System.out.print("현재 글꼴 < " + getFontType() + " > 에서 --> ");
		setFontType(font);
		System.out.println("선택한 글꼴 < " + getFontType() + " > (으)로 변경이 완료되었습니다.");

		System.out.println("------------------------");
		System.out.println();
	}
	
	public void fontsizeChange()
	{
		String fontsize;
		
		System.out.println("------------------------");
		System.out.print("변경할 글자 크기: ");
		sc.nextLine(); // trim \r
		fontsize = sc.nextLine();
		
		System.out.print("현재 글자 크기 < " + getFontSize() + " > 에서 --> ");
		setFontSize(fontsize);
		System.out.println("선택한 글자 크기 < " + getFontSize() + " > (으)로 변경이 완료되었습니다.");

		System.out.println("------------------------");
		System.out.println();
	}
	
	public void backgroundSetting()
	{
		String background;
		
		System.out.println("------------------------");
		System.out.print("변경할 배경화면: ");
		sc.nextLine(); // trim \r
		background = sc.nextLine();
		
		System.out.print("현재 배경화면 < " + getBackgroundSetting() + " > 에서 --> ");
		setBackgroundSetting(background);
		System.out.println("선택한 배경 < " + getBackgroundSetting() + " > (으)로 변경이 완료되었습니다.");

		System.out.println("------------------------");
		System.out.println();
	}

}