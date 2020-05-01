package events;

import java.util.ArrayList;

public class Bibledude extends Event{
	private Lost lost;
	/** 
	 * uses the original constructer
	 */
	public Bibledude(Lost lost) {
		super(0);
		this.lost = lost;
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	if (this.checkSelected("unimportant")) {
	this.print("you approach the man looking rather lost");
	this.print("hello there son would you be intrested in talking about jesus?");
	this.query(new String [] {"yes i love jesus", "no i am looking for directions","there is no god"});
	this.setSelected("lame");
		}
	if (this.checkSelected("yes i love jesus")||this.checkSelected("no i am looking for directions")) {
		this.print("it does not really seem to matter what you said as he spends a long time talking about jesus");
		this.print("he finally pauses and you get to ask for directions");
		lost.noLongerLost();
		this.stopEvent();
		}
	if (this.checkSelected("there is no god")) {
		this.print("you live up to the stereotype and tell him you are an atheist");
		this.print("he looks at you with disgust and it looks like you will have to find another way");
		this.stopEvent();
		}
	
	public String intro() {
		return("A man on the sidewalk in the shade");
	}
}