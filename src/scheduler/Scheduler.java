package scheduler;

import java.util.ArrayList;
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
	// why static?
	static LinkedList<String> monday = new LinkedList<String>();
	static LinkedList<String> tuesday = new LinkedList<String>();
	static LinkedList<String> wednesday = new LinkedList<String>();
	static LinkedList<String> thursday = new LinkedList<String>();
	static LinkedList<String> friday = new LinkedList<String>();
	static LinkedList<String> saturday = new LinkedList<String>();
	static LinkedList<String> sunday = new LinkedList<String>();
	static days[] weekEvents;

	public static void main(String[] args) {
		Scanner scanAction = new Scanner(System.in);
		System.out.println("To add an event type A, to remove type R, to view an event type V");
    	String action = scanAction.nextLine();
    	
    	if (action.equals("A")) {
    		System.out.println("What event would you like to enter and at what time?");
    		String eventChoice = scanAction.nextLine();
    		
    		System.out.println("What day do you want the String on");
    		String day = scanAction.nextLine();
    		
    		add(eventChoice,day);
    	} 
    	else if (action.equals("R")) {
    		System.out.println("What time is the event you would like remove?");
    		String time = scanAction.nextLine();
    		
    		System.out.println("What day is the String you want to remove?");
    		String day = scanAction.nextLine();
    		
    		remove(time, day);
    	} 
    	else {
    		System.out.println("What day do you want to view");
    		String day = scanAction.nextLine();
    		view(day);
    	}
    }
//		String input;
//		switch (action) {

//		case ("add"):
//			Scanner scanAdd = new Scanner(System.in);
//			input = scanAction.nextLine();
//			System.out.println("What would you like to add?");
//			switch (day) {
//
//			case ("monday"):
//				days.MONDAY.daysList.add(input);
//			case ("tuesday"):
//				days.TUESDAY.daysList.add(input);
//			case ("wednesday"):
//				days.WEDNESDAY.daysList.add(input);
//			case ("thursday"):
//				days.THURSDAY.daysList.add(input);
//			case ("friday"):
//				days.FRIDAY.daysList.add(input);
//			case ("saturday"):
//				days.SATURDAY.daysList.add(input);
//			case ("sunday"):
//				days.SUNDAY.daysList.add(input);
//				
//			}
//			
//			try(input == ) {
//				
//			} catch(SchedulingConflictException e) {
//				
//			}
//			
//		case ("view"):
//			Scanner scanView = new Scanner(System.in);
//			input = scanView.nextLine();
//			System.out.println("What day would you like to view?");
//			switch (day) {
//
//			case ("monday"):
//				days.MONDAY.
//			case ("tuesday"):
//				days.TUESDAY.daysList.add(input);
//			case ("wednesday"):
//				days.WEDNESDAY.daysList.add(input);
//			case ("thursday"):
//				days.THURSDAY.daysList.add(input);
//			case ("friday"):
//				days.FRIDAY.daysList.add(input);
//			case ("saturday"):
//				days.SATURDAY.daysList.add(input);
//			case ("sunday"):
//				days.SUNDAY.daysList.add(input);
//				
//			}
//		} //default("error");
//	}

	enum days {
		MONDAY(monday), TUESDAY(tuesday), WEDNESDAY(wednesday), THURSDAY(thursday), FRIDAY(friday), SATURDAY(saturday),
		SUNDAY(sunday);
		
		LinkedList<String> events;	
		days(LinkedList<String> events) {
			this.events = events;
		}

	}

	public static void add(String eventAction, String day) {
		if (day.equals("Monday")) {
			weekEvents[0].events.add(eventAction);
		} 
		else if (day.equals("Tuesday")) {
			weekEvents[1].events.add(eventAction);
		} 
		else if (day.equals("Wednesday")) {
			weekEvents[2].events.add(eventAction);
		} 
		else if (day.equals("Thursday")) {
			weekEvents[3].events.add(eventAction);
		} 
		else if (day.equals("Friday")) {
			weekEvents[4].events.add(eventAction);
		} 
		else if (day.equals("Saturday")) {
			weekEvents[5].events.add(eventAction);
		} 
		else if (day.equals("Sunday")) {
			weekEvents[6].events.add(eventAction);
		}

	}

	public static void remove(String time, String day) {
		if (day.equals("Monday")) {
			Node<String> head = weekEvents[0].events.getHead();
			if (head.getValue().contains(time)) {
				weekEvents[0].events.remove(0);
			}
			for (int i = 1; i <= weekEvents[0].events.size(); i++) {
				if (head.getNext().getValue().contains(time)) {
					weekEvents[0].events.remove(i);
				}
			}
		} 
		else if (day.equals("Teusday")) {
			Node<String> head = weekEvents[1].events.getHead();
			if (head.getValue().contains(time)) {
				weekEvents[1].events.remove(0);
			}
			for (int i = 1; i <= weekEvents[1].events.size(); i++) {
				if (head.getNext().getValue().contains(time)) {
					weekEvents[1].events.remove(i);
				}
			}
		} 
		else if (day.equals("Wednesday")) {
			Node<String> head = weekEvents[1].events.getHead();
			if (head.getValue().contains(time)) {
				weekEvents[1].events.remove(0);
			}
			for (int i = 1; i <= weekEvents[1].events.size(); i++) {
				if (head.getNext().getValue().contains(time)) {
					weekEvents[1].events.remove(i);
				}
			}
		} 
		else if (day.equals("Thursday")) {
			Node<String> head = weekEvents[1].events.getHead();
			if (head.getValue().contains(time)) {
				weekEvents[1].events.remove(0);
			}
			for (int i = 1; i <= weekEvents[1].events.size(); i++) {
				if (head.getNext().getValue().contains(time)) {
					weekEvents[1].events.remove(i);
				}
			}
		} 
		else if (day.equals("Friday")) {
			Node<String> head = weekEvents[2].events.getHead();
			if (head.getValue().contains(time)) {
				weekEvents[2].events.remove(0);
			}
			for (int i = 1; i <= weekEvents[2].events.size(); i++) {
				if (head.getNext().getValue().contains(time)) {
					weekEvents[2].events.remove(i);
				}
			}
		} 
		else if (day.equals("Saturday")) {
			Node<String> head = weekEvents[3].events.getHead();
			if (head.getValue().contains(time)) {
				weekEvents[3].events.remove(0);
			}
			for (int i = 1; i <= weekEvents[3].events.size(); i++) {
				if (head.getNext().getValue().contains(time)) {
					weekEvents[3].events.remove(i);
				}
			}
		} 
//		else {
//			Node<String> head = weekEvents[4].events.getHead();
//			if (head.getValue().contains(time)) {
//				weekEvents[4].events.remove(0);
//			}
//			for (int i = 1; i <= weekEvents[5].events.size(); i++) {
//				if (head.getNext().getValue().contains(time)) {
//					weekEvents[5].events.remove(i);
//				}
//			}
//		}
	}

	public static void view(String day) {
		if (day.equals("Monday")) {
			weekEvents[0].events.print();
		} 
		else if (day.equals("Teusday")) {
			weekEvents[1].events.print();
		} 
		else if (day.equals("Wednesday")) {
			weekEvents[2].events.print();
		} 
		else if (day.equals("Thursday")) {
			weekEvents[3].events.print();
		} 
		else if (day.equals("Friday")) {
			weekEvents[4].events.print();
		} 
		else if (day.equals("Saturday")) {
			weekEvents[5].events.print();
		} 
		else {
			weekEvents[6].events.print();
		}
	}
}
