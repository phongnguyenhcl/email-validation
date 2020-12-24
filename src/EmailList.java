import java.util.ArrayList;

public class EmailList {

	private ArrayList<String> emailList;
	
	public EmailList() {
		this.emailList = new ArrayList<>();
	}
	
	public void addMail(String emailID) {
		this.emailList.add(emailID);
	}
	
	public boolean containsEmailID(String emailID) {
		return this.emailList.contains(emailID) ? true : false;
	}
	
	public void printEmailList() {
		int i = 1;
		for (String emailID : this.emailList) {
			System.out.printf("%d: %s\n", i, emailID);
			i++;
		}
	}
}
