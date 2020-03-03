package events;


public class EpicTestEvent extends Event {
	/** 
	 * uses the original constructer
	 */
	public EpicTestEvent () {
		super();
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	if (this.checkSelected("unimportant")) {
	this.print("BRUH");
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
