package events;

import main.GameCode;

public class End extends Event{

	public End () {
		super(1);
	}
	
	public void runEventCode () {
		super.runEventCode();
		if (this.checkSelected("unimportant")) {
		this.print("YOU FINISHED COLLEGE! HOW WAS YOUR EXPERIENCE?");
		this.query(new String [] {"IT WAS AMAZING!", "MEH", "I WANT A REFUND"});
		this.setSelected("lame");
			}
		if (this.checkSelected("IT WAS AMAZING!")) {
			this.print("GLAD YOU ENJOYED! PLAY AGAIN!");
			this.setSelected("lame");
			this.stopEvent();
			}
		if (this.checkSelected("MEH")) {
			this.print("WELL YOU DECIDED YOUR PATH, THATS ON YOU");
			this.setSelected("lame");
			this.stopEvent();
		}
		if (this.checkSelected("I WANT A REFUND")) {
			this.print("THIS IS COLLEGE DUDE, YOUR MONEY IS GONE!");
			this.print("");
			this.print("WASTED MONEY");
			GameCode.setCash(0);
			this.setSelected("lame");
			this.stopEvent();
		}
		}
}