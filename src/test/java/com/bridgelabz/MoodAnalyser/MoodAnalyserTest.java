package com.bridgelabz.MoodAnalyser;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest 
{
   
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	 }
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in any mood");
		Assert.assertEquals("HAPPY", mood);
	 }
	
	@Test
	public void givenMessageRefactor_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	 }
	
	@Test
	public void givenMessageRefactor_WhenNotSad_ShouldReturnHappy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in any mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	 }
	
	@Test
    public void givenMessage_WhenNull_ShouldThrowExceptionNullMessage()
    {
		
		try {
			MoodAnalyser moodAnalyser=new MoodAnalyser(null);
			String mood = moodAnalyser.analyseMood();
			
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());
			System.out.println(e.exceptionType);
			Assert.assertEquals("Enter proper message", e.getMessage());
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
    	
    }
	
	@Test
    public void givenMessage_WhenEmpty_ShouldThrowExceptionEmptyMessage() 
    {
		MoodAnalyser moodAnalyser=new MoodAnalyser(" ");
		try {
			String mood = moodAnalyser.analyseMood();
			
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());
			System.out.println(e.exceptionType);
			Assert.assertEquals("Enter proper message", e.getMessage());
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
    	
    }
	    
}
