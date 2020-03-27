package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

import events.EpicTestEvent;
import events.Event;
import resources.SoundPlayer;


public class GameCode extends GameAPI {
  private GameWindow gameWindow;
  private static TextInterface textInterface;
  DataLine.Info info;
  public static ArrayList <Event> randomEvents = new ArrayList <Event>();
  public static Clip clip;
  private boolean firstRun = true;
  private float volume;
  static SoundPlayer player;
  private Graphics graphics;
  int stationaryIndex = 420;
  boolean eventFinished = false;
  public static int waitUntil;
  private int gender;     //for the random
  public String name;
  public EpicTestEvent bruh = new EpicTestEvent ();
  Random r = new Random();
  private int health;
  private int cash;
  private int stress;
  public  void initialize(){
	if (firstRun) {
      player = new SoundPlayer();
      volume = -10.0F;
      firstRun = false;
      graphics = MainLoop.getWindow().getBuffer();
      
   //   stuff.playSoundEffect(6.0F, "soundEffects/Click.wav");
  }
    
   /* if (stuff.isPlaying()) {
     clip.stop();
     }
     */
 //   stuff.play("tital", volume);
	health = 100;
	cash = 100;
	stress = 0;
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
    graphics.setColor(new Color (0xFF3A3A));
    graphics.drawRect(520, 16, 100, 8);
    graphics.fillRect(520, 16, health, 8);
    graphics.setColor(new Color (0x32D35B));
    graphics.drawRect(520, 32, 100, 8);
    graphics.fillRect(520, 32, cash, 8);
    graphics.setColor(new Color (0xF6DA16));
    graphics.drawRect(520, 48, 100, 8);
    graphics.fillRect(520, 48, stress, 8);
    graphics.drawString("health", 475, 25);
    graphics.drawString("cash", 475,  40);
    graphics.drawString("Stress", 475, 55);
    if (name != null) {
    	graphics.drawString(name, 545, 15);
    }
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
    	player.play("resources/music/duck-tales-theme.wav", volume);
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
    

   

  }
  /**
   * returns the text interface
   * @return the text Interface
   */
  public static TextInterface getTextInterface () {
      return textInterface;
  }
  public void runRandomEvent () {
      if (stationaryIndex == 420) {
          stationaryIndex = r.nextInt(randomEvents.size());
          randomEvents.get(stationaryIndex).runEventCode();
      } else {
          if (randomEvents.get(stationaryIndex).isRunning()) {
          randomEvents.get(stationaryIndex).runEventCode();
          } else {
            stationaryIndex = 420;
            eventFinished = true;
          }
      }
  }
}