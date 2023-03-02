class Main{


	public static void main(String[] args){
		Team team0 = new Team("1");
		Team team1 = new Team("2");
		Team team2 = new Team("3");
		Team team3 = new Team("4");
		Team team4 = new Team("5");
		Team team5 = new Team("6");


		team0.setRank(2);
		team1.setRank(1);
		team2.setRank(4);
		team3.setRank(5);
		team4.setRank(3);
		team5.setRank(6);

		System.out.println(team0.toString());
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());


	}



}