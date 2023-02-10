package scheduler;

import java.util.Iterator;
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
		days[] d = new days[7];
		Activity<Integer, String> act = new Activity<Integer, String>();
		
		Scanner scanDay = new Scanner(System.in);
		String day = scanDay.nextLine();
		System.out.println("What day would you like to interact with?");
		
		String dayInfo;
		
		Scanner scanAction = new Scanner(System.in);
		String action = scanAction.nextLine();
		System.out.println("Would you like to add, view, or remove events?");

		String input;
		switch (action) {

		case ("add"):
			Scanner scanAdd = new Scanner(System.in);
			input = scanAction.nextLine();
			System.out.println("What would you like to add?");
			switch (day) {

			case ("monday"):
				days.MONDAY.daysList.add(input);
			case ("tuesday"):
				days.TUESDAY.daysList.add(input);
			case ("wednesday"):
				days.WEDNESDAY.daysList.add(input);
			case ("thursday"):
				days.THURSDAY.daysList.add(input);
			case ("friday"):
				days.FRIDAY.daysList.add(input);
			case ("saturday"):
				days.SATURDAY.daysList.add(input);
			case ("sunday"):
				days.SUNDAY.daysList.add(input);
				
			}
			
			try(input == ) {
				
			} catch(SchedulingConflictException e) {
				
			}
			
		case ("view"):
			Scanner scanView = new Scanner(System.in);
			input = scanView.nextLine();
			System.out.println("What day would you like to view?");
			switch (day) {

			case ("monday"):
				days.MONDAY.
			case ("tuesday"):
				days.TUESDAY.daysList.add(input);
			case ("wednesday"):
				days.WEDNESDAY.daysList.add(input);
			case ("thursday"):
				days.THURSDAY.daysList.add(input);
			case ("friday"):
				days.FRIDAY.daysList.add(input);
			case ("saturday"):
				days.SATURDAY.daysList.add(input);
			case ("sunday"):
				days.SUNDAY.daysList.add(input);
				
			}
		case ("remove"):
			Scanner scanRemove = new Scanner(System.in);
			input = scanRemove.nextLine();
			System.out.println("What would you like to remove?");
			switch (day) {

			case ("monday"):
				days.MONDAY.daysList.remove();
			case ("tuesday"):
				days.TUESDAY.daysList.remove();
			case ("wednesday"):
				days.WEDNESDAY.daysList.remove();
			case ("thursday"):
				days.THURSDAY.daysList.remove();
			case ("friday"):
				days.FRIDAY.daysList.remove();
			case ("saturday"):
				days.SATURDAY.daysList.remove();
			case ("sunday"):
				days.SUNDAY.daysList.remove();
				
			}
		} //default("error");
	}

	enum days {
		MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(), FRIDAY(), SATURDAY(), SUNDAY();
		LinkedList<Integer> daysList = new LinkedList<Integer>();
	}
	
	void sortTime(int time) {
		for (int i = 0; i < array.length; i++) {
			
		}
	}
}
