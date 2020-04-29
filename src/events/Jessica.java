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
			
			//if (this.checkSelected("unimportant")) {
				while(selected == 0) {
						
					if (this.checkSelected("unimportant")) {
						this.print("WHILE LOOKING AROUND... A GIRL WALKS UP TO YOU AND ASKS YOU WHERE YOU'RE GOING?");
						this.print(" ");
						this.query(new String [] {"ACTUALLY TELL HER WHERE YOU'RE GOING", "SAY (WHOSE ASKING?)", "KEEP WALKING"});
						this.setSelected("lame");
					}
					
						if (this.checkSelected("ACTUALLY TELL HER WHERE YOU'RE GOING")) {
							this.print("SHE ASKS IF SHE CAN WALK WITH YOU");
							this.print(" ");
							this.print("WHAT DO YOU DO?");
							this.print(" ");
							this.query(new String [] {"RUN", "SAY (SURE!)", "SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)"});
							
							//selected = 2;
						}
							//while(selected == 2) {
								
								if (this.checkSelected("RUN")) {
								
									/*if(textInterface.selected.equals("MALE")) {
										this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU");
									}
									
									if (textInterface.selected.equals("FEMALE")) {
										this.print("THIS GIRL COULD HAVE BEEN A DRAMA QUEEN");
									}
									*/
									
									
									this.print("YOU RAN... FROM A GIRL... THAT WAS TALKING TO YOU... GOOD JOB");
									
									//selected = 0;
									break;
								}
							
								if (this.checkSelected("SAY (SURE!)")) {
									this.print("SHE STARTS WALKING WITH YOU");
									this.print(" ");
									this.print("YOU TALK FOR A WHILE AND YOU CONNECT PRETTY WELL WITH HER. SHE ASKS YOU IF YOUR BUSY AND HAVE TIME TO GO GET DINNER");
									this.print(" ");
									this.query(new String [] {"I NEED TO GET BACK... I HAVE A LOT OF HOMEWORK TO DO", "SAY (THAT SOUNDS PRETTY GOOD... I'M DOWN)", "RUN", "SAY(MARRY ME!)"});
									
									//selected = 3;
								}
								 	//while(selected == 3) {
								
										if (this.checkSelected("I NEED TO GET BACK... I HAVE A LOT OF HOMEWORK TO DO")) {
											this.print("SHE SAYS OK AND ASKS IF SHE COULD HAVE YOUR NUMBER?");
											this.print(" ");
											this.query(new String [] {"SAY (ABSOLUTELY)", "SAY (HMMMM...)", "SAY (I DON'T THINK WE SHOULD SEE EACH OTHER AGAIN...) AND YOU RUN"});
											
											//selected = 4;
										}
											//while (selected == 4) {
											if (this.checkSelected("SAY (ABSOLUTELY!)")) {
												this.print("SHE GIVES YOU HER NUMBER, SMILES, AND LEAVES");
												this.print(" ");
												this.print("THIS WAS A MILD SUCCESS... YOU'RE RELIEVED");
												GameCode.setStress(GameCode.getStress() - 5);
												
												selected = 0;
												break;
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
											}
											
											if (this.checkSelected("SAY (I DON'T THINK WE SHOULD SEE EACH OTHER AGAIN...) AND YOU RUN")) {
												this.print("WHAT IS WRONG WITH YOU... JUST SAD");
												this.print("YOU GET STRESSED FROM LEAVING THE SCENE SUDDENLY");
												GameCode.setStress(GameCode.getStress() + 10);
												
												break;
											}								
										
										if (this.checkSelected("SAY (THAT SOUNDS PRETTY GOOD... I'M DOWN)")) {
											this.print("SHE SAYS (GREAT! WHERE DO YOU WANT TO EAT?)");
											this.query(new String [] {"SAY (IDC)", "SAY (WHAT SOUNDS GOOD)", "CHOOSE THE CHEAP OPTION", "CHOOSE A MORE EXPENSIVE OPTION"});
										}
										
											if (this.checkSelected("SAY (IDC)")) {
												this.print("SHE GETS ANNOYED AND JUST SAYS (I'M ACTUALLY NOT THAT HUNGRY BUT I'LL TALK TO YOU LATER), GIVES YOU HER NUMBER AND LEAVES");
												this.print(" ");
												this.print("I WOULDN'T CALL THAT A SUCCESS, BUT AT LEAST SHE WAS NICE ABOUT IT");
												GameCode.setStress(GameCode.getStress() + 2);
												
												break;
											}
											
											if (this.checkSelected("SAY (WHAT SOUNDS GOOD)")) {
												this.print("SHE SAYS (HMMMM... IDC YOU CHOOSE)");
												this.query(new String [] {"SAY (IDC)", "CHOOSE THE CHEAP OPTION", "CHOOSE A MORE EXPENSIVE OPTION"});
											}
											
												if (this.checkSelected("SAY (IDC)")) {
													this.print("SHE GETS ANNOYED AND JUST SAYS (I'M ACTUALLY NOT THAT HUNGRY BUT ILL TALK TO YOU LATER), GIVES YOU HER NUMBER AND LEAVES");
													this.print(" ");
													this.print("I WOULDN'T CALL THAT A SUCCESS, BUT AT LEAST SHE WAS NICE ABOUT IT");
													GameCode.setStress(GameCode.getStress() + 2);
													
													break;
												}
												
												if (this.checkSelected("CHOOSE THE CHEAP OPTION")) {
													this.print("SHE SAYS (OK THAT SOUNDS PRETTY GOOD)");
													this.print("UNDER NORMAL CIRCUMSTANCES YOU SHOULD NEVER CHOOSE THE CHEAP OPTION, BUT IN THIS PARTITCULAR SITUATION YOU'RE COLLEGE STUDENTS");
													this.print("SO THIS IS A VERY VIABLE OPTION AND ON TOP OF THAT SHE ACTUALLY LOOKS RELIEVED THAT YOU CHOOSE TO GO THERE");
													this.print("YOU EAT... TALK FOR A WHILE... GET HER NUMBER AND GO HOME");
													
													GameCode.setStress(GameCode.getStress() - 2);
													
													break;
												}
												
												if (this.checkSelected("CHOOSE A MORE EXPENSIVE OPTION")) {
													this.print("SHE SAYS (WELL... THAT DOES SOUND REALLY GOOD, BUT I DON'T HAVE ANY MONEY. DO YOU CARE IF WE GO TO A FAST FOOD RESTAURANT INSTEAD");
													this.query(new String [] {"SAY (MCDONALDS?)", "SAY (JIMMY JOHNS?)", "TRY THE CHEAP OPTION AGAIN", "SAY (EXTREMELY FANCY RESTAURANT?)"});
												}
													
													if (this.checkSelected("SAY (MCDONALDS?)")) {
														this.print("YOU EAT IN ALMOST COMPLETE SILENCE AND SHE GETS UP AND SAYS THAT WAS GOOD AND I'LL SEE YOU LATER");
														this.print("YOU REALIZE THAT YOU FORGOT TO ASK FOR HER NUMBER");
														this.print("");
														this.print("WHAT DO YOU DO?");
														this.query(new String [] {"CATCH HER BEFORE SHE LEAVES", "FORGET ABOUT IT", "SCREAM AND SHOUT UNTIL SHE CAN HEAR YOU", "THROW SOMETHING AT HER"});
													}
														
														if (this.checkSelected("CATCH HER BEFORE SHE LEAVES")) {
															this.print("YOU THROW EVERYTHING AWAY AND RUN OUT THE DOOR TO FIND HER LUCKILY SHE WAS JUST WAITING AT THE BUS STOP");
															this.print("YOU RUN UP TO HER AND SAY (HEY! WAIT!)");
															this.print("SHE LOOKS OVER AND YOU SAY?");
															this.query(new String [] {"I FORGOT TO ASK IF I COULD HAVE YOUR NUMBER?", "I FORGOT TO ASK IF YOU WANTED A RIDE HOME?", "I HATE YOU", "KISS HER"});
														}
															
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
																		
																		break;
																	}
																}
																
																if(realChance == 1) {
																	this.print("SHE SAYS (I DON'T KNOW IF WE SHOULD SEE EACH OTHER AGAIN, MY BOYFRIEND DOESN'T REALLY WANT ME TO BE TALKING TO GUYS HE DOESN'T KNOW... ");
																	this.print("THANKS FOR INVITING ME OUT THOUGH I REALLY APPRECIATE IT)");
																	this.print("");
																	this.print("WELL... THERE GOES YOUR LUCK...");
																	
																	break;
																}
																
																if(realChance == 2) {
																	this.print("SHE SAYS (WHAT WILL I DO WITH THAT NUMBER IF I GIVE IT TO YOU?)");
																	this.query(new String [] {"YOU SAY(CALL IT?)", "YOU SAY(I WOULD TEXT YOU?)", "YOU SAY(I WOULD GIVE IT AWAY TO A LOT OF GUYS) #SARCASTICALLY", "KISS HER"});
																}
																	
																	if (this.checkSelected("YOU SAY(CALL IT?)")) {
																		this.print("SHE SAYS(HMMMM... OK BUT I BETTER EXPECT A CALL SOON ;) )");
																		this.print("SHE GIVES YOU HER NUMBER, THE BUS ARRIVES, AND YOU WAVE HER GOODBYE");
																		GameCode.setStress(GameCode.getStress() - 2);
																		
																		break;
																	}
																
																	if (this.checkSelected("YOU SAY(I WOULD TEXT YOU?")) {
																		this.print("SHE SAYS(HMMMMM... I GUESS SOOOOOOOO");
																		this.print("");
																		this.print("SHE GIVES YOU HER NUMBER, SAYS GOODBYE, AND LEAVES");
																			
																		break;
																	}
																			
																	if (this.checkSelected("YOU SAY(I WOULD GIVE IT AWAY TO A LOT OF GUYS) #SARCASTICALLY")) {
																				
																		realChance = chance.nextInt(1);
																				
																		if(realChance == 0) {
																			this.print("SHE SAYS \"HA HA... VERY FUNNY :)\". SHE GIVES YOU HER NUMBER AND WHISPERS");
																			this.print("\"I REALLY HOPE I GET TO SHE YOU AGAIN ;)\")");
																			this.print("SHE SAYS IT JUST SOFT ENOUGH THAT IT SENDS A SHIVER UP YOUR SPINE");
																			this.print("SHE GETS ON THE BUS AND WAVES YOU GOODBYE");
																			GameCode.setStress(GameCode.getStress() - 15);
																				
																			break;
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
																	
																	if (this.checkSelected("KISS HER")) {
																		
																		realChance = chance.nextInt(1);
																		
																		if (realChance == 0) {
																			this.print("YOU KISS HER AND SHE LUNGES BACKWARDS AND LOOKS SHOCKED");
																			this.print("");
																			this.print("SHE SAYS \"HOW DARE YOU!\"");
																			this.print("\"I HAVE A BOYFRIEND FOR YOUR INFORMATION!\"");
																			this.print("SHE SLAPS YOU IN THE FACE AND STORMS AWAY...");
																			this.print("YOU LOOK AROUND AND SEE A WHOLE BUNCH OF PEOPLE STARING AT YOU");
																			
																			GameCode.setStress(GameCode.getStress() + 15);
																			
																			break;
																		}
																		
																		if (realChance == 1) {
																			this.print("YOU KISS HER AND SHE TAKES A LITTLE STEP BACK");
																			this.print("SHE SAYS \"WOW... I DON'T KNOW WHAT TO SAY...\"");
																			this.print("SHE WHISPERS INTO YOUR EAR \"I HOPE WE MEET AGAIN SOON ;)\"");
																			this.print("SHE GETS ONTO THE BUS AND WINKS AT YOU AS THE BUS DRIVES AWAY");
																			this.print("");
																			this.print("WELL THAT WENT BETTER THAN EXPECTED...");
																			
																			GameCode.setStress(GameCode.getStress() - 10);
																			
																			break;
																			
																		}	
																	}	
															
															
													if (this.checkSelected("FORGET ABOUT IT")) {
															this.print("SHE SAYS \"ARE YOU SURE?!\"");
															this.query(new String [] {"YOU SAY \"YA I DON'T REALLY KNOW WHY I WENT THIS WAY\"", "YOU SAY \"YEP, SEE YA!\""});
													}
													
															if (this.checkSelected("YOU SAY (YA I DON'T REALLY KNOW WHY I WENT THIS WAY")) {
																	this.print("OH, OK... SEE YA LATER");
																	this.print("BRUH");
																	this.print("WELL THAT WAS STRESSFUL...");
																	GameCode.setStress(GameCode.getStress() + 5);
																	
																	break;
															}
																	
																if (this.checkSelected("YUP, SEE YA!")) {
																	this.print("SHE SAYS (SEE YA...)");
																	
																	realChance = chance.nextInt(9);
																	
																	if (realChance == 8) {
																		this.print("YOU GET REDEMPTION!!!");
																		this.print("WOULD YOU LIKE ANOTHER CHANCE?");
																			
																		this.query(new String [] {"YES", "NO"});
																	}
																	
																		//FIXME
																		if (this.checkSelected("YES")) {
																			this.print("REDEMPTION ACCEPTED!");
																			this.print("YOU GO BACK THREE STEPS!");
																		}
																			
																		else if(this.checkSelected("NO")) {
																			this.print("GOOD JOB...");
																			
																			break;
																		}
																}
																	
																else {
																	break;
																}
																
															if (this.checkSelected("I FORGOT TO ASK IF YOU WANTED A RIDE HOME")) {
																this.print("SHE SAYS (OH! SURE THAT WOULD BE GREAT!");
																this.print("YOU TAKE HER HOME AND WAVE GOOD BYE");
																this.print("");
																this.print("SMART CHOICE");
																
																GameCode.setStress(GameCode.getStress() - 10);
																
																break;
															}
															
															if (this.checkSelected("I HATE YOU")) {
																this.print("YOU STORM OFF!");
																this.print("YOU LOOK BEHIND YOU AND SHE LOOKS A LITTLE FRIGHTENED...");
																this.print("");
																this.print("WELL YOU JUST RUINED YOUR CHANCES...");
																
																break;
															}
															
															if (this.checkSelected("KISS HER")) {
																realChance = chance.nextInt(1);
																
																if (realChance == 0) {
																	this.print("YOU KISS HER AND SHE LUNGES BACKWARDS AND LOOKS SHOCKED");
																	this.print("");
																	this.print("SHE SAYS \"HOW DARE YOU!\"");
																	this.print("\"I HAVE A BOYFRIEND FOR YOUR INFORMATION!\"");
																	this.print("SHE SLAPS YOU IN THE FACE AND STORMS AWAY...");
																	this.print("YOU LOOK AROUND AND SEE A WHOLE BUNCH OF PEOPLE STARING AT YOU");
																	
																	GameCode.setStress(GameCode.getStress() + 15);
																	
																	break;
																}
																
																if (realChance == 1) {
																	this.print("YOU KISS HER AND SHE TAKES A LITTLE STEP BACK");
																	this.print("SHE SAYS \"WOW... I DON'T KNOW WHAT TO SAY...\"");
																	this.print("SHE WHISPERS INTO YOUR EAR \"I HOPE WE MEET AGAIN SOON ;)\"");
																	this.print("SHE GETS ONTO THE BUS AND WINKS AT YOU AS THE BUS DRIVES AWAY");
																	this.print("");
																	this.print("WELL THAT WENT BETTER THAN EXPECTED...");
																	
																	GameCode.setStress(GameCode.getStress() - 10);
																	
																	break;
																	
																}	
															}	
					
													if (this.checkSelected("SCREAM AND SHOUT UNTIL SHE CAN HEAR YOU")) {
														
														this.print("YOU SCREAM AS LOUD AS YOU CAN CALLING HER NAME");
														
														realChance = chance.nextInt(1);
														
														if(realChance == 0) {
															this.print("SHE HEARS YOU AND WALKS BACK");
															this.print("SHE SAYS \"YA... WHAT'S UP?\"");
															this.print("");
															this.print("WHAT DO YOU SAY?");
															this.query(new String [] {"YOU SAY \"I JUST WANTED TO SEE YOUR FACE AGAIN\"","YOU SAY \"NOTHING... I JUST LIKE TALKING TO YOU :)\"", "LEAVE", "MAKE A RUCKUS"});
														}
															if (this.checkSelected("YOU SAY \"I JUST WANTED TO SEE YOUR FACE AGAIN\"")) {
																this.print("SHE BLUSHES AND SAYS \"STOP... YOU'RE TOO KIND");
																this.print("SHE GIVES YOU A HUG AND SAYS NOW I REALLY HAVE TO GO THIS TIME");
																this.print("");
																this.print("AND WITH THAT. SHE LEAVES");
																
																GameCode.setStress(GameCode.getStress() - 8);
																
																break;
															}
															
															if (this.checkSelected("YOU SAY \"NOTHING... I JUST LIKE TALKING TO YOU :)\"")) {
																this.print("SHE SAYS \"OH YOU...\"");
																this.print("\"I REALLY HAVE TO GO THOUGH... I ENJOYED EATING WITH YOU AND I HOPE WE MEET AGAIN");
																this.print("");
																this.print("SHE LEAVES ANDDDDDD YOU FORGOT HER NUMBER");
																
																break;
															}
															
															if (this.checkSelected("LEAVE")) {
																this.print("WOW");
																
																break;
															}
															
															if (this.checkSelected("MAKE A RUCKUS")) {
																this.print("YOU BANG THINGS AGAINST THE WALL AND REALLY MAKE LOUD NOISES");
																this.print("SHE HIDES HER FACE AND ACTS LIKE SHE DOESN'T KNOW YOU");
																this.print("SHE SPEED WALKS OUT THE BUILDING");
																this.print("");
																this.print("WHY YOU GOTTA BE SO LOUD");
																
																GameCode.setStress(GameCode.getStress() + 5);
																
																break;
															}
														}
														
														if(realChance == 1) {
															this.print("YOU TRIED AND YOU FAILED");
															this.print("THE ONLY THING YOU MANAGED TO DO IS MAKE PEOPLE AROUND YOU LOOK AT YOU LIKE YOU'RE CRAZY");
															this.print("");
															this.print("GOOD JOB");
															
															GameCode.setStress(GameCode.getStress() + 5);
															
															break;
														}
													}
													
													if (this.checkSelected("THROW SOMETHING AT HER")) {
														
														this.print("WHAT DO YOU THROW?");
														this.query(new String [] {"A NAPKIN CONTAINER", "A TRAY", "YOUR BACKPACK", "A NAPKIN", "A CALCULATOR"});
													}
													
														if (this.checkSelected("A NAPKIN CONTAINER")) {
															this.print("YOU FIND IT ON THE TABLE");
															this.print("YOU AIM AND");
															
															Random chance = new Random();
															int realChance = chance.nextInt(2);
															
															if (realChance == 0) {
																this.print("YOU MISSED HER");
																this.print("ANNNNNNNDDDDD");
																this.print("SHE GOT AWAY");
																this.print("");
																this.print("DARN");
																
																break;
															}
															if (realChance == 1) {
																this.print("YOU MISSED HER");
																this.print("ANNNNNNNDDDDD");
																this.print("YOU BROKE A WINDOW TOO...");
																this.print("YOU END UP PAYING A HEFTY FINE FOR THE WINDOW");
																this.print("");
																
																break;
															}
															
															if (realChance == 2) {
																this.print("YOU HIT HER");
																this.print("ANNNNNNNDDDDD");
																this.print("SHE SEES YOU AND COMES BACK");
																
																realChance = chance.nextInt(1);
																
																if(realChance == 0) {
																	this.print("SHE HEARS YOU AND WALKS BACK");
																	this.print("SHE SAYS \"YA... WHAT'S UP?\"");
																	this.print("");
																	this.print("WHAT DO YOU SAY?");
																	this.query(new String [] {"YOU SAY \"I JUST WANTED TO SEE YOUR FACE AGAIN\"","YOU SAY \"NOTHING... I JUST LIKE TALKING TO YOU :)\"", "LEAVE", "KISS HER"});
																}
																
																	if (this.checkSelected("YOU SAY \"I JUST WANTED TO SEE YOUR FACE AGAIN\"")) {
																		this.print("SHE BLUSHES AND SAYS \"STOP... YOU'RE TOO KIND");
																		this.print("SHE SAYS \"YOU KNOW THAT KIND OF HURT\" AS SHE LIGHTLY PUNCHES YOU IN THE SHOULDER");
																		this.print("SHE GIVES YOU A HUG");
																		this.print("");
																		this.print("AND WITH THAT. SHE LEAVES");
																		
																		GameCode.setStress(GameCode.getStress() - 10);
																		
																		break;
																	}
																	
																	if (this.checkSelected("YOU SAY \"NOTHING... I JUST LIKE TALKING TO YOU :)\"")) {
																		this.print("SHE SAYS \"OH YOU...\"");
																		this.print("\"I REALLY HAVE TO GO THOUGH... I ENJOYED EATING WITH YOU AND I HOPE WE MEET AGAIN");
																		this.print("");
																		this.print("SHE LEAVES ANDDDDDD YOU FORGOT HER NUMBER");
																		
																		break;
																	}
																	
																	if (this.checkSelected("LEAVE")) {
																		this.print("WOW");
																		
																		break;
																	}
																	
																	if (this.checkSelected("KISS HER")) {
																		
																		realChance = chance.nextInt(1);
																		
																		if (realChance == 0) {
																			this.print("YOU KISS HER AND SHE LUNGES BACKWARDS AND LOOKS SHOCKED");
																			this.print("");
																			this.print("SHE SAYS \"HOW DARE YOU!\"");
																			this.print("\"I HAVE A BOYFRIEND FOR YOUR INFORMATION!\"");
																			this.print("SHE SLAPS YOU IN THE FACE AND STORMS AWAY...");
																			this.print("YOU LOOK AROUND AND SEE A WHOLE BUNCH OF PEOPLE STARING AT YOU");
																			
																			GameCode.setStress(GameCode.getStress() + 15);
																			
																			break;
																		}
																		
																		if (realChance == 1) {
																			this.print("YOU KISS HER AND SHE TAKES A LITTLE STEP BACK");
																			this.print("SHE SAYS \"WOW... I DON'T KNOW WHAT TO SAY...\"");
																			this.print("SHE WHISPERS INTO YOUR EAR \"I HOPE WE MEET AGAIN SOON ;)\"");
																			this.print("SHE  WINKS AT YOU AS SHE LEAVES THE BUILDING");
																			this.print("");
																			this.print("WELL THAT WENT BETTER THAN EXPECTED...");
																			
																			GameCode.setStress(GameCode.getStress() - 10);
																			
																			break;
																			
																		}
																	}
																}
																
																if(realChance == 1) {
																	this.print("YOU TRIED AND YOU FAILED");
																	this.print("THE ONLY THING YOU MANAGED TO DO IS MAKE PEOPLE AROUND YOU LOOK AT YOU LIKE YOU'RE CRAZY");
																	this.print("");
																	this.print("GOOD JOB");
																	
																	break;
																}
															}
														
														
														if (this.checkSelected("A TRAY")) {
															
															Random chance = new Random();
															int realChance = chance.nextInt(1);
			
															
															this.print("YOU GRAB THE TRAY AND CHUCK IT");
															
															if(realChance == 0) {
																this.print("THE TRAY HITS HER");
																this.print("HITS HER A LITTLE TOO WELL");
																this.print("");
																this.print("SHE DEFINITELY HAS A CONCUSSION NOW");
																this.print("WHY DID YOU THINK THIS WAS A GOOD IDEA");
																
																GameCode.setStress(GameCode.getStress() + 15);
																
																break;
															}
															
															if(realChance == 1) {
																this.print("THE TRAY HITS THE LADY BESIDE HER");
																this.print("LUCKY FOR YOU SHE WAS A STATE CHAMP WRESTLER WHO CAN TAKE ANYTHING...");
																this.print("UNLUCKY FOR YOU THAT SHE HAS ANGER ISSUES...");
																this.print("SHE BREAK THE TRAY IN HALF AND RUNS OVER FAST ENOUGH TO WHERE YOU CAN'T RUN AWAY");
																this.print("SHE PINS YOU AGAINST THE TABLE AND BREAKS YOUR ARM");
																this.print("");
																this.print("I DON'T EVEN FEEL SORRY FOR YOU...");
																
																GameCode.setHealth(GameCode.getHealth() - 20);	
																
																break;			
															}
				
														}
														
														if (this.checkSelected("YOUR BACKPACK")) {
															this.print("YOU REACH FOR YOUR BACKPACK");
															this.print("BUT AT THE SAME MOMENT YOU REALIZE THAT THIS IS A HORRIBLE CHOICE");
															this.print("YOU SPEND A MINUTE CONTEMPLATING YOUR LIFE DECISIONS");
															this.print("YOU LET HER GET AWAY BUT YOU MADE THE RIGHT DECISION");
															this.print("");
															this.print("GOOD JOB");
															
															break;
														}
														
														if (this.checkSelected("A NAPKIN")) {
															this.print("WHY EVEN TRY..");
															this.print("");
															this.print("SHE'S GONE");
															
															break;
														}
														
														if (this.checkSelected("A CALCULATOR")) {
															this.print("YOU REACH INTO YOUR BAG AND REALIZE YOU DON'T REMEMBER WHAT POCKET IT'S IN...");
															this.print("");
															this.print("WHICH POCKET DO YOU TRY?");
															
															this.query(new String [] {"FRONT POCKET", "SIDE POCKET"});
														}
														
																if (this.checkSelected("FRONT POCKET")) {
																	this.print("YOU ZIP OPEN THE FRONT POCKET");
																	this.print("SEARCH THROUGH ALL OF THE LOOSE PAPERS");
																	this.print("YOU REALLY HAVE TO CLEAN YOUR BACKPACK");
																	this.print("");
																	this.print("YOU EVENTUALLY REALIZE THAT SHE GOT AWAY AND IT WASN'T EVEN WORTH LOOKING FOR");
				
																	break;
																}
															
																if (this.checkSelected("SIDE POCKET")) {
																	this.print("YOU ZIP OPEN THE SIDE POCKET");
																	this.print("SEARCH THROUGH ALL OF THE LOOSE PAPERS");
																	this.print("YOU REALLY HAVE TO CLEAN YOUR BACKPACK");
																	this.print("");
																	this.print("YOU FIND IT!");
																	this.print("YOU AIM AND ");
																	
																	Random chance = new Random();
																	int realChance = chance.nextInt(1);
																	
																	if (realChance == 0) {
																		this.print("YOU MISSED HER");
																		this.print("ANNNNNNNDDDDD");
																		this.print("SHE GOT AWAY");
																		this.print("");
																		this.print("DARN");
																		
																		break;
																	}
																	
																	if (realChance == 2) {
																		this.print("YOU HIT HER");
																		this.print("ANNNNNNNDDDDD");
																		this.print("SHE SEES YOU AND COMES BACK");
																		
																		realChance = chance.nextInt(1);
																		
																		if(realChance == 0) {
																			this.print("SHE HEARS YOU AND WALKS BACK");
																			this.print("SHE SAYS \"YA... WHAT'S UP?\"");
																			this.print("");
																			this.print("WHAT DO YOU SAY?");
																			this.query(new String [] {"YOU SAY \"I JUST WANTED TO SEE YOUR FACE AGAIN\"","YOU SAY \"NOTHING... I JUST LIKE TALKING TO YOU :)\"", "LEAVE", "KISS HER"});
																		}
																			if (this.checkSelected("YOU SAY \"I JUST WANTED TO SEE YOUR FACE AGAIN\"")) {
																				this.print("SHE BLUSHES AND SAYS \"STOP... YOU'RE TOO KIND");
																				this.print("SHE SAYS \"YOU KNOW THAT KIND OF HURT\" AS SHE LIGHTLY PUNCHES YOU IN THE SHOULDER");
																				this.print("SHE GIVES YOU A HUG");
																				this.print("");
																				this.print("AND WITH THAT. SHE LEAVES");
																				
																				GameCode.setStress(GameCode.getStress() - 10);
																				
																				break;
																			}
																			
																			if (this.checkSelected("YOU SAY \"NOTHING... I JUST LIKE TALKING TO YOU :)\"")) {
																				this.print("SHE SAYS \"OH YOU...\"");
																				this.print("\"I REALLY HAVE TO GO THOUGH... I ENJOYED EATING WITH YOU AND I HOPE WE MEET AGAIN");
																				this.print("");
																				this.print("SHE LEAVES ANDDDDDD YOU FORGOT HER NUMBER");
																				
																				break;
																			}
																			
																			if (this.checkSelected("LEAVE")) {
																				this.print("WOW");
																				
																				break;
																			}
																			
																			if (this.checkSelected("KISS HER")) {
																				
																				realChance = chance.nextInt(1);
																				
																				if (realChance == 0) {
																					this.print("YOU KISS HER AND SHE LUNGES BACKWARDS AND LOOKS SHOCKED");
																					this.print("");
																					this.print("SHE SAYS \"HOW DARE YOU!\"");
																					this.print("\"I HAVE A BOYFRIEND FOR YOUR INFORMATION!\"");
																					this.print("SHE SLAPS YOU IN THE FACE AND STORMS AWAY...");
																					this.print("YOU LOOK AROUND AND SEE A WHOLE BUNCH OF PEOPLE STARING AT YOU");
																					
																					GameCode.setStress(GameCode.getStress() + 15);
																					
																					break;
																				}
																				
																				if (realChance == 1) {
																					this.print("YOU KISS HER AND SHE TAKES A LITTLE STEP BACK");
																					this.print("SHE SAYS \"WOW... I DON'T KNOW WHAT TO SAY...\"");
																					this.print("SHE WHISPERS INTO YOUR EAR \"I HOPE WE MEET AGAIN SOON ;)\"");
																					this.print("SHE  WINKS AT YOU AS SHE LEAVES THE BUILDING");
																					this.print("");
																					this.print("WELL THAT WENT BETTER THAN EXPECTED...");
																					
																					GameCode.setStress(GameCode.getStress() - 10);
																					
																					break;
																					
																				}
																			}
																		}
																		
																		if(realChance == 1) {
																			this.print("YOU TRIED AND YOU FAILED");
																			this.print("THE ONLY THING YOU MANAGED TO DO IS MAKE PEOPLE AROUND YOU LOOK AT YOU LIKE YOU'RE CRAZY");
																			this.print("");
																			this.print("GOOD JOB");
																			
																			break;
																		}		
															}
											//}			
								 	//}
															
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
		
										
								if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
									this.print("SHE SAYS \"OH! SURE!\"");
									this.print("SHE ASKS FOR YOUR NUMBER");
									this.print("");
									this.print("WHAT DO YOU DO?");
									this.query(new String [] {"SAY \"YA, HERE YOU GO!\"", "SAY \"LOOK A BIRD\"", "SAY \"NO\""});
								}
								
									if (this.checkSelected("SAY \"YA, HERE YOU GO!\"")) {
										this.print("SHE SAYS \"THANKS I LOOK FORWARD TO TALKING TO YOU!\"");
										this.print("SHE BITES HER LIP AND WAVES YOU GOOD BYE");
										this.print("");
										this.print("SCORE!!!!");
										
										GameCode.setStress(GameCode.getStress() - 2);
										
										break;
									}	
									
									if (this.checkSelected("SAY \"LOOK A BIRD\"")) {
										this.print("SHE LOOKS AT THE BIRD");
										this.print("");
										this.print("WHAT'S YOUR PLAN NOW?");
										this.query(new String [] {"RUN", "THERE ACTUALLY WAS A BIRD", "SAY \"JK... LOL\""});
									}
										if (this.checkSelected("RUN")) {
											this.print("WOW");
											this.print("");
											this.print("GREAT PLAN...");
											
											break;
										}
										
										if (this.checkSelected("THERE ACTUALLY WAS A BIRD")) {
											this.print("SHE LOOKS BACK AND SAYS \"YA... COOL BIRD\"");
											this.print("");
											this.print("WHAT DO YOU DO?");
											this.query(new String [] {"RECOVER", "BE AWKWARD", "SAY \"K... BYE\""});
										}
											if (this.checkSelected("RECOVER")) {
												this.print("YOU SAY?");
												this.print("");
												this.query(new String [] {"\"SORRY... I'M JUST REALLY INTO BIRDS\"", "\"YA\"", "\"COOL HUH\""});
											}
												if (this.checkSelected("\"SORRY... I'M JUST REALLY INTO BIRDS\"")) {
													this.print("SHE SAYS \"OH THAT PRETTY COOL!\"");
													this.print("");
													this.print("SHE SAYS \"OK SEE YOU AROUND!\"");
													this.print("THERE REALLY WAS NO RECOVERY FOR THAT STATEMENT...");
													
													break;
												}
												
												if (this.checkSelected("SAY \"YA\"")) {
													this.print("SHE SAYS \"OK... SEE YOU LATER\"");
													this.print("");
													this.print("GREAT JOB...");
													this.print("THERE REALLY WAS NO RECOVERY FOR THAT STATEMENT...");
													
													break;
												}
												
												if (this.checkSelected("SAY \"JK... LOL\"")) {
													this.print("SHE SAYS \"OH... HAHA... I'LL SEE YOU LATER");
													this.print("");
													this.print("WOW... SMART...");
													this.print("THERE REALLY WAS NO RECOVERY FOR THAT STATEMENT...");
													
													break;
												}
												
											if (this.checkSelected("BE AWKWARD")) {
												this.print("SHE SAYS \"OK SEE YOU AROUND!\"");
												this.print("");
												this.print("SMART");
												
												break;
											}
											
											if (this.checkSelected("SAY \"K... BYE\"")) {
												this.print("TBH... THIS PROBABLY WAS YOUR BEST BET");
												this.print("");
												this.print("BUT STILL...");
												
												break;
											}
										
										if (this.checkSelected("SAY \"JK... LOL\"")) {
											this.print("WOW");
											this.print("");
											this.print("GREAT PLAN...");
											
											break;
										}
										
									
									if (this.checkSelected("SAY \"NO\"")) {
										this.print("WOW");
										this.print("");
										this.print("RUDE...");
										
										break;
									}			
							
							if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
								this.print("BRUH");
								//this.stopEvent();
							}
							if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
								this.print("BRUH");
								//this.stopEvent();
							}
								
									
									
						
						if (this.checkSelected("SAY (I'M A LITTLE BUSY RIGHT NOW BUT COULD WE TALK LATER?)")) {
							this.print("BRUH");
							//this.stopEvent();
						}
							
						//this.stopEvent();
						
						
						if (this.checkSelected("SAY (WHOSE ASKING?)")) {
							this.print("BRUH");
							this.stopEvent();
						}
						if (this.checkSelected("KEEP WALKING")) {
							this.print("BRUH");
							this.stopEvent();
						}
					
						}
					//}
			//}
		}
	}
