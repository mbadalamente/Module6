import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to our app! I hope you are doing well! \nWhat would you like to do today?");
		System.out.println("Enter the number of the option you would like:");
		System.out.println("\t1. Coursework \n\t2. Mental health \n\t3. Zoom preferences");
		
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
		else {
			System.out.println("Please enter a valid number");
		}
	}
	
	
	public static void coursework() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your Quinnipiac Student ID number.");
		int idNum = console.nextInt();
		if(idNum > 100000 ){
			System.out.println("Welcome what course would you like to access?");
			System.out.println("CSC 109 \nCSC 340  \nSO 101 \nSCI 102 \nENR 395");
			console.nextLine();
			String course = console.nextLine();
			System.out.println("What do you want to access in " + course);
			System.out.println("1.Assignments \n2.Grades \n3.Zoom");
			int studPick = console.nextInt();
			if(studPick == 1){
				System.out.println("Assignments: \nHomework #3 Due 3/19 \nHomework #4 Due 4/20");
			} else if(studPick == 2){
				System.out.println("Grades: \nHomework #1 20/20 \nHomework #2 18/20");
			}else if(studPick == 3){
				System.out.println("Zoom: \nRoom Code:428 421 2414\nPasscode:Classiscool");
			}
		} else {
			System.out.println("Sorry you entered an invalid Student ID.");
		}
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
