package events;


public class FirstClass extends Event {
	/** 
	 * uses the original constructer
	 */
	public FirstClass () {
		super(1);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	if (this.checkSelected("unimportant")) {
	this.print("WHILE YOU ARE ON YOUR WAY TO YOUR FIRST CLASS, YOU CAN NOT REMEMBER WHAT CLASS YOU WERE GOING TO");
	this.print("AS YOU AIMLESSLY WANDER AROUND YOU APPROACH A THREE WAY SLPIT ON THE PATH");
	this.print("");
	this.query(new String [] {"BRUH1", "BRUH","BRUH2"});
	this.setSelected("lame");
		}
	if (this.checkSelected("BRUH1")) {
		this.print("BRUH");
		this.stopEvent();
		}
	if (this.checkSelected("BRUH")) {
		this.print("BRUH");
		this.stopEvent();
		}
	if (this.checkSelected("BRUH2")) {
		this.print("BRUH");
		this.stopEvent();
		}
	}
}
