package events;

public class RickRoll extends Event {
	public RickRoll (){
		super();
	}
	public void runEventCode () {
		super.runEventCode();
		if (this.checkSelected("unimportant")) {
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
