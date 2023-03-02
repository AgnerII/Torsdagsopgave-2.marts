import java.util.ArrayList;

class Main{
	

	public static void main(String[] args){
	
		ArrayList<String> actions = new ArrayList<>();
		actions.add("Start Game");
		actions.add("Resume Game");
		actions.add("Pause Game");
		actions.add("End Game");

		 GameMenu start = new GameMenu(actions);
		 String userChoise = getAction();
	}

	public static void doAction(int action){
		userChoise = Integer.parseInt();

		switch(action){
		case 1: 
			System.out.println("1: Starting the game now");
		break;
		case 2: 
			System.out.println("2: Fetching previously saved game");
		break;
		case 3:
			System.out.println("3: Game paused");
		break;
		case 4:
			System.out.println("4: Ending game");
		
		return;
		}

	}
}