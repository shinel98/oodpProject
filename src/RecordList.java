import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RecordList {
	
	static Scanner sc = new Scanner(System.in);
	private ArrayList<Record> recordList = new ArrayList<Record>();
	

	
	public void showRecord()
	{
		if(recordList.isEmpty() == true)
			System.out.println("저장된 기록이 없습니다");
		
		else
		{
			Record c;
			int i=1;
			
			System.out.println("번호  제목  날짜");
			System.out.println("------------------------");
			
			Iterator<Record> iter = recordList.iterator();
			
			while(iter.hasNext()) {
				c = (Record)iter.next();
				System.out.printf("%d  %s  %s\n", i++ ,c.getTitle(), c.getDate());
			}
			System.out.println("------------------------");
			System.out.println();
		}
	}
	
	public void addRecord()
	{
		Record newRecord = new Record();
		//sc.nextLine();
		
		System.out.print("미팅 제목을 입력하세요: ");
		newRecord.setTitle(sc.nextLine());
		
		System.out.print("미팅 날짜을 입력하세요: ");
		newRecord.setDate(sc.nextLine());
		
		System.out.print("미팅 내용을 입력하세요: ");
		newRecord.setContent(sc.nextLine());
		
		recordList.add(newRecord);	
	}
	
	public void deleteRecord()
	{
		if(recordList.isEmpty() == true)
			System.out.println("저장된 기록이 없습니다");
		
		else 
		{
			showRecord();
			int del_num;
			
			System.out.print("삭제할 기록 번호: ");
			del_num = sc.nextInt();
			recordList.remove(del_num-1);
		}
	}
	
	public void modifyRecord()
	{
		int num=0;
		if(recordList.isEmpty() != true)
		{
			showRecord();
			
			System.out.print("수정할 기록 번호: ");
			num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("수정할 이름: ");
			recordList.get(num-1).setTitle(sc.nextLine());
			
			System.out.print("수정할 날짜: ");
			recordList.get(num-1).setDate(sc.nextLine());
			
			System.out.print("수정할 내용: ");
			recordList.get(num-1).setContent(sc.nextLine());
		}
		
		else
			System.out.println("저장된 미팅기록이 없습니다.");
			
	}

}
