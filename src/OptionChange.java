import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OptionChange extends OptionData {
	
	/*protected String fontType;
	protected String fontSize;
	protected String backgroundSetting;*/
	
	static Scanner sc = new Scanner(System.in);
	private OptionData optionData = new OptionData();
	private CurrentOptionDisplay currentDisplay = new CurrentOptionDisplay(optionData);
	private ChangedOptionDisplay changedDisplay = new ChangedOptionDisplay(optionData);
	
	public OptionChange() {
		this.fontType = "맑은고딕";
		this.fontSize = "10.0";
		this.backgroundSetting = "기본화면";
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
		return backgroundSetting;
	}
	public void setBackgroundSetting(String backgroundSetting) {
		this.backgroundSetting = backgroundSetting;
	}
	
	public boolean isSameString(String str1, String str2) {
		return str1.equals(str2);
	}
	
		
	public void showCurrentOption()
	{
		//CurrentOptionDisplay currentDisplay = new CurrentOptionDisplay(optionData);
		
		/*if(changedDisplay.getPreviousFontType() == null || changedDisplay.getPreviousFontSize() == null || changedDisplay.getPreviousBackgroundSetting() == null) {
			optionData.removeOptionObserver(changedDisplay);
			System.out.println("------------------------");
			System.out.println("변경된 사항이 없습니다.");
			System.out.println("========================");
		}
		
		else
			optionData.registerOptionObserver(changedDisplay);*/
		
		if(changedDisplay.getPreviousFontType() == null || changedDisplay.getPreviousFontSize() == null || changedDisplay.getPreviousBackgroundSetting() == null)
			optionData.setOptions(fontType, fontSize, backgroundSetting);
		
		else
			optionData.setOptions(changedDisplay.getCurrentFontType(), changedDisplay.getCurrentFontSize(), changedDisplay.getCurrentBackgroundSetting());
		
		System.out.println("------------------------");
		System.out.println();
	}
	
	public void fontChange()
	{
		String font;
		//ChangedOptionDisplay changedDisplay = new ChangedOptionDisplay(optionData);
		
		System.out.println("------------------------");
		System.out.print("변경할 글꼴: ");
		//sc.nextLine(); // trim \r
		font = sc.nextLine();
		
		/*if(isSameString(font, fontType)) {
			optionData.removeOptionObserver(changedDisplay);
			System.out.println("------------------------");
			System.out.println("변경된 사항이 없습니다.");
			System.out.println("========================");
		}
		
		else
			optionData.registerOptionObserver(changedDisplay);*/
		
		optionData.setOptions(font, optionData.getFontSize(), optionData.getBackgroundSetting());
		System.out.println("------------------------");
		System.out.println();
	}
	
	public void fontsizeChange()
	{
		String fontsize;
		//ChangedOptionDisplay changedDisplay = new ChangedOptionDisplay(optionData);
		
		System.out.println("------------------------");
		
		System.out.print("변경할 글자 크기: ");
		//sc.nextLine(); // trim \
		fontsize = sc.nextLine();
		
		/*if(isSameString(fontsize, fontSize)) {
			optionData.removeOptionObserver(changedDisplay);
			System.out.println("------------------------");
			System.out.println("변경된 사항이 없습니다.");
			System.out.println("========================");
		}
		
		else
			optionData.registerOptionObserver(changedDisplay);*/
		
		optionData.setOptions(optionData.getFontType(), fontsize, optionData.getBackgroundSetting());

		System.out.println("------------------------");
		System.out.println();
	}
	
	public void backgroundSetting()
	{
		String background;
		//ChangedOptionDisplay changedDisplay = new ChangedOptionDisplay(optionData);
		
		System.out.println("------------------------");
		
		System.out.print("변경할 배경화면: ");
		//sc.nextLine(); // trim \r
		background = sc.nextLine();
		
		/*if(isSameString(background, backgroundSetting)) {
			optionData.removeOptionObserver(changedDisplay);
			System.out.println("------------------------");
			System.out.println("변경된 사항이 없습니다.");
			System.out.println("========================");
		}
		
		else
			optionData.registerOptionObserver(changedDisplay);*/
		
		optionData.setOptions(optionData.getFontType(), optionData.getFontSize(), background);

		System.out.println("------------------------");
		System.out.println();
	}

}