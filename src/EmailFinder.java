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
	}
}
