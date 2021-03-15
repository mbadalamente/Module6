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
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please answer the following question on a scale from 1-10.");
		System.out.println("How ready do you feel for today?");
		int ready = myScanner.nextInt();
		System.out.println("Are you looking forward to today?");
		int forward = myScanner.nextInt();
		System.out.println("How are you feeling mentally?");
		int mental = myScanner.nextInt();
		System.out.println("How are you feeling physically?");
		int physical = myScanner.nextInt();
		System.out.println("How much energy do you have to give today?");
		int energy = myScanner.nextInt();
		System.out.println("How happy are you today?");
		int happiness = myScanner.nextInt();
		int total = ready+forward+mental+physical+energy+happiness;
		if (total < 30)
		{
			System.out.println("You should talk to someone about how you are feeling");
		} 
		else if (total < 40)
		{
			System.out.println("I hope your day goes well!");
		}
		else
		{
			System.out.println("I'm glad you are having a good start to your day! Keep it up!");
		}
		myScanner.close();
	}
	
	public static void zoomPreferences() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please answer the following questions.");
		System.out.println("On a scale from 1-10, how much will you participate in class today?");
		int participate = scan.nextInt();
		System.out.println("Will you put your camera on in class? 1 for yes, 2 for no.");
		int camera = scan.nextInt();
		if (camera == 1)
		{
			System.out.println("Great! Can't wait to see you in class today!");
		}
		else
		{
			System.out.println("Alright maybe another time, I hope your classes go well today!");
		}
	}
}
