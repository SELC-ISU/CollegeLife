package events;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class Lost extends Event {
	private static boolean lost = false;
	private static int timesStaredAtPhone=0;
	private static Random rand;
	private static ArrayList<Event> selectedEncounters;
	private static ArrayList<Event> directionsEncountersList;
	private static SandwichKing king;
	private static WisdomDog dog;
	private static Bibledude dude;
	/** 
	 * uses the original constructer
	 */
	public Lost(int seed) {
		super(0);
		this.rand = new Random(seed); //seed random before we finish
		directionsEncountersList = new ArrayList<Event>();
		king = new SandwichKing(this);
		dog = new WisdomDog(this);
		dude = new Bibledude(this);
	}
	
	 
	public void runEventCode () {
		super.runEventCode();
		//System.out.println(this.checkSelected("unimportant"));
		if (this.checkSelected("unimportant")) {
		this.print("As you are walking around, you no longer recognize the surrounding area.");
		this.query(new String [] {"Stare at your phone for awhile", "find someone to ask for directions"});
		this.setSelected("lame");
			}
		if (this.checkSelected("Stare at your phone for awhile".toUpperCase())) {
			if(timesStaredAtPhone<=0){
				this.print("after you stare at your phone for awhile you have concluded that you are lost");
				timesStaredAtPhone++;
				this.setSelected("lame");
			}
			else {
				int passRNG = rand.nextInt(2+timesStaredAtPhone);
				if(passRNG>2) {
					this.print("after you stare at your phone for awhile you have concluded that you are utterly, hopelessly, lost");
					timesStaredAtPhone++;
					this.setSelected("lame");
				}
				else {
					this.print("in a stroke of luck you notice the giant landmark near you present on the map. this reorients you and you are nolonger lost");
					lost=false;
					this.setSelected("lame");
					this.stopEvent();
				}
			}
			
			}
		if (this.checkSelected("find someone to ask for directions".toUpperCase())) {
			this.query(new String [] {king.intro(), dog.intro(), dude.intro()});
			
			}
		if (this.checkSelected(king.intro())) {
			king.runEventCode();
			if(!lost) {
				this.stopEvent();
			}
			}
		if(this.checkSelected(dog.intro())) {
			dog.runEventCode();
			if(!lost) {
				this.stopEvent();
			}
		}
		if(this.checkSelected(dude.intro())) {
			dude.runEventCode();
			if(!lost) {
				this.stopEvent();
			}
		}
		if(!lost) {
			this.stopEvent();
		}
	}
	
	
	private void setupSelectedEncounters() {
		//add directions encounters here
		directionsEncountersList.add(new SandwichKing(this));
		directionsEncountersList.add(new Bibledude(this));
		directionsEncountersList.add(new WisdomDog(this));
		
		int num = rand.nextInt(directionsEncountersList.size());
		selectedEncounters.add(directionsEncountersList.get(num));
		directionsEncountersList.remove(num);
		num = rand.nextInt(directionsEncountersList.size());
		selectedEncounters.add(directionsEncountersList.get(num));
		directionsEncountersList.remove(num);
		
	}

	public boolean isLost(){
		return(lost);
	}
	
	public static void noLongerLost() {
		lost = false;
	}
	
	public Random getLostRand() {
		return rand;
	}
}
