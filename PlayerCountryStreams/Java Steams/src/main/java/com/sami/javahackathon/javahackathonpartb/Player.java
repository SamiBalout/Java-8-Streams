package com.cgi.javahackathon.javahackathonpartb;



public class Player {

	
	//Instance Variables
		private String playerName;
		private int matchesPlayed;
		private int runs; 
		private int highestScore;
		private Country Country;
		
		
		//Constructor
		public Player(String playerName, int matchesPlayed, int runs, int highestScore,
				Country country) {
			
			//super();
			this.playerName = playerName;
			this.matchesPlayed = matchesPlayed;
			this.runs = runs;
			this.highestScore = highestScore;
			Country = country;
		}


		//Getters and Setters
		public String getPlayerName() {
			return playerName;
		}



		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}



		public int getMatchesPlayed() {
			return matchesPlayed;
		}



		public void setMatchesPlayed(int matchesPlayed) {
			this.matchesPlayed = matchesPlayed;
		}



		public int getRuns() {
			return runs;
		}



		public void setRuns(int runs) {
			this.runs = runs;
		}



		public int getHighestScore() {
			return highestScore;
		}



		public void setHighestScore(int highestScore) {
			this.highestScore = highestScore;
		}



		public Country getCountry() {
			return Country;
		}



		public void setCountry(Country country) {
			Country = country;
		}
		
	
	
	
	
	
	
}
