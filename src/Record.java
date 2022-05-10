//Record�� ������ �پ��ϰ� ���� �� ���� �� ���� => ���ڵ� ������ ���� Ŭ���� �з� ����


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Record{
	
	static Scanner sc = new Scanner(System.in);
	private String title;
	private String date;
	private String content;
	private ArrayList<User> participants;
	
	public Record() {
		this.title = null;
		this.date = null;
		this.content = null;
	}
	
	public Record(String newTitle, String newDate, String newContent) {
		this.title = newTitle;
		this.date = newDate;
		this.content = newContent;
	}
	
	
	public void showParticipants() {
		
		System.out.print("Meeting participants: ");
		for(User s : participants)
		{
			System.out.println(s.getName() + " ");
		}
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title){ 
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
