import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFinder {

	public static void main(String[] args) throws FileNotFoundException {
		
		EmailList emailList = new EmailList();
		
		File emailFile = new File("src/email-list.txt");
		Scanner scanner = new Scanner(emailFile);
		
		Pattern emailPattern = Pattern.compile("[a-zA-Z0-9\\-\\.\\_]*@[a-zA-Z0-9\\-\\.\\_]*");
		Matcher m;
		while (scanner.hasNextLine()) {
			m = emailPattern.matcher(scanner.nextLine());
			if (m.find()) {
				emailList.addMail(m.group());
			}
		}
		System.out.println("Emails have been added to the list!!!\n");
		scanner.close();
		
		Scanner inputScanner = new Scanner(System.in);
		
		boolean keepUsing = true;
		while(keepUsing) {
			System.out.println("Select an option number (1) - Search for an email (2) - Print email list (0) - Exit");
			int option = inputScanner.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("\nEnter an email to search: ");
					inputScanner.nextLine();
					String emailID = inputScanner.nextLine();
					
					if (emailList.containsEmailID(emailID)) {
						System.out.printf("%s is in the email list!\n\n", emailID);
						continue;
					}
					System.out.printf("Don't have %s in the list\n", emailID);
					break;
				case 2:
					emailList.printEmailList();
					break;
				case 0:
					keepUsing = false;
					break;
			}
			System.out.println();
		}
		inputScanner.close();
	}
}
