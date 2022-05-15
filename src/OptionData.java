import java.util.List;
import java.util.ArrayList;

public class OptionData implements OptionSubject {
	
	private List<OptionObserver> observers;
	protected String fontType;
	protected String fontSize;
	protected String backgroundSetting;
	
	public OptionData() {
		observers = new ArrayList<OptionObserver>();
	}
	
	public void registerOptionObserver(OptionObserver o) {
		observers.add(o);
	}
	
	public void removeOptionObserver(OptionObserver o) {
		observers.remove(o);
	}
	
	public void notifyOptionObservers() {
		for (OptionObserver observer : observers) {
			observer.update(fontType, fontSize, backgroundSetting);
		}
	}
	
	public void optionsChanged() {
		notifyOptionObservers();
	}
	
	public void setOptions(String ftType, String ftSize, String bgSetting) {
		fontType = ftType;
		fontSize = ftSize;
		backgroundSetting = bgSetting;
		optionsChanged();
	}

	public String getFontType() {
		return fontType;
	}
	
	public String getFontSize() {
		return fontSize;
	}
	
	public String getBackgroundSetting() {
		return backgroundSetting;
	}

}