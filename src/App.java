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
				System.out.println("Zoom: \nRoom Code:428 421 2414\n Passcode:Classiscool");
			}
		} else {
			System.out.println("Sorry you entered an invalid Student ID.");
		}
	}
	
	public static void mentalHealth() {
		
	}
	
	public static void zoomPreferences() {
		
	}
}