package com.bridgelabz.MoodAnalyser;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class MoodAnalyserTest 
{
   
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	 }
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in any mood");
		Assert.assertEquals("HAPPY", mood);
	 }
	
	@Test
	public void givenMessageRefactor_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	 }
	
	@Test
	public void givenMessageRefactor_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in any mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	 }
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	 }
	    
}
