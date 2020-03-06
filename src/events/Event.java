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
	/**
	 * prints a line to the screen a bit easier
	 * @param s the text to print to the screen
	 */
	protected void print(String s){
		GameCode.getTextInterface().println(s);
		
	}
	/**
	 * checks if the string is the selected string
	 * @param s the string to check
	 * @return wheather or not that string is selected
	 */
	protected boolean checkSelected(String s){
		return GameCode.getTextInterface().selected.equals(s);
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
		GameCode.getTextInterface().selected = s;
	}
	/**
	 * sets the background to a new background
	 * @param backgroundToUse a filepath to the background to change it too
	 */
	protected void changeBackground (String backgroundToUse){
		GameCode.getTextInterface().changeBackgorund(backgroundToUse);
	}
	/**
	 * changes the currently playing song to a new song 
	 * @param song a filepath to the new song to play 
	 * @param volume the volume to play the song at
	 */
	protected void changeMusic (String song, float volume){
		GameCode.player.play(song, volume);
	}
	/**
	 * plays a quick sound effect
	 * @param effect a filepath to the effect you want
	 * @param volume the volume to play the sound effect at
	 */
	protected void playSoundEffect (String effect, float volume){
		GameCode.player.playSoundEffect(volume, effect);
	}
}
