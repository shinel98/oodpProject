
public class ChangedOptionDisplay implements OptionObserver, OptionDisplayElement {
	
	private String previousFontType;
	private String currentFontType;
	private String previousFontSize;
	private String currentFontSize;
	private String previousBackgroundSetting;
	private String currentBackgroundSetting;
	
	private OptionData optionData;

	public ChangedOptionDisplay(OptionData optionData) {
		this.optionData = optionData;
		optionData.registerOptionObserver(this);
	}
	
	public String getPreviousFontType() {
		return previousFontType;
	}
	
	public String getCurrentFontType() {
		return currentFontType;
	}	
	
	public String getPreviousFontSize() {
		return previousFontSize;
	}
	
	public String getCurrentFontSize() {
		return currentFontSize;
	}	
	
	public String getPreviousBackgroundSetting() {
		return previousBackgroundSetting;
	}
	
	public String getCurrentBackgroundSetting() {
		return currentBackgroundSetting;
	}	

	public boolean isSameString(String str1, String str2) {
		return str1.equals(str2);
	}
	
	public void update(String fontType, String fontSize, String backgroundSetting) {
        previousFontType = currentFontType;
        currentFontType = fontType;
        previousFontSize = currentFontSize;
        currentFontSize = fontSize;
        previousBackgroundSetting = currentBackgroundSetting;
        currentBackgroundSetting = backgroundSetting;
       
        if(previousFontType != null && (!isSameString(previousFontType, currentFontType) || !isSameString(previousFontSize, currentFontSize) || !isSameString(previousBackgroundSetting, currentBackgroundSetting)))
        	display();
	}

	public void display() {
		System.out.println("========================");
		System.out.println("변경된 사항 표시");
		System.out.println("------------------------");

		System.out.println("글꼴: " + previousFontType + " -> " + currentFontType);
		System.out.println("글자 크기: " + previousFontSize + " -> " + currentFontSize);
		System.out.println("배경화면: " + previousBackgroundSetting + " -> " + currentBackgroundSetting);
		
	}
	
}