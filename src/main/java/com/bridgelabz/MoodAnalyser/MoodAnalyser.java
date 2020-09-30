package com.bridgelabz.MoodAnalyser;

public class MoodAnalyser {
	
	public String analyseMood(String mood) {
		if(mood.contains("sad"))
			return "SAD";
			else
			return "HAPPY";
	}
}
