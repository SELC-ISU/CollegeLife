package events;

public class Jessica extends Event {

		public Jessica () {
			super(0);
		}
		
		 
		public void runEventCode () {
			super.runEventCode();
			//System.out.println(this.checkSelected("unimportant"));
			if (this.checkSelected("unimportant")) {
				this.print("WHILE LOOKING AROUND... A GIRL WALKS UP TO YOU AND ASKS YOU WHERE YOU'RE GOING?");
				this.print(" ");
				this.query(new String [] {"ACTUALLY TELL HER WHERE YOU'RE GOING", "SAY (WHOSE ASKING?)", "KEEP WALKING"});
				this.setSelected("lame");
			}
			if (this.checkSelected("ACTUALLY TELL HER WHERE YOU'RE GOING")) {
				this.print("SHE ASKS IF SHE CAN WALK WITH YOU");
				//this.stopEvent();
				
				if (this.checkSelected("unimportant")) {
					this.print("WHAT DO YOU DO?");
					this.print(" ");
					this.query(new String [] {"ACTUALLY TELL HER WHERE YOU'RE GOING", "SAY (WHOSE ASKING?)", "KEEP WALKING"});
					this.setSelected("lame");
				}
				if (this.checkSelected("RUN")) {
					/*
					if(boy) {
						this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU");
					}
					
					if (girl) {
						this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU");
					}
					*/
					
					this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU");
					this.stopEvent();
				}
				if (this.checkSelected("SAY (SURE!)")) {
					this.print("SHE STARTS WALKING WITH YOU");
					this.stopEvent();
				}
				if (this.checkSelected("KEEP WALKING")) {
					this.print("BRUH");
					this.stopEvent();
				}
				
				//this.stopEvent();
				
			}
			if (this.checkSelected("SAY (WHOSE ASKING?)")) {
				this.print("BRUH");
				this.stopEvent();
			}
			if (this.checkSelected("KEEP WALKING")) {
				this.print("BRUH");
				this.stopEvent();
			}
		}
	
	
	
	
}
