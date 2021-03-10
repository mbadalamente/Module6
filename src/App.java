import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to our app! I hope you are doing well! What would you like to do today?");
		System.out.println("Enter the number of the option you would like.");
		System.out.println("1. Look at coursework \n2. Check on mental health \n3. Update zoom preferences");
		
		int userPick = console.nextInt();
		
		// calls the method based on the option the user picks 
		if(userPick == 1) {
			coursework();
		}
		else if(userPick == 2) {
			mentalHealth();
		}
		else if(userPick == 3) {
			zoomPreferences();
		}
	}
	
	
	public static void coursework() {
		
	}
	
	public static void mentalHealth() {
		
	}
	
	public static void zoomPreferences() {
		
	}
}
