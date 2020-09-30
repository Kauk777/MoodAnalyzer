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
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	 }
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		String mood = moodAnalyser.analyseMood("I am in any mood");
		Assert.assertEquals("HAPPY", mood);
	 }
	    
}
