package events;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import main.GameCode;
import main.MainLoop;

public class Lost extends Event {
	private boolean lost = true;
	private int timesStaredAtPhone=0;
	/** 
	 * uses the original constructer
	 */
	public Lost() {
		super(0);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	
	if (this.checkSelected("unimportant".toUpperCase())) {
		if (timesStaredAtPhone == 0) {
	this.print("As you are walking around, you no longer recognize the surrounding area.");
		this.query(new String [] {"Stare at your phone for awhile", "find someone to ask for directions"});
	} else {
		if (timesStaredAtPhone < 15) {
			this.query(new String [] {"stare at your phone for awhile .... agian", "find someone to ask for directions"});
			} else {
				this.query(new String [] {"stare at your phone for awhile .... agian", "find someone to ask for directions", "watch the news"});	
			}
	}
	this.setSelected("lame");
		}
	if (this.checkSelected("watch the news".toUpperCase())) {
		this.print("you decide to watch the news to see whats new");
		this.print("apparently the police force found the skellton of a young college student named " + GameCode.getName());
		this.print("they died from starvation while stareing at there phone how crazy, but you dont have time for that because");
		this.changeMusic("resources/music/duck-tales-theme.wav", -10F);
		GameCode.setName("ERIK");
		GameCode.resetGame();
		GameCode.first.isLost = false;
		this.setSelected("unimportant");
		timesStaredAtPhone = 0;
	}
	if (this.checkSelected("Stare at your phone for awhile".toUpperCase())) {
		this.print("");
		if (!GameCode.getName().equals("ERIK")) {
			this.print("after you stare at your phone for awhile you have concluded that you are lost");
			timesStaredAtPhone++;
			this.setSelected("unimportant");
			this.print("");
		} else {
			this.print("you don't really want to do that");
			timesStaredAtPhone++;
			GameCode.clip.stop();
			this.setSelected("unimportant");
			this.print("");
		}
	}
	if (this.checkSelected("stare at your phone for awhile .... agian".toUpperCase())){
		if (!GameCode.getName().equals("ERIK")) {
		if (timesStaredAtPhone == 1) {
			this.print("");
			this.print("after you stare at your phone again for awhile you have concluded that you are utterly, hopelessly, lost");
			this.print(" ");
			this.print("gain stress");
			GameCode.setStress(GameCode.getStress() + 15);
			this.print("");
		}
		if (timesStaredAtPhone == 2) {
			this.print("");
			this.print("man you are really determined to use this option but its not working dude");
			this.print("");
		}
		if (timesStaredAtPhone == 3) {
			this.print("");
			this.print("dude stop");
			this.print("");
		}
		if (timesStaredAtPhone == 4) {
			this.print("");
			this.print("im not doing it");
			this.print("");
		}
		if (timesStaredAtPhone == 5) {
			this.print("");
			this.print("your phone ran out of battary because you stared at it so long");
			this.print("");
		}
		if (timesStaredAtPhone == 6) {
			this.print("");
			this.print("you are just stareing at a black screen now, why?");
			this.print("");
		}
		if (timesStaredAtPhone == 7) {
			this.print("");
			this.print("the class is over you missed the whole thing because you were stareing at your phone for so long");
			this.print("");
		}
		if (timesStaredAtPhone == 8) {
			this.print("");
			this.print("you know what im just not gonna encourage you look at the phone for as long as you think you need too");
			this.print("");
		}
		if (timesStaredAtPhone == 9) {
			this.print("");
			this.print("you stare at the phone");
			this.print("");
		}
		if (timesStaredAtPhone == 10) {
			this.print("");
			this.print("you stare at the phone again");
			this.print("");
		}
		if (timesStaredAtPhone == 11) {
			this.print("");
			GameCode.clip.stop();
			this.print("you stare at the phone again, how long has it been sience you started? has anything ever existed before you started staring at the phone?");
			this.print("");
			this.print("your not sure you know the answer to that question");
			this.print("");
		}
		if (timesStaredAtPhone == 12) {
			this.print("");
			this.print("you stare at the phone again, what was you name again");
			this.print(" ");
			this.print("you can't seem to remember");
			this.print("");
		}
		if (timesStaredAtPhone == 13) {
			this.print("");
			this.print("you start to feel hunger pains");
			GameCode.setHealth(GameCode.getHealth() - 90);
			this.print("lose health");
			this.print("");
		}
		if (timesStaredAtPhone == 14) {
			this.print("");
			this.print("you can't stare at that phone for much longer");
			GameCode.setHealth(GameCode.getHealth() - 9);
			this.print("lose health");
			this.print("");
		}
		if (timesStaredAtPhone > 14) {
			this.print("");
			this.print("...");
			this.print("");
		}
		timesStaredAtPhone++;
		this.setSelected("unimportant");
		} else {
			this.print("ya shouldent have done that");
			try {
				File file = new File ("resources/phone.txt");
				file.createNewFile();
				FileWriter fw = new FileWriter (file);
				fw.write("enjoy the phone");
				fw.close();
				MainLoop.endGame();
			} catch (IOException e) {
				
			}
		}
	}
	if (this.checkSelected("find someone to ask for directions".toUpperCase())) {
		this.print("you find a guy after a while but he is a jerk and will only help you if you give him 30 bucks");
		this.query(new String [] {"give up the cash", "screw him"});
		this.setSelected("lame");
		}
	if (this.checkSelected("give up the cash".toUpperCase())) {
		Random rand = new Random ();
		if (rand.nextInt(10) != 0) {
			this.print("you relctently give him some money and he helps you");
			this.lost = false;
			GameCode.setCash(GameCode.getCash() - 30);
			this.setSelected("lame");
			} else {
				this.print("he takes the money and runs you end up missing the class");
				this.lost = false;
				GameCode.setCash(GameCode.getCash() - 30);
				GameCode.setStress(GameCode.getStress() + 45);
				this.setSelected("lame");
			}
		}
	if (this.checkSelected("screw him".toUpperCase())) {
		this.print("you think you can prbably find it on your on and");
		Random rand = new Random ();
		if (rand.nextBoolean()) {
			this.print("you could you make it to class on time");
			this.lost = false;
		} else {
			this.print("you coulden't and you end up missing the class");
			GameCode.setStress(GameCode.getStress() + 45);
		}
	}
}
	public boolean isLost(){
		return(lost);
	}
}
