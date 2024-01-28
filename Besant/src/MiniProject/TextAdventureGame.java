package MiniProject;

import java.util.HashMap;
import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        
    	HashMap<String, String> locations =  createLocations();
        String currentLocation = "start";
        TextAdventureGame.createLocations();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are You Ready to Start");
        String move = scanner.nextLine();
		
        while(move.equals("yes")) {
        	System.out.println("\nWelcome to the Text-Based Adventure Game!");
        
        while (true) {
            System.out.println("\nYou are at " + currentLocation);
            System.out.println("Available directions: " + locations.get(currentLocation));
            System.out.print("Enter your nextstep (or 'quit' to exit): ");
            String nextstep = scanner.nextLine();//find the purpose of lowercase

            if (nextstep.equals("quit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
            if (locations.containsKey(nextstep)) {
                currentLocation = nextstep;
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

        scanner.close();
        }
    }
    

    private static HashMap<String, String> createLocations() {
		// TODO Auto-generated method stub
		HashMap<String, String> locations = new HashMap<String, String>();
		locations.put("start", "north, south, east, west");
        locations.put("north", "south");
        locations.put("south", "north, east");
        locations.put("east", "west, south");
        locations.put("west", "east, north");
        
        return locations;
	}
}