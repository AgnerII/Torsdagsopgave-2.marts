class Team{

	private String teamName;
	private int teamRank;
	private String playerName;


	public Team(String teamName){
		this.teamName = teamName;


	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;


	}

	public String toString(){

		String s = "Hold: "+this.teamName+" *** Rang: "+this.teamRank;

		return s;

	}



}