package events;

import java.util.Random;

public class FirstClass extends Event {
	public boolean isLost = false;
	Lost lost = new Lost();
	Random rand = new Random ();
	/** 
	 * uses the original constructer
	 */
	public FirstClass () {
		super(1);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	if ((this.checkSelected("unimportant") || this.checkSelected("unimportant".toUpperCase())) && !isLost ) {
	this.print("WHILE YOU ARE ON YOUR WAY TO YOUR FIRST CLASS, YOU CAN NOT REMEMBER WHAT CLASS YOU WERE GOING TO");
	this.print("AS YOU AIMLESSLY WANDER AROUND YOU APPROACH A THREE WAY SLPIT ON THE path");
	this.print("");
	this.query(new String [] {"choose to turn left", "continue on your path","choose to turn right"});
	this.setSelected("lame");
		}
	if (this.checkSelected("choose to turn left".toUpperCase()) || this.checkSelected("continue on your path".toUpperCase()) || this.checkSelected("choose to turn right".toUpperCase())) {
		if (rand.nextBoolean()) {
		this.isLost = true;
		} else {
		this.print("luckly you made it to class on time");
		this.stopEvent();
		}
		this.setSelected("unimportant");
		}
	if(isLost){
		lost.runEventCode();
		}
	
	if(!lost.isLost()){
		this.stopEvent();
		}
	}
}
