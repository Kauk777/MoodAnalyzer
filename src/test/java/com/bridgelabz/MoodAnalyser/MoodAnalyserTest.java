package com.bridgelabz.MoodAnalyser;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class MoodAnalyserTest 
{
	MoodAnalyser moodAnalyser=null;
	
	@Before
    public void initialize() {
    	moodAnalyser=new MoodAnalyser();
    }
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		String mood = moodAnalyser.analyseMood("This is sad message");
		Assert.assertEquals("SAD", mood);
	 }
	    
}
