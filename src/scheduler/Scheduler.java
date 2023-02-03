package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {

	public static void main(String[] args) {
		Scanner scanDay = new Scanner(System.in);
		String day = scanDay.nextLine();
		System.out.println("What day would you like to interact with?");
		
		String dayInfo;
		
		switch (day) {

		case ("monday"):
			days.MONDAY.values();
		case ("tuesday"):
			days.TUESDAY.values();
		case ("wednesday"):
			days.WEDNESDAY.values();
		case ("thursday"):
			days.THURSDAY.values();
		case ("friday"):
			days.FRIDAY.values();
		case ("saturday"):
			days.SATURDAY.values();
		case ("sunday"):
			days.SUNDAY.values();
			
		}
		
		Scanner scanAction = new Scanner(System.in);
		String action = scanAction.nextLine();
		System.out.println("Would you like to add, view, or remove events?");

		String input;
		switch (action) {

		case ("add"):
			Scanner scanAdd = new Scanner(System.in);
			input = scanAction.nextLine();
			System.out.println("What would you like to add?");
		case ("view"):
			Scanner scanView = new Scanner(System.in);
			input = scanView.nextLine();
			System.out.println("What day would you like to view?");
		case ("remove"):
			Scanner scanRemove = new Scanner(System.in);
			input = scanRemove.nextLine();
			System.out.println("What would you like to remove?");
			
		} //default("error");
	}

	enum days {
		MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(), FRIDAY(), SATURDAY(), SUNDAY()
	}
}
