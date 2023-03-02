import java.util.ArrayList;

class Main{
	

	public static void main(String[] args){
	
		ArrayList<String> actions = new ArrayList<>();
		actions.add("Start Game");
		actions.add("Resume Game");
		actions.add("Pause Game");
		actions.add("End Game");

		 GameMenu start = new GameMenu(actions);
		
	}
}