package events;

import main.GameCode;

public class ClassSnacks extends Event {
	
public ClassSnacks (){
			super(1);
}
		public void runEventCode () {
			super.runEventCode();
			if (this.checkSelected("unimportant")) {
			this.print("YOUR IN CHARGE OF BRINGING CLASS SNACKS. WHAT DO YOU BRING?");
			this.query(new String [] {"FRUIT SNACKS", "VEGGIES", "CANDY"});
			this.setSelected("lame");
				}
			if (this.checkSelected("VEGGIES")) {
				this.print("THE CLASS HATE THAT AND HATE YOU.");
				this.print("");
				this.print("GAIN STRESS");
				GameCode.setStress(GameCode.getStress() + 35);
				this.setSelected("lame");
				this.stopEvent();
				}
			if (this.checkSelected("FRUIT SNACKS")) {
				this.print("THE CLASS THOUGH IT WAS OK.");
				this.setSelected("lame");
				this.stopEvent();
			}
			if (this.checkSelected("CANDY")) {
				this.print("THE CLASS LOVES YOU");
				this.print("");
				this.print("LOSE STRESS");
				GameCode.setStress(0);
				this.setSelected("lame");
				this.stopEvent();
			}
			}
	}
