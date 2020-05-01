package events;

import main.GameCode;

public class FartedInClass extends Event {
	public FartedInClass(){
	super(3);
	}
	
	public void runEventCode () {
		super.runEventCode();
		if (this.checkSelected("unimportant")) {
		this.print("YOU HAVE TO FART. WHAT DO YOU DO?");
		this.query(new String [] {"CLOSE CHEEKS", "OPEN CHEEKS",});
		this.setSelected("lame");
			}
		if (this.checkSelected("CLOSE CHEEKS")) {
			this.print("YOUR FART WAS HEARD DOWN THE HALL!");
			this.print("");
			this.print("GAIN STRESS");
			GameCode.setStress(GameCode.getStress() + 50);
			this.setSelected("lame");
			this.stopEvent();
			}
		if (this.checkSelected("OPEN CHEEKS")) {
			this.print("");
			this.print("IT WAS SILENT, BUT DEADLY. NO ONE NOTICED!");
			this.setSelected("lame");
			this.stopEvent();
			
		}
		}

}
