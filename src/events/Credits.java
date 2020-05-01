package events;

import main.GameCode;
import main.MainLoop;

public class Credits extends Event {
	/** 
	 * uses the original constructer
	 */
	int timer = 0;
	public Credits() {
		super(1);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	if (this.checkSelected("unimportant")) {
	this.print("congrats you beat the game");
	this.changeMusic("resources/music/credits.wav", -10F);
	this.setSelected("lame");
		}
	timer = timer + 1;
	if (timer == 120) {
		this.print(" ");
		this.print("game concept by the binary bros");
		this.print(" ");
		}
	if (timer == 240) {
		this.print(" ");
		this.print("game programing by the binary bros");
		this.print(" ");
		}
	if (timer == 360) {
		this.print(" ");
		this.print("title theme from duck tales nes game");
		this.print(" ");
		}
	if (timer == 480){
		this.print(" ");
		this.print("food theme from spiderman 2 the video game");
		this.print(" ");
		}
	if (timer == 600) {
		this.print(" ");
		this.print("quiz theme from doom");
		this.print(" ");
		}
	if (timer == 720) {
		this.print(" ");
		this.print("never gonna give you up from rick astly");
		this.print(" ");
		}
	if (timer == 840) {
		this.print(" ");
		this.print("Date theme from cornel sanders dateing sim");
		this.print(" ");
		}
	if (timer == 960) {
		this.print(" ");
		this.print("credits theme from luigis masion");
		this.print(" ");
		}
	
	if (timer == 1080) {
		this.print(" ");
		this.print("thank you very much for playing");
		this.print(" ");
		}
	if (timer == 1200) {
		MainLoop.endGame();
	}
	}
}
