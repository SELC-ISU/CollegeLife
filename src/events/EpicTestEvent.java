package events;

import main.GameCode;

public class EpicTestEvent extends Event {
	/** 
	 * uses the original constructer
	 */
	public EpicTestEvent () {
		super();
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	if (GameCode.getTextInterface().selected.equals("unimportant")) {
	this.print("BRUH");
	GameCode.getTextInterface().query(new String [] {"BRUH1", "BRUH","BRUH2"});
	GameCode.getTextInterface().selected = "lame";
		}
	if (GameCode.getTextInterface().selected.equals("BRUH1")) {
		GameCode.getTextInterface().println("BRUH");
		this.stopEvent();
		}
	if (GameCode.getTextInterface().selected.equals("BRUH")) {
		GameCode.getTextInterface().println("BRUH");
		this.stopEvent();
		}
	if (GameCode.getTextInterface().selected.equals("BRUH2")) {
		GameCode.getTextInterface().println("BRUH");
		this.stopEvent();
		}
	}
}
