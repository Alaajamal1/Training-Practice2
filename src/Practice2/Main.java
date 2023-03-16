package Practice2;

import java.util.Scanner;
	import java.util.ArrayList;

public class Main {

	
	    public static void main(String[] args) {
	    	Scanner myObj = new Scanner(System.in);
			String GameName;
			String PlayerName1;
			String PlayerName2;
			String PlayerName3;
			String PlayerName4;
			System.out.println("Enter The Name of Game");
			GameName = myObj.nextLine();
			
			System.out.println("Enter The Name of Player1");
			PlayerName1 = myObj.nextLine();
			System.out.println("Enter The Name of Player2");
			PlayerName2 = myObj.nextLine();
			System.out.println("Enter The Name of Player3");
			PlayerName3 = myObj.nextLine();
			System.out.println("Enter The Name of Player4");
			PlayerName4 = myObj.nextLine();
	        ArrayList<String> playerNames = new ArrayList<>();
	        playerNames.add(PlayerName1);
	        playerNames.add(PlayerName2);
	        playerNames.add(PlayerName3);
	        playerNames.add(PlayerName4);
	        Game game = new Game(playerNames);
	        game.playGame(GameName);
	    }
	}

