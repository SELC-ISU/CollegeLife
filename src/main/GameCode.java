package main;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

import events.Template;
import events.ClassSnacks;
import events.Credits;
import events.Event;
import events.FartedInClass;
import events.FirstClass;
import events.FoodTime;
import events.Jessica;
import events.PopQuiz;
import events.JustACold;
import events.RickRoll;
import events.ClassSnacks;
import events.End;
import resources.SoundPlayer;


public class GameCode extends GameAPI {
  private GameWindow gameWindow;
  private static TextInterface textInterface;
  DataLine.Info info;
  public static ArrayList <Event> requiredEvents = new ArrayList <Event>();
  public static ArrayList <Event> goodEvents = new ArrayList <Event>();
  public static ArrayList <Event> badEvents = new ArrayList <Event>();
  public static Clip clip;
  private boolean firstRun = true;
  private float volume;
  private boolean gameStarted = false;
  public static SoundPlayer player;
  private static int eventCount = 0;
  private Graphics graphics;
  int stationaryIndex = 420;
  boolean eventFinished = false;
  public static int waitUntil;
  private int gender;     //for the random
  public static String name;
  public Template bruh = new Template ();
  public RickRoll roll = new RickRoll ();
  public PopQuiz quiz = new PopQuiz ();
  public Jessica jessica = new Jessica();
  public FoodTime time = new FoodTime();
  public FartedInClass d = new FartedInClass();
  public static FirstClass first = new FirstClass();
  public JustACold flu = new JustACold();
  public ClassSnacks snak = new ClassSnacks();
  public End end = new End();
  public Credits credits = new Credits();
  Random r = new Random();
  private boolean decision = false;
  private static int health;
  private static int cash;
  private static int stress;
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
    File file = new File ("resources/phone.txt");
    if (!file.exists()) {
    textInterface.println("CHOOSE YOUR GENDER:");
    textInterface.query(new String[] { "MALE", "FEMALE", "RANDOM" });  
    } else {
    textInterface.println("WELCOME TO THE PHONE ENDING");
    player.play("resources/music/creepy-theme.wav", volume);
    textInterface.println(" ");
    textInterface.query(new String [] {"STARE AT THE PHONE"});
    }
}
  public static void setHealth (int newHealth) {
	  health = newHealth;
	  if (health > 100) {
		  health = 100;
	  }
  }
  public static int getHealth () {
	  return health;
  }
  public static void setCash (int newCash) {
	  cash = newCash;
	  if (cash > 100) {
		  cash = 100;
	  }
  }
  public static int getCash () {
	  return cash;
  }
  public static void setStress (int newStress) {
	  stress = newStress;
  }
  public static int getStress () {
	  return stress;
  }
  public static String getName() {
	  return name;
  }
  public static void setName (String newName) {
	  name = newName;
  }
  public static void resetGame() {
	  health = 100;
	  cash = 100;
	  stress = 0;
	  eventCount = 0;
  }
  public void gameLoop() {
    textInterface.frameEvent();
    // Test events like this
    //bruh.runEventCode(); 
    //roll.runEventCode();
   // quiz.runEventCode();
   // time.runEventCode();
    graphics.setColor(new Color (0xFF3A3A));
    graphics.drawRect(520, 16, 100, 8);
    graphics.fillRect(520, 16, health, 8);
    graphics.setColor(new Color (0x32D35B));
    graphics.drawRect(520, 32, 100, 8);
    graphics.fillRect(520, 32, cash, 8);
    graphics.setColor(new Color (0xF6DA16));
    graphics.drawRect(520, 48, 100, 8);
    graphics.fillRect(520, 48, stress, 8);
    graphics.drawString("Health", 475, 25);
    graphics.drawString("Cash", 475,  40);
    graphics.drawString("Stress", 475, 55);
    if (name != null) {
    	graphics.drawString(name, 545, 15);
    }
    if (stress >= 100 ) {
    	textInterface.println("YOU COULDEN'T TAKE IT ANYMORE AND DROPED OUT");
    	textInterface.println("GAME OVER");
    	textInterface.query(new String [] {"DANG"});
    	stress = 99;
    }
    if (health <= 0 ) {
    	textInterface.println("YOU FREAKIN DIED");
    	textInterface.println("GAME OVER");
    	textInterface.query(new String [] {"DANG"});
    	health = 1;
    }
    if (cash <= 0 ) {
    	textInterface.println("YOU DONT HAVE ANY MONEY TRULLY THIS IS THE WORST POSIBLE ENDING");
    	textInterface.println("GAME OVER");
    	textInterface.query(new String [] {"DANG"});
    	cash = 1;
    }
    if (textInterface.selected.equals("STARE AT THE PHONE")) {
    	MainLoop.endGame();
    }
    if (textInterface.selected.equals("STARE AT THE PHONE")) {
    	textInterface.println("ENJOY THE PHONE");
    	textInterface.println(" ");
    	textInterface.query(new String [] {"STARE AT THE PHONE"});
    	textInterface.selected = "unimportant";
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
    	gameStarted = true;
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

    if (textInterface.selected.equals("HECK YEAH MY DUDE")) {
    	eventFinished = false;
    	GameCode.textInterface.selected = "unimportant";
    }

    if (gameStarted) {
    	if (!eventFinished) {
    		
	    	if (eventCount == 0) {
	    		requiredEvents.get(0).runEventCode();
	    		if (!requiredEvents.get(0).isRunning()) {
	    			eventCount = eventCount + 1;
	    			GameCode.textInterface.selected = "unimportant";
	    		}
	    	} else {
	    		if (eventCount == 3 || eventCount == 5 || eventCount == 10 || eventCount == 11) {
	    		if (eventCount == 3) {
	    			requiredEvents.get(1).runEventCode();
	    			if (!requiredEvents.get(1).isRunning()) {
		    			eventFinished = true;
		    			
		    		}
	    		}
	    		if (eventCount == 5) {
	    			requiredEvents.get(2).runEventCode();
	    			if (!requiredEvents.get(2).isRunning()) {
	    				eventFinished = true;
		    	
		    		}
	    		}
	    		if (eventCount == 10) {
	    			System.out.println("debug");
		    		requiredEvents.get(3).runEventCode();

		    		if (!requiredEvents.get(3).isRunning()) {
		    			eventFinished = true;
		   
		    		}
		    		}
	    		if (eventCount == 11) {
	    			requiredEvents.get(4).runEventCode();
	    		}
	    		}else {
	    			if (decision) {
	    				this.runRandomGoodEvent();
	    			} else {
	    				this.runRandomBadEvent();
	    			}
	    		}
	    	}

    	} else {

    		if (!textInterface.selected.equals("unimportant")) {
	    		GameCode.textInterface.selected = "unimportant";
	    		eventCount = eventCount + 1;
	    		textInterface.println(" ");
	    		textInterface.println("YOU READY TO MOVE ON");
	    		textInterface.println(" ");
	    		textInterface.query(new String [] {"HECK YEAH MY DUDE"});
	    		decision = r.nextBoolean();
    		}
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
  public void runRandomGoodEvent () {
      if (stationaryIndex == 420) {
    	 try {
          stationaryIndex = r.nextInt(goodEvents.size() - 1);
    	 } catch (IllegalArgumentException e) {
    		 stationaryIndex = 0;
    	 }

          stationaryIndex = r.nextInt(goodEvents.size());

          goodEvents.get(stationaryIndex).runEventCode();
      } else {
    	
          if (goodEvents.get(stationaryIndex).isRunning()) {
          goodEvents.get(stationaryIndex).runEventCode();
          } else {
        	  goodEvents.get(stationaryIndex).unstopEvent();
            stationaryIndex = 420;
            eventFinished = true;
          }
      }
  }
  public void runRandomBadEvent () {
      if (stationaryIndex == 420) {

    	  try {
              stationaryIndex = r.nextInt(badEvents.size() - 1);
        	 } catch (IllegalArgumentException e) {
        		 stationaryIndex = 0;
        	 }

              stationaryIndex = r.nextInt(badEvents.size());
        	 
          badEvents.get(stationaryIndex).runEventCode();
      } else {
          if (badEvents.get(stationaryIndex).isRunning()) {
          badEvents.get(stationaryIndex).runEventCode();
          } else {
        	  badEvents.get(stationaryIndex).unstopEvent();
            stationaryIndex = 420;
            eventFinished = true;
          }
      }
  }
}