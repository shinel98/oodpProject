
public class RecordMemento {
	private String title;
	private String date;
	private String content;
	
	public RecordMemento(String newTitle, String newDate, String newContent) {
		
		this.title = newTitle;
		this.date = newDate;
		this.content = newContent;
	
	}
	
	public String getSavedState() {
		return "title date 미팅기록이 복구 되었습니다";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
