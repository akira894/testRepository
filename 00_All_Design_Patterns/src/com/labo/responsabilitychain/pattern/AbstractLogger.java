package com.labo.responsabilitychain.pattern;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	// next element in chain of responsibility
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger logger) {
		this.nextLogger = logger;
	}
	
	public void logMessage(int level, String message) {
		
		if(this.level <= level) {
			write(message);
		}
		
		if(this.nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
		
	}

	protected abstract void write(String message);
}
