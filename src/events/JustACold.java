package events;

import main.GameCode;

public class JustACold extends Event {
	
public JustACold (){
			super(1);
}
		public void runEventCode () {
			super.runEventCode();
			if (this.checkSelected("unimportant")) {
			this.print("YOUR ROOMATE COUGHS... CORONA? WHAT DO YOU GIVE HIM?");
			this.query(new String [] {"HAND SANITIZER", "HIGH FIVE", "NOTHING"});
			this.setSelected("lame");
				}
			if (this.checkSelected("HAND SANITIZER")) {
				this.print("HE THANKS YOU AND IMMEDIATELY APPLIES IT.");
				this.print("");
				this.setSelected("lame");
				this.stopEvent();
				}
			if (this.checkSelected("HIGH FIVE")) {
				this.print("YOU IMMEDIATELY FEEL THE VIRUS.");
				this.print("");
				this.print("LOSE HEALTH");
				GameCode.setHealth(GameCode.getHealth() - 30);
				this.print("");
				this.setSelected("lame");
				this.stopEvent();
			}
			if (this.checkSelected("NOTHING")) {
				this.print("HE DIES THE NEXT DAY");
				this.print("");
				this.print("GAIN STRESS");
				GameCode.setStress(GameCode.getStress() - 30);
				this.print("");
				this.setSelected("lame");
				this.stopEvent();
			}
			}
	}
