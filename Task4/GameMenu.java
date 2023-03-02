import java.util.ArrayList;

class GameMenu{

	private ArrayList<String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> actions){
	
	this.actions = actions;

	displayMenu(actions);
	}

	public void displayMenu(ArrayList<String> actions){


	for (String item:actions){
		System.out.println(item);
	}
}

}