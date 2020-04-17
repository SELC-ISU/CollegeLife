package events;

import main.GameCode;
import java.util.Random;

public class Jessica extends Event {

		//private static TextInterface textInterface;
		
		public Jessica () {
			super(0);
		}
		
		private int selected = 0;
		 
		public void runEventCode () {
			super.runEventCode();
			//System.out.println(this.checkSelected("unimportant"));
			if (this.checkSelected("unimportant")) {
				this.print("WHILE LOOKING AROUND... A GIRL WALKS UP TO YOU AND ASKS YOU WHERE YOU'RE GOING?");
				this.print(" ");
				this.query(new String [] {"ACTUALLY TELL HER WHERE YOU'RE GOING", "SAY (WHOSE ASKING?)", "KEEP WALKING"});
				this.setSelected("lame");
			}
			
			while(selected == 0) {
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
						this.print("YOU TALK FOR A WHILE AND YOU CONNECT PRETTY WELL WITH HER. SHE ASKS YOU IF YOUR BUSY AND HAVE TIME TO GO GET DINNER");
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
								this.print(" ");
								this.print("THIS WAS A MILD SUCCESS... YOU'RE RELIEVED");
								GameCode.setStress(GameCode.getStress() - 5);
								break;
								//this.stopEvent();
							}
							if (this.checkSelected("SAY (HMMMM...)")) {
								this.print("YOU TOOK TOO LONG AND SHE SAID IT WAS OK, SHE'LL FIND YOU ANOTHER TIME AND LEFT");
								this.print(" ");
								this.print(" ");
								this.print(" ");
								this.print("BRUH... ");
								this.print("YOU GET STRESSED FROM EMBARRASSMENT");
								GameCode.setStress(GameCode.getStress() + 5);
								break;
								//this.stopEvent();
							}
							if (this.checkSelected("SAY (I DON'T THINK WE SHOULD SEE EACH OTHER AGAIN...) AND YOU RUN")) {
								this.print("WHAT IS WRONG WITH YOU... JUST SAD");
								this.print("YOU GET STRESSED FROM LEAVING THE SCENE SUDDENLY");
								GameCode.setStress(GameCode.getStress() + 10);
								break;
								
								//this.stopEvent();
							}
							
							
						}
						
						if (this.checkSelected("SAY (THAT SOUNDS PRETTY GOOD... I'M DOWN)")) {
							this.print("SHE SAYS (GREAT! WHERE DO YOU WANT TO EAT?)");
							this.query(new String [] {"SAY (IDC)", "SAY (WHAT SOUNDS GOOD)", "CHOOSE THE CHEAP OPTION", "CHOOSE A MORE EXPENSIVE OPTION"});
							this.setSelected("lame");
							
							if (this.checkSelected("SAY (IDC)")) {
								this.print("SHE GETS ANNOYED AND JUST SAYS (I'M ACTUALLY NOT THAT HUNGRY BUT I'LL TALK TO YOU LATER), GIVES YOU HER NUMBER AND LEAVES");
								this.print(" ");
								this.print("I WOULDN'T CALL THAT A SUCCESS, BUT AT LEAST SHE WAS NICE ABOUT IT");
								GameCode.setStress(GameCode.getStress() + 2);
								
								break;
								
								//this.stopEvent();
							}
							if (this.checkSelected("SAY (WHAT SOUNDS GOOD)")) {
								this.print("SHE SAYS (HMMMM... IDC YOU CHOOSE)");
								this.query(new String [] {"SAY (IDC)", "CHOOSE THE CHEAP OPTION", "CHOOSE A MORE EXPENSIVE OPTION"});
								this.setSelected("lame");
								
								if (this.checkSelected("SAY (IDC)")) {
									this.print("SHE GETS ANNOYED AND JUST SAYS (I'M ACTUALLY NOT THAT HUNGRY BUT ILL TALK TO YOU LATER), GIVES YOU HER NUMBER AND LEAVES");
									this.print(" ");
									this.print("I WOULDN'T CALL THAT A SUCCESS, BUT AT LEAST SHE WAS NICE ABOUT IT");
									GameCode.setStress(GameCode.getStress() + 2);
									
									break;
									
									//this.stopEvent();
								}
								
								if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
									this.print("SHE SAYS (OK THAT SOUNDS PRETTY GOOD)");
									this.print("UNDER NORMAL CIRCUMSTANCES YOU SHOULD NEVER CHOOSE THE CHEAP OPTION, BUT IN THIS PARTITCULAR SITUATION YOU'RE COLLEGE STUDENTS");
									this.print("SO THIS IS A VERY VIABLE OPTION AND ON TOP OF THAT SHE ACTUALLY LOOKS RELIEVED THAT YOU CHOOSE TO GO THERE");
									
	
									//this.stopEvent();
								}
								
								if (this.checkSelected("CHOOSE A MORE EXPENSIVE OPTION")) {
									this.print("SHE SAYS (WELL... THAT DOES SOUND REALLY GOOD, BUT I DON'T HAVE ANY MONEY. DO YOU CARE IF WE GO TO A FAST FOOD RESTAURANT INSTEAD");
									this.query(new String [] {"SAY (MCDONALDS?)", "SAY (JIMMY JOHNS?)", "TRY THE CHEAP OPTION AGAIN", "SAY (EXTREMELY FANCY RESTAURANT?)"});
									this.setSelected("lame");
									
									if (this.checkSelected("SAY (MCDONALDS?)")) {
										this.print("YOU EAT IN ALMOST COMPLETE SILENCE AND SHE GETS UP AND SAYS THAT WAS GOOD AND I'LL SEE YOU LATER");
										this.print("YOU REALIZE THAT YOU FORGOT TO ASK FOR HER NUMBER");
										this.print("");
										this.print("WHAT DO YOU DO?");
										this.query(new String [] {"CATCH HER BEFORE SHE LEAVES", "FORGET ABOUT IT", "SCREAM AND SHOUT UNTIL SHE CAN HEAR YOU", "THROW SOMETHING AT HER"});
										this.setSelected("lame");
										
										if (this.checkSelected("CATCH HER BEFORE SHE LEAVES")) {
											this.print("YOU THROW EVERYTHING AWAY AND RUN OUT THE DOOR TO FIND HER LUCKILY SHE WAS JUST WAITING AT THE BUS STOP");
											this.print("YOU RUN UP TO HER AND SAY (HEY! WAIT!)");
											this.print("SHE LOOKS OVER AND YOU SAY?");
											this.query(new String [] {"I FORGOT TO ASK IF I COULD HAVE YOUR NUMBER?", "I FORGOT TO ASK IF YOU WANTED A RIDE HOME?", "I HATE YOU", "KISS HER"});
											this.setSelected("lame");
											
											if (this.checkSelected("I FORGOT TO ASK IF I COULD HAVE YOUR NUMBER?")) {
												this.print("");
												
												Random chance = new Random();
												int realChance = chance.nextInt(1);
												
												if (realChance == 0) {
													this.print("OF COURSE! I'M SO SORRY I TOTALLY FORGOT TO GET IT FROM YOU!");
													this.print("");
													realChance = chance.nextInt(2);
													if(realChance == 0) {
														this.print("SHE FINISHES GIVING YOU HER NUMBER AND SURPRISES YOU WITH A HUG");
														this.print("SHE SAYS(THANK YOU FOR TAKING ME TO DINNER... I HOPE WE CAN SEE EACH OTHER SOON)");
														
														GameCode.setStress(GameCode.getStress() - 8);
														
													}
												if(realChance == 1) {
													this.print("SHE SAYS (I DON'T KNOW IF WE SHOULD SEE EACH OTHER AGAIN, MY BOYFRIEND DOESN'T REALLY WANT ME TO BE TALKING TO GUYS HE DOESN'T KNOW... ");
													this.print("THANKS FOR INVITING ME OUT THOUGH I REALLY APPRECIATE IT)");
													this.print("");
													this.print("WELL... THERE GOES YOUR LUCK...");
													
													break;
													//this.stopEvent();
												}
												if(realChance == 2) {
													this.print("SHE SAYS (WHAT WILL I DO WITH THAT NUMBER IF I GIVE IT TO YOU?)");
													this.query(new String [] {"YOU SAY(CALL IT?)", "YOU SAY(I WOULD TEXT YOU?)", "YOU SAY(I WOULD GIVE IT AWAY TO A LOT OF GUYS) #SARCASTICALLY", "KISS HER"});
													this.setSelected("lame");
													
													if (this.checkSelected("YOU SAY(CALL IT?)")) {
														this.print("SHE SAYS(HMMMM... OK BUT I BETTER EXPECT A CALL SOON ;) )");
														this.print("SHE GIVES YOU HER NUMBER, THE BUS ARRIVES, AND YOU WAVE HER GOODBYE");
														GameCode.setStress(GameCode.getStress() - 2);
														
														break;
														
														//this.stopEvent();
													}
												}
													
												if (this.checkSelected("YOU SAY(I WOULD TEXT YOU?")) {
													this.print("SHE SAYS(HMMMMM... I GUESS SOOOOOOOO");
													this.print("");
													this.print("SHE GIVES YOU HER NUMBER, SAYS GOODBYE, AND LEAVES");
													
													break;
													//this.stopEvent();
												}
													
												if (this.checkSelected("YOU SAY(I WOULD GIVE IT AWAY TO A LOT OF GUYS) #SARCASTICALLY")) {
														
													realChance = chance.nextInt(1);
														
													if(realChance == 0) {
														this.print("SHE SAYS (HA HA... VERY FUNNY :). SHE GIVES YOU HER NUMBER AND WHISPERS");
														this.print("I REALLY HOPE I GET TO SHE YOU AGAIN ;) )");
														this.print("SHE SAYS IT JUST SOFT ENOUGH THAT IT SENDS A SHIVER UP YOUR SPINE");
														this.print("SHE GETS ON THE BUS AND WAVES YOU GOODBYE");
														GameCode.setStress(GameCode.getStress() - 3);
														
														break;
														//this.stopEvent();
													}
														
													if(realChance == 1) {
														this.print("SHE SAYS (OHHHHH... SIGN ME UP!)");
														this.print("");
														this.print("YOU GIVE HER YOUR NUMBER, SHE GETS ON THE BUS, AND LEAVES");
														this.print("WELL... YOU BLEW IT...");
														GameCode.setStress(GameCode.getStress() + 3);
														
														break;
													}
													
												}
												
										if (this.checkSelected("FORGET ABOUT IT")) {
												this.print("SHE SAYS (ARE YOU SURE?!)");
													
												this.query(new String [] {"YOU SAY (YA I DON'T REALLY KNOW WHY I WENT THIS WAY", "YEP, SEE YA!"});
													
												if (this.checkSelected("YOU SAY (YA I DON'T REALLY KNOW WHY I WENT THIS WAY")) {
													this.print("OH, OK... SEE YA LATER");
													this.print("BRUH");
													this.print("WELL THAT WAS STRESSFUL...");
													GameCode.setStress(GameCode.getStress() + 5);
													
													break;
													//this.stopEvent();
												}
													
												if (this.checkSelected("YUP, SEE YA!")) {
													this.print("SHE SAYS (SEE YA...)");
													
													realChance = chance.nextInt(9);
													
													if (realChance == 8) {
														this.print("YOU GET REDEMPTION!!!");
														this.print("WOULD YOU LIKE ANOTHER CHANCE?");
															
														this.query(new String [] {"YES", "NO"});
															
														if (this.checkSelected("YES")) {
															this.print("REDEMPTION ACCEPTED!");
															this.print("YOU GO BACK THREE STEPS!");
														}
															
														else if(this.checkSelected("NO")){
															break;
														}
													}
													else {
														break;
													}
														
														
													//this.stopEvent();
												}
													
													
												//this.stopEvent();
											}
										}
												
									}
										//this.stopEvent();
									}
									if (this.checkSelected("FORGET ABOUT IT")) {
										this.print("BRUH");
										//this.stopEvent();
									}
									if (this.checkSelected("SCREAM AND SHOUT UNTIL SHE CAN HEAR YOU")) {
										this.print("BRUH");
										//this.stopEvent();
									}
									if (this.checkSelected("THROW SOMETHING AT HER")) {
										this.print("BRUH");
										//this.stopEvent();
									}
										
									//this.stopEvent();
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
							if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
								this.print("BRUH");
								//this.stopEvent();
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
