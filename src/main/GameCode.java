package main;


import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import resources.CoolCheck;

public class GameCode extends GameAPI {
  private GameWindow gameWindow;
  private TextInterface textInterface;
  DataLine.Info info;
 // public static  Clip clip;
  //public static Clip clip2;
  private boolean firstRun = true;
  private float volume;
  static CoolCheck stuff;
  public static int waitUntil;
  public  void initialize(){
	if (firstRun) {
      stuff = new CoolCheck();
      volume = -10.0F;
      firstRun = false;
   //   stuff.playSoundEffect(6.0F, "soundEffects/Click.wav");
  }
    
   /* if (stuff.isPlaying()) {
     clip.stop();
     }
     */
 //   stuff.play("tital", volume);
    textInterface = new TextInterface(80, 41, sprites.selector);
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.query(new String[] { "TEST OPTION 1", "TEST OPTION 2", "TEST OPTION 3", "TEST OPTION 4" });
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    textInterface.println(" ");
    
}
  
  public void gameLoop() {
    textInterface.frameEvent();
    if (textInterface.selected.equals("TEST OPTION 1")) {
    	textInterface.println("THANK YOU FOR PICKING OPTION 1");
    	textInterface.println(" ");
    	textInterface.println(" ");
    	textInterface.println(" ");
    	textInterface.println(" ");
    	textInterface.println(" ");
    	textInterface.println(" ");
    	textInterface.selected = "unimportant";
    	 textInterface.query(new String[] { "COOL MOVE ON", "TEST OPTION 2", "TEST OPTION 3", "TEST OPTION 4" });
    }
    
    if (textInterface.selected.equals("COOL MOVE ON")) {
    	textInterface.println("BRUH");
    	textInterface.selected = "unimportant";
    }
    
    /*
    if (!stuff.isPlaying()) {
    	try {
        //clip.stop();
        if (waitUntil == 696) {
          stuff.play("tital", volume);
        }
        if (waitUntil == 1624) {
          stuff.play("god", volume);
        }
        if (waitUntil == 1317) {
          stuff.play("extrasensory", volume);
        }
        if (waitUntil == 1800) {
          stuff.play("marsh", 6.0F);
        }
        if (waitUntil == 1654) {
          stuff.play("roads", volume);
        }
        if (waitUntil == 1620) {
      	stuff.play("mobius", volume);
        }
        if (waitUntil == 1513) {
      	stuff.play("road rage", volume);
        }
        if (waitUntil == 1125) {
      	stuff.play("bandits", volume);
        }
        if (waitUntil == 1266) {
      	  stuff.play("jumping", volume);
        }
      } catch (NullPointerException e) {
    	  
      }
    }
    */
  }
}