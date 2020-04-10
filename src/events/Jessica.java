package events;

import main.GameCode;
import main.TextInterface;

public class Jessica extends Event {

		//private static TextInterface textInterface;
		
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
					this.print(" ");
					this.print("WHAT DO YOU DO?");
					this.print(" ");
					this.query(new String [] {"RUN", "SAY (SURE!)", "SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)"});
					this.setSelected("lame");

				if (this.checkSelected("RUN")) {
				
					/*if(textInterface.selected.equals("MALE")) {
						this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU");
					}
					
					if (textInterface.selected.equals("FEMALE")) {
						this.print("THIS GIRL COULD HAVE BEEN A DRAMA QUEEN");
					}
					*/
					
					
					this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU... GOOD JOB");
					this.stopEvent();
				}
				if (this.checkSelected("SAY (SURE!)")) {
					this.print("SHE STARTS WALKING WITH YOU");
					this.print(" ");
					this.print("SHE TALKS TO YOU FOR WHILE AND YOU CONNECT PRETTY WELL WITH HER. SHE ASKS YOU IF YOUR BUSY AND HAVE TIME TO GO GET DINNER");
					this.print(" ");
					this.query(new String [] {"I NEED TO GET BACK... I HAVE A LOT OF HOMEWORK TO DO", "SAY (THAT SOUNDS PRETTY GOOD... I'M DOWN)", "RUN", "SAY(MARRY ME!)"});
					this.setSelected("lame");
					
					if (this.checkSelected("I NEED TO GET BACK... I HAVE A LOT OF HOMEWORK TO DO")) {
						this.print("SHE SAYS OK AND ASKS IF SHE COULD HAVE YOUR NUMBER?");
						this.print(" ");
						this.query(new String [] {"SAY (ABSOLUTELY)", "SAY (HMMMM...)", "SAY (I DON'T THINK WE SHOULD SEE EACH OTHER AGAIN...) AND YOU RUN"});
						this.setSelected("lame");
						
						
						if (this.checkSelected("SAY (ABSOLUTELY!)")) {
							this.print("SHE GIVES YOU HER NUMBER, SMILES, AND LEAVES");
							this.print("THIS WAS A MILD SUCCESS... YOU'RE RELIEVED");
							GameCode.setStress(GameCode.getStress() - 5);
							this.stopEvent();
						}
						if (this.checkSelected("SAY (HMMMM...)")) {
							this.print("YOU TOOK TOO LONG AND SHE SAID IT WAS OK AND SHE'LL FIND YOU ANOTHER TIME AND LEFT");
							this.print(" ");
							this.print(" ");
							this.print(" ");
							this.print("BRUH... YOU GET STRESSED FROM EMBARRASSMENT");
							GameCode.setStress(GameCode.getStress() + 5);
							this.stopEvent();
						}
						if (this.checkSelected("SAY (I DON'T THINK WE SHOULD SEE EACH OTHER AGAIN...) AND YOU RUN")) {
							this.print("BRUH");
							this.print("WHAT IS WRONG WITH YOU... JUST SAD");
							this.print("YOU GET STRESSED FROM LEAVING THE SCENE SUDDENLY");
							GameCode.setStress(GameCode.getStress() + 10);
							this.stopEvent();
						}
						
						
					}
					
					if (this.checkSelected("SAY (THAT SOUNDS PRETTY GOOD... I'M DOWN)")) {
						this.print("SHE SAYS (GREAT! WHERE DO YOU WANT TO EAT?)");
						this.query(new String [] {"SAY (IDC)", "SAY (WHAT SOUNDS GOOD)", "CHOOSE THE CHEAP OPTION", "CHOOSE A MORE EXPENSIVE OPTION"});
						this.setSelected("lame");
						
						if (this.checkSelected("SAY (IDC)")) {
							this.print("SHE GETS ANNOYED AND JUST SAYS (I'M ACTUALLY NOT THAT HUNGRY BUT ILL TALK TO YOU LATER), GIVES YOU HER NUMBER AND LEAVES");
							GameCode.setStress(GameCode.getStress() + 2);
							this.stopEvent();
						}
						if (this.checkSelected("SAY (WHAT SOUNDS GOOD)")) {
							this.print("SHE SAYS (HMMMM... IDC YOU CHOOSE)");
							this.query(new String [] {"SAY (IDC)", "CHOOSE THE CHEAP OPTION", "CHOOSE A MORE EXPENSIVE OPTION"});
							
							if (this.checkSelected("SAY (IDC)")) {
								this.print("SHE GETS ANNOYED AND JUST SAYS (I'M ACTUALLY NOT THAT HUNGRY BUT ILL TALK TO YOU LATER), GIVES YOU HER NUMBER AND LEAVES");
								GameCode.setStress(GameCode.getStress() + 2);
								this.stopEvent();
							}
							
							if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
								this.print("BRUH");
								//this.stopEvent();
							}
							
							if (this.checkSelected("CHOOSE A MORE EXPENSIVE OPTION")) {
								this.print("SHE SAYS (WELL... THAT DOES SOUND REALLY GOOD, BUT I DON'T HAVE ANY MONEY. DO YOU CARE IF WE GO TO A FAST FOOD RESTAURANT INSTEAD");
								this.query(new String [] {"SAY (MCDONALDS?)", "SAY (SUBWAY?)", "TRY THE CHEAP OPTION AGAIN", "SAY (PIZZA?)"});
								
								if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
									this.print("BRUH");
									
								}
								if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
									this.print("BRUH");
									//this.stopEvent();
								}
								if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
									this.print("BRUH");
									//this.stopEvent();
								}
								
							}
							
						}
						if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
							this.print("BRUH");
							//this.stopEvent();
						}
						if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
							this.print("BRUH");
							//this.stopEvent();
						}
						
						
					}
					if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
						this.print("BRUH");
						//this.stopEvent();
					}
					if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
						this.print("BRUH");
						//this.stopEvent();
					}
					
					
					
				}
				if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
					this.print("BRUH");
					//this.stopEvent();
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
