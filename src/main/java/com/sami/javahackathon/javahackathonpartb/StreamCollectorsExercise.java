package com.cgi.javahackathon.javahackathonpartb;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamCollectorsExercise {
	
	
	
	//constructor
	public StreamCollectorsExercise () {
		
		List<Player> playerList;
		
		playerList=List.of(
		 new Player("Sami", 56, 800, 180, new Country(101, "Canada")),
	     new Player("Wendy", 107, 8800, 55, new Country(102, "UK")),
	     new Player("Mike", 98, 2010, 110, new Country(103, "Germany")),
	     new Player("Julia", 88, 402, 76, new Country(104, "Italy")),
	     new Player("Omar", 55, 3800, 275, new Country(105, "Sweeden")),
	     new Player("Becca", 88, 7600, 75, new Country(106, "USA"))
	     
	     );
		
	}
	
	//Display player by their given country
	public static LinkedHashMap<String, String> getPlayersByCounty(List<Player> playerList, Country country, Player player) {
		
		LinkedHashMap<String, String> playersAndCountries = new LinkedHashMap<String, String>();
		
		playersAndCountries.putAll(player.getPlayerName(), country.getCountryName());
		
		return playersAndCountries;
		
		
	}
	
	//display players and country names who have more than 100 matches
	public static Map<String, String> getPlayerNamesByCountrywithMoreThan100matches(List<Player> playerList) {
		
		
		//LinkedHashMap<String, String> list = new LinkedHashMap<String, String>();
		
		Map<String, String> pcMap= playerList.stream()
				.filter(x->x.getMatchesPlayed()>100)
				.collect(Collectors.toMap(Country::getCountryName, Player::getPlayerName));
		
		
		return pcMap;
	
	}
	
	
	//get country name and number of players
	public static LinkedHashMap<String, Integer> getTotalPlayersByCountry(List<Player> playerList) {
		
		LinkedHashMap<String, Integer> list = new LinkedHashMap<String, Integer>();
		
		Map<String, Integer> pcMap = playerList.stream()
				.collect(Collectors.toMap(Country::getCountryName,.count(Player::getPlayerName));
				
				
				list = new LinkedHashMap<String, Integer>(pcMap);
				
				
		return list;
		
		
	}
	
	//get country with sum of all their runs
	public static Map<String, Integer> getTotalRunsByCountry(List<Player> playerList) {
		
		Map<String, Integer> countryAndSumOfRuns = playerList.stream()
				.sum(Comparator.comparing(Player::getRuns))
				.collect(Collectors.toMap(Country::getCountryName, Player::sum))
				
				
		return countryAndSumOfRuns;	
		
	}
	
	//Get country name and max number of runs scored by players
	public static Map<String, Integer> getMaxScoreByCountry(List<Player> playerList) {
		
		Map<String, Integer> maxRunsByCountry = playerList.stream()
				.max(Comparator.comparing(Player::getHighestScore))
				.collect(Collectors.toMap(Country::getCountryName, Player::getHighestScore));
		
		
		return maxRunsByCountry
		
	}
	
	//display country name as key and player name as value separated by a comma
	public static Map<String, String> getPlayerNamesStringByCountry(List<Player> playerList) {
		
		Map<String, String> pcMap = playerList.stream()
				.collect(Collectors.toMap(Country::getCountryName, Player::getPlayerName).split(",")));
		
		
		return pcMap;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
