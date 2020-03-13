package events;


public class Lost extends Event {
	private boolean lost = false;
	private int timesStaredAtPhone=0;
	/** 
	 * uses the original constructer
	 */
	public Lost() {
		super(0);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	if (this.checkSelected("unimportant")) {
	this.print("As you are walking around, you no longer recognize the surrounding area.");
	this.query(new String [] {"Stare at your phone for awhile", "find someone to ask for directions","BRUH2"});
	this.setSelected("lame");
		}
	if (this.checkSelected("Stare at your phone for awhile".toUpperCase())) {
		if(timesStaredAtPhone<=0){
			this.print("after you stare at your phone for awhile you have concluded that you are lost");
			timesStaredAtPhone++;
		}
		else{
			this.print("after you stare at your phone again for awhile you have concluded that you are utterly, hopelessly, lost");
			timesStaredAtPhone++;
		}
		this.stopEvent();
		}
	if (this.checkSelected("find someone to ask for directions".toUpperCase())) {
		this.print("BRUH");
		this.stopEvent();
		}
	if (this.checkSelected("BRUH2")) {
		this.print("BRUH");
		this.stopEvent();
		}
	}
	public boolean isLost(){
		return(lost);
	}
}
