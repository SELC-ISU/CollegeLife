package events;

import java.util.Random;

import main.GameCode;

public class FoodTime extends Event {
	/** 
	 * uses the original constructer
	 */
	int amountOfTakes = 0;
	public FoodTime () {
		super(2);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	if (this.checkSelected("unimportant")) {
	this.print("its time for dinner where do you want to go");
	this.changeMusic("resources/music/pizza-theme.wav", 0);
	this.query(new String [] {"takeout", "buffet","nice resturant","none"});
	this.setSelected("lame");
		}
	if (this.checkSelected("TAKEOUT")) {
		this.playSoundEffect("resources/soundEffects/eat.wav", 6F);
		Random RNG = new Random();
		if (RNG.nextInt(3) >= 1) {
		this.print("you went out for takeout it diden't taste very good but it was cheap and nice");
		this.print(" ");
		this.print("health up");
		this.print("cash down");
		GameCode.setCash(GameCode.getCash() - 10);
		GameCode.setHealth(GameCode.getHealth() + 30);
		} else {
		this.print("the food was awful and you eneded up getting really sick for the next couple days");
		this.print(" ");
		this.print("stress up");
		this.print("cash down");
		this.print("health down");
		GameCode.setCash(GameCode.getCash() - 10);
		GameCode.setHealth(GameCode.getHealth() - 20);
		GameCode.setStress(GameCode.getStress() + 10);
		}
		this.setSelected("lame");
		this.stopEvent();
		}
	if (this.checkSelected("BUFFET")) {
		this.playSoundEffect("resources/soundEffects/eat.wav", 6F);
		this.print("you go to a cool buffet that has so much food you take some");
		this.print("health up");
		this.print("cash down");
		GameCode.setCash(GameCode.getCash() - 30);
		GameCode.setHealth(GameCode.getHealth() + 5);
		this.query(new String [] {"take some more","be done"});
		this.setSelected("lame");
		}
	if (this.checkSelected("BE DONE")) {
		this.setSelected("lame");
		this.print("you decide to call it quits");
		this.stopEvent();
	}
	if (this.checkSelected("TAKE SOME MORE")) {
		this.playSoundEffect("resources/soundEffects/eat.wav", 6F);
		amountOfTakes = amountOfTakes + 1;
		this.print("time for more food");
		this.print(" ");
		Random RNG = new Random ();
		if (RNG.nextInt(100) + 1 < amountOfTakes * 10) {
		this.print("that was way too much you get a really sick");
		GameCode.setHealth(GameCode.getHealth() - (10*amountOfTakes));
		this.stopEvent();
		this.setSelected("lame");
		} else {
		this.print("it was delicios");
		GameCode.setHealth(GameCode.getHealth() + 5 + amountOfTakes);
		this.setSelected("lame");
		this.print(" ");
		this.query(new String [] {"take some more","be done"});
		}
	}
	
	if (this.checkSelected("NICE RESTURANT")) {
		this.playSoundEffect("resources/soundEffects/eat.wav", 6F);
		this.print("the food was really good but it was expensive as heck");
		this.print("health up");
		this.print("cash down");
		GameCode.setCash(GameCode.getCash() - 40);
		GameCode.setHealth(GameCode.getHealth() + 30);
		this.setSelected("lame");
		this.stopEvent();
		
		}
	if (this.checkSelected("NONE")) {
		this.print("you just don't eat cool");
		this.print("health down");
		GameCode.setHealth(GameCode.getHealth() - 10);
		this.setSelected("lame");
		this.stopEvent();
		}
	}
}
