package main;

import java.util.Random;
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
  private int gender;     //for the random
  public String name;
  
  Random r = new Random();
 
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
    textInterface.refreshPage();
    textInterface.println("CHOOSE YOUR GENDER:");
    textInterface.query(new String[] { "MALE", "FEMALE", "RANDOM" });
    /*textInterface.println(" ");
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
    */
    
}
  
  public void gameLoop() {
	  
    textInterface.frameEvent();
    if (textInterface.selected.equals("MALE")) {
    	textInterface.refreshPage();
    	textInterface.println("YOU ARE MARK, A 19 YEAR OLD MALE IN ISU.");
    	textInterface.println("YOU ARE ABOUT TO EMBARK ON YOUR COLLEGE LIFE!");
    	textInterface.selected = "unimportant";
    	textInterface.println("PROCEED?");
    	textInterface.query(new String[] { "YES", "NO"});
    	name = "MARK";
    }
    if (textInterface.selected.equals("FEMALE")) {
    	textInterface.refreshPage();
    	textInterface.println("YOU ARE JILL, A 19 YEAR OLD MALE IN ISU.");
    	textInterface.println("YOU ARE ABOUT TO EMBARK ON YOUR COLLEGE LIFE!");
    	textInterface.selected = "unimportant";
    	textInterface.println("PROCEED?");
    	textInterface.query(new String[] { "YES", "NO"});
    	name = "JILL";
    }

    if (textInterface.selected.equals("YES")) {
    	textInterface.refreshPage();
    	textInterface.println("WELCOME TO ISU!!!");
    	textInterface.selected = "unimportant";
    	//title = false;
    }
    if(textInterface.selected.equals("NO")) {
    	textInterface.refreshPage();
    	textInterface.println("CHOOSE YOUR GENDER:");
    	textInterface.selected = "unimportant";
        textInterface.query(new String[] { "MALE", "FEMALE", "RANDOM" });
    }
    if(textInterface.selected.equals("RANDOM")) {
    	textInterface.refreshPage();
    	gender = (int) ((Math.random() * ((2 - 1) + 1)) + 1);
    	if(gender == 1) {
    		textInterface.selected = "MALE";
    	}
    	if(gender == 2) {
    		textInterface.selected = "FEMALE";
    	}
    }
    

    /*if (!stuff.isPlaying()) {
=======
    
    /*
    if (!stuff.isPlaying()) {
>>>>>>> 20b180350a2b60630c181f36de4be5b188e5f1a2
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
<<<<<<< HEAD
    }*/

  }
}