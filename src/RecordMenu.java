import java.util.Scanner;

public class RecordMenu extends MenuTemplate{
	
	static Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		
		System.out.println("1.기록 조회");
		System.out.println("2.기록 추가");
		System.out.println("3.기록 삭제");
		System.out.println("4.기록 수정");
		System.out.println("0.메인메뉴로 돌아가기");
		System.out.println("======================");
		
		System.out.print(">> ");
		
	}

}
