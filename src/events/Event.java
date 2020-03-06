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
	public Event (int type) {
		if(type==1){
			GameCode.requiredEvents.add(this);
		}
		else if(type==2){
			GameCode.goodEvents.add(this);
		}
		else if(type==3){
			GameCode.badEvents.add(this);
		}
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
	/**
	 * prints a line to the screen a bit easier
	 * @param s the text to print to the screen
	 */
	protected void print(String s){
		GameCode.getTextInterface().println(s.toUpperCase());
		
	}
	/**
	 * checks if the string is the selected string
	 * @param s the string to check
	 * @return weather or not that string is selected
	 */
	protected boolean checkSelected(String s){
		return GameCode.getTextInterface().selected.equals(s.toUpperCase());
	}
	/**
	 * gives the given options to the players
	 * @param an array of options to give to the player
	 */
	protected void query(String[] s){
		GameCode.getTextInterface().query(s);
	}
	/**
	 * sets the selected string to this string
	 * @param the string to set the selected option too
	 */
	protected void setSelected(String s){
		GameCode.getTextInterface().selected = s.toUpperCase();
	}
}
