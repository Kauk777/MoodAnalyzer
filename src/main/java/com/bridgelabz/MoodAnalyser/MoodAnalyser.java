package com.bridgelabz.MoodAnalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		super();
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) throws MoodAnalyserException {
		this.message=message;
		return analyseMood();
	}

	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.length()==0)
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Enter proper message");
			if(message.contains("sad"))
			    return "SAD";
			    else
			    return "HAPPY";
		}
		catch(Exception e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Enter proper message");
		}
	}

}
