package Events;

import main.TextInterface;
import resources.Sprite;

public class Event {
	boolean isRunning;
	boolean stopped;
	/**
	 * pretty generic constucter
	 * @author Jeffrey
	 */
	public Event () {
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
}
