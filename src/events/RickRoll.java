package events;

import main.GameCode;

public class RickRoll extends Event {
	public RickRoll (){
		super(0);
	}
	public void runEventCode () {
		super.runEventCode();
		if (this.checkSelected("unimportant")) {
		this.print("A STRANGE MAN APPROCHES YOU WITH A VIDEO LINK WHAT DO YOU DO?");
		this.query(new String [] {"CLICK IT BOI", "RUNN",});
		this.setSelected("lame");
			}
		if (this.checkSelected("CLICK IT BOI")) {
			this.print("YOU GOT LEY EPIC TROLLED DUDE");
			this.print("");
			this.print("GAIN STRESS");
			GameCode.setStress(GameCode.getStress() + 10);
			this.changeMusic("music/never-gonna-give-you-up.wav", 6F);
			this.setSelected("lame");
			this.stopEvent();
			}
		if (this.checkSelected("RUNN")) {
			this.print("YOU AVOIDED THE DANGORUS SITUATION GOOD FOR YOU");
			this.setSelected("lame");
			this.stopEvent();
			
		}
		}
}
