
public class CurrentOptionDisplay implements OptionObserver, OptionDisplayElement {
		
	private String fontType;
	private String fontSize;
	private String backgroundSetting;
	
	private OptionData optionData;
	
	public CurrentOptionDisplay(OptionData optionData) {
		this.optionData = optionData;
		optionData.registerOptionObserver(this);
	}
	
	public void update(String fontType, String fontSize, String backgroundSetting) {
		this.fontType = fontType;
		this.fontSize = fontSize;
		this.backgroundSetting = backgroundSetting;
		display();
	}
	
	public void display() {
		System.out.println("현재 적용되고 있는 옵션");
		System.out.println("------------------------");
		System.out.println("글꼴: " + fontType);
		System.out.println("글자 크기: " + fontSize);
		System.out.println("배경화면: " + backgroundSetting);
	}
	
}