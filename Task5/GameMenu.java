import java.util.Scanner;
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

	public String getAction(ArrayList<String> options){
		Scanner scanner = new Scanner(System.in);
		this.actions = options;

		System.out.println("Type a number to choose an action");

		for (String item:options){
			System.out.println(item);
	}
	String choise = scanner.nextLine();
	return choise;
}