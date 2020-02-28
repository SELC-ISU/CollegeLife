package events;

import main.GameCode;
import main.TextInterface;
import resources.Sprite;

public class Event {
	boolean isRunning;
	boolean stopped;
	/**
	 * pretty generic constructor
	 * @author Jeffrey
	 */
	public Event () {
		GameCode.randomEvents.add(this);
		isRunning = false;
		stopped = false;
	}
	/**
	 * called by GameCode when the game wants to run this event 
	 * used in specific event classes to give each an unique event
	 */
	public void runEventCode () {
	 if (!stopped) {
		 isRunning = true;
	 }
	}
	/**
	 * tells the game that the event is concluded and too move on
	 */
	public void stopEvent () {
		stopped = true;
		isRunning = false;
	}
	/**
	 * returns true if the event is still happening
	 * @return true if the event is still happening
	 */
	public boolean isRunning () {
		return isRunning;
	}
	protected void print(String s){
		GameCode.getTextInterface().println(s);
		
	}
	protected boolean query(String s){
		return GameCode.getTextInterface().selected.equals(s);
	}
}
