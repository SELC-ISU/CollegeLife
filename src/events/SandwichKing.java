package events;

import java.util.ArrayList;
import java.util.Random;

public class SandwichKing extends Event{
	private static Lost lost;
	private static boolean wonDuel;
	private static int health;
	private static Random rand;
	private static boolean backpackThrown;
	private static int timesInsulted;
	private static int numFaster;
	private static boolean lostHim;
	private static int chase;
	/** 
	 * uses the original constructer
	 */
	public SandwichKing(Lost lost) {
		super(0);
		this.lost = lost;
		rand = lost.getLostRand();
		health = 4;
		wonDuel = false;
		backpackThrown = false;
		timesInsulted = 0;
		numFaster = 0;
		lostHim = false;
		chase = 2;
	}
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	if (this.checkSelected("unimportant")) {
	this.print("As you approach him, you notice he looks a litte rough around the edges");
	this.print("You see a bottle covered with a brown sack and a half eaten sandwich. you doubt this man has any affiliation with the college, but you continue anyway");
	this.print("apon entering his personal space he jumps into a sitting upright position and Shouts");
	this.print("what have you done to my sandwich?");
	this.query(new String [] {"ignore the question and ask him for directions", "you are a person of honor, how dare he challege your integrity. tell the oaf off","Take the sandwich and run!"});
	this.setSelected("lame");
		}
	if (this.checkSelected("ignore the question and ask him for directions")||this.checkSelected("you are a person of honor, how dare he challege your integrity. tell the oaf off!")) {
		if(this.checkSelected("ignore the question and ask him for directions")) {
			this.print("i don't kn...");
			this.print("The man swiftly stands up and throws his finger in your face. pointing at you he yells");
			this.print("listen here buddy, i know what you kids are like. you think that this old man oh he is asleep! you could'nt resist and just had mess with me.");
			this.print("And then you saw it! the magnum opus of sandwiches. it was glorius and now it has been tainted by your grimy hands");
			this.print("as he steps closer to you and you begin to back up and stammer");
			this.print("i i i ... just wanted directions");
		}
		if(this.checkSelected("you are a person of honor, how dare he challege your integrity. tell the oaf off!")) {
			this.print("you dare assume I would touch your nasty sandwitch?");
		}
		this.print("the old man pauses and starts eyeing you up");
		this.query(new String[] {"try and calm him down","get out of here as fast as you can"});
		
		if(this.checkSelected("try and calm him down")) {
			this.print("sorry sir but i really did not eat the sandwich");
			this.print("then who did?");
			this.query(new String[] {"point out the sandwich remains on his beard", "suggest that a rival homeless gang stole half the sandwich", "it was that fat pidgeon"});
			if(this.checkSelected("point out the sandwich remains on his beard")) {
				this.print("well i am willing to bet those crumbs on your face are the rest of your sandwich");
				this.print("you foolish boy! I would never eat such a beauty. I take thy suggestion as an unforgivable offense! enguard!");
				if(!wonDuel) {
					duel();
				}
				else {
					this.print("shortly after being knocked out he gets up and says");
					this.print("you have conviced me you are great man and could never have done such a heinous deed");
					this.print("is there anything i can do for you?");
					this.print("well it turned out this old fart was actualy a food scientist working at the university, and was able to point you in the correct direction");
					Lost.noLongerLost();
					this.stopEvent();
					
				}
			}
			
			if(this.checkSelected("suggest that a rival homeless gang stole half the sandwich")) {
				this.print("i just got here, but you know who else was here while you were sleeping?");
				this.print("who?");
				this.print("you frantically look around and spot a group of men huddled around a burning trash can. you have no idea why it is burning as the weather is rather nice");
				this.print("i am willing to bet it was those guys over there");
				this.print("those bloody animals! i should never have let my guard down with the burnning trash gang around!");
				this.print("will you help me teach those fools a lesson?");
				this.query(new String[] {"i do need a workout today", "i do not have time for this"});
				if(this.checkSelected("i do need a workout today")) {
					this.print("well i missed my mourning workout");
					this.print("hell yeah! let's get them!");
					this.print("after saying this he jumps onto the bench and pulls a baguette out from nowhere and screams what you can only guess to be a war cry");
					this.print("with astonishing speed he runs at the gang and you scramble to catch up to him");
					this.print("with the baguette he smacks one of the three men across his face");
					this.print("he falls to the ground unconscious");
					this.print("one of the men grabs a big stick and yells enguard!");
					//** TODO: play duel of fates
					this.print("while this is happening the last burning trash member runs at you!");
					if(!wonDuel) {
						duel();
					}
					else {
						this.print("you hear the old man now on top of a hill say it is over i have the high ground");
						this.print("the burning trash can gang member lets loose a strange scream and charges the high ground");
						this.print("the old man spartan kick him in the chest and he comes tumbling down the hill and slams into a tree");
						this.print("Ah you miraculous bastard! thank you for your help!");
						this.print("is there anything i can do for you?");
						this.print("finally you ask him for directions");
						this.print("well it turned out this old fart was actualy a food scientist working at the university, and was able to point you in the correct direction");
						Lost.noLongerLost();
						this.stopEvent();
					}
				}
				if(this.checkSelected("i do not have time for this")) {
					this.print("i am sorry but i do not have time for gang fights today");
					this.print("unfortunate he says as he walks over to them");
					//** TODO: fails event
					this.stopEvent();	
				}
			}
			
			if(this.checkSelected("it was that fat pidgeon")) {
				this.print("you point to a rather round bird");
				this.print("see that plump pideon over there?");
				this.print("that god damn flying rat! will you help me catach it?");
				this.query(new String[] {"sure, what could go wrong", "no, i need to get to class"});
				if(this.checkSelected("sure, what could go wrong")) {
					this.print("yeah, i don't have anything better to do");
					this.print("great you take the other half of the sandwich and bait it over to you. then i will jump out from behind the tree and grab it");
					//** TODO: increse hungar bar
					this.print("you pick up half of a sandwich and wonder how you got into this mess"); //probably should either add a sandwich as a item or increase hunger bar
					this.print("you then wave then it around in the direction of the fat pidgeon and sure enough it begins to hop on over");
					this.print("the man leaps out from behind the tree and begins running at the pideon. as he approaches you see his foot get caught in the roots of the tree and he falls over.");
					this.print("quick get it! he yells");
					this.query(new String[] {"throw your backpack at it", "try and grab it"});
					if(this.checkSelected("throw your backpack at it")) {
						this.print("you take off your backpack and chuck it at the pidgeon");
						this.print("the poor thing never even saw it coming and you hear your backpack full of thicc text books hit the gorund with a heavy thud");
						this.print("the man runs out from behind the tree to greet you. he is ecstatic with your success");
						this.print("you pick up your backpack and grabs what remains of the bird");
					}
					if(this.checkSelected("try and grab it")) {
						this.print("by shear dumb luck this pidgeon was too fat to fly and you grab it with little effort");
						this.print("the man runs out from behind the tree to greet you. he is ecstatic with your success");
						
					}
					this.print("you hand him the bird");
					this.print("Ah you miraculous bastard! you saved my day!");
					this.print("is there anything i can do for you?");
					this.print("finally you ask him for directions");
					this.print("well it turned out this old fart was actualy a food scientist working at the university, and was able to point you in the correct direction");
					Lost.noLongerLost();
					this.stopEvent();
				}
				if(this.checkSelected("no, i need to get to class")) {
					this.print("there is no way we could catch a bird with our hands, i am  sorry i have to get to class");
					//** TODO: fails event
					this.stopEvent();
				}
			}
		}
		
		if(this.checkSelected("get out of here as fast as you can")) {
			this.print("you decide to leave the lunatic to his ramblings and turn and run");
			this.print("he starts to chase you!");
			chase();
			
		}
	}
	
	if (this.checkSelected("Take the sandwich and run!")) {
		//**TODO: add sandwitch reward
		this.print("you decide to leave the lunatic to his ramblings and turn and run");
		this.print("he starts to chase you!");
		chase();
		}
	}
	
	public String intro() {
		return("An old raggedy man asleep on a bench in the shade of a big oak tree");
	}
	
	private void duel() {
		if(!backpackThrown) {
			this.query(new String[] {"punch him in the face", "throw your backpack at him", "insult him"});
			if(this.checkSelected("punch him in the face")) {
				String[] punches = new String[] {"you connect with a big right hook to his face", "your upper cut lands square on his chin", "you right left jab combo his face!"};
				String[] enemyPunches = new String[] {"he land a left hook on your head", "his fist slams into your jaw", "he upper cuts your stomach"};
 				if(rand.nextInt(3+timesInsulted)>1) {
					this.print(punches[rand.nextInt(punches.length)]);
					health--;
				}
				else {
					this.print("he ducks and you whiff!");
				}
				if(rand.nextInt(3+timesInsulted)<2) {
					this.print(enemyPunches[rand.nextInt(enemyPunches.length)]);
					//** TODO: lower your health
				}
				else {
					this.print("you duck and he whiffs!");
				}
			}
			if(this.checkSelected("throw your backpack at him")) {
				backpackThrown = true;
				this.print("you chuck your backpack at him");
				if(rand.nextInt(3+timesInsulted)>1) {
					this.print("oof he grunts as a backpack full of text books rams into his chest");
					health -= 2;
				}
				else {
					this.print("you miss and hear your backpack full of thicc text books hit the gorund with a heavy thud");
				}
			}
			if(this.checkSelected("insult him")) {
				String[] insults = new String[] {"you are hot garbage!", "you egg!"};
				this.print(insults[rand.nextInt(insults.length)]);
				timesInsulted++;
			}
		}
		else {
			this.query(new String[] {"punch him in the face", "insult him"});
			if(this.checkSelected("punch him in the face")) {
				String[] punches = new String[] {"you connect with a big right hook to his face", "your upper cut lands square on his chin", "you right left jab combo his face!"};
				String[] enemyPunches = new String[] {"he land a left hook on your head", "his fist slams into your jaw", "he upper cuts your stomach"};
 				if(rand.nextInt(3+timesInsulted)>1) {
					this.print(punches[rand.nextInt(punches.length)]);
					health--;
				}
				else {
					this.print("he ducks and you whiff!");
				}
				if(rand.nextInt(3+timesInsulted)<2) {
					this.print(enemyPunches[rand.nextInt(enemyPunches.length)]);
					//** TODO: lower your health
				}
				else {
					this.print("you duck and he whiffs!");
				}
				
			}
			if(this.checkSelected("insult him")) {
				String[] insults = new String[] {"you are hot garbage!", "you egg!"};
				this.print(insults[rand.nextInt(insults.length)]);
				timesInsulted++;
			
			}
		}
		if(health<1) {
			wonDuel = true;
			this.print("During the greatest feat of athleticism in your life you knock out him out");
			//** TODO: add reward
		}	
	}
	
	private void chase() {
		this.query(new String[] {"run faster", "turn left", "turn right"});
		if(this.checkSelected("run faster")) {
			numFaster++;
			this.print("you are rather out of shape and this is tiring, but you gain a slight lead on him");
			//TODO: decrease a bar
		}
		if(this.checkSelected("turn left")||this.checkSelected("turn right")) {
			if(rand.nextInt(3+numFaster)>1) {
				if(chase==1) {
					this.print("you barely mannage to evage his grasp but he is still chasing you");
					chase++;
					
				}
				else if(chase==2) {
					this.print("you are gain a little bit of distance between him but he is still right be hind you");
				}
				else if(chase==3) {
					this.print("you are good distance ahead of him but he can still easly see you");
				}
				else if(chase==4) {
					this.print("you have almost lost him");
				}
				else if(chase>=5) {
					this.print("you can no longer see him and it seems you have lost him");
					//** TODO: fails event
					this.stopEvent();
				}
			}
			else {
				if(chase<=0) {
					this.print("he manages to close the distance and tackles you!");
					this.print("you shove him off and get up but your are cornered. you will have to fight");
					if(!wonDuel) {
						duel();
					}
					else {
						this.print("shortly after being knocked out he gets up and says");
						this.print("you have conviced me you are great man and could never have done such a heinous deed");
						this.print("is there anything i can do for you?");
						this.print("well it turned out this old fart was actualy a food scientist working at the university, and was able to point you in the correct direction");
						Lost.noLongerLost();
						this.stopEvent();
					}
				}
				else if(chase==1) {
					this.print("it looks as if he could grab you any second!");
				}
				else if(chase==2) {
					this.print("he is gaining on you");
				}
				else if(chase==3) {
					this.print("he is somehow catching up with you");
				}
			}
			
		}
	}
}
