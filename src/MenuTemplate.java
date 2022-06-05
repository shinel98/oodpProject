
public abstract class MenuTemplate {
	
	public MenuTemplate() {
		
		System.out.println("======================");
		showMenu();
		System.out.println("======================");
		System.out.print(">> ");
		
	}
	
	public abstract void showMenu();
}
