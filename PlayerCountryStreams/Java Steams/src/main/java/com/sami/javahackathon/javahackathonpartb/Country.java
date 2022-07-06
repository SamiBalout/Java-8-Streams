package com.cgi.javahackathon.javahackathonpartb;

public class Country {

	
	//Instance Variables
		private int countryId;
		private String countryName;
		
		
		//Constructor
		public Country(int countryId, String countryName) {
			//super();
			this.countryId = countryId;
			this.countryName = countryName;
		}


		//Getters and Setters
		public int getCountryId() {
			return countryId;
		}



		public void setCountryId(int countryId) {
			this.countryId = countryId;
		}


		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		
	
	
	
	
}
