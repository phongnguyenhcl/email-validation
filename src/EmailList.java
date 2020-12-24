import java.util.ArrayList;

public class EmailList {

	private ArrayList<String> emailList;
	
	public EmailList() {
		this.emailList = new ArrayList<>();
	}
	
	public void addMail(String emailID) {
		this.emailList.add(emailID);
	}
	
	public boolean searchEmailList(String emailID) {
		return this.emailList.contains(emailID) ? true : false;
	}
	
	public void printEmailList() {
		for (String emailID : this.emailList) {
			System.out.println(emailID);
		}
	}
}
