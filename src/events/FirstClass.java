package events;


public class FirstClass extends Event {
	private boolean isLost = false;
	Lost lost = new Lost();
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
	this.print("AS YOU AIMLESSLY WANDER AROUND YOU APPROACH A THREE WAY SLPIT ON THE path");
	this.print("");
	this.query(new String [] {"choose to turn left", "continue on your path","choose to turn right"});
	this.setSelected("lame");
		}
	if (this.checkSelected("choose to turn left".toUpperCase())) {
		this.print("BRUH");
		this.stopEvent();
		}
	if (this.checkSelected("continue on your path".toUpperCase())) {
		this.print("BRUH");
		this.stopEvent();
		}
	if (this.checkSelected("choose to turn right".toUpperCase())) {
		this.print("BRUH");
		this.stopEvent();
		}
	if(isLost){
		lost.runEventCode();
		}
	else if(!lost.isLost()){
		this.stopEvent();
		}
	}
	
}
