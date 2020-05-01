package events;

import java.util.Random;

import main.GameCode;


public class PopQuiz extends Event {
	Random RNG = new Random ();
	int correctAnswer;
	int number2 ;
	int number1;
	int timer = 0;
	int questionsCorrect = 0;
	int quesitonsWrong = 0;
	boolean questionAsked = false;
	public PopQuiz () {
		super(3);
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	if (this.checkSelected("unimportant")) {
	this.print("You get a pop quiz in math there is no time to relax gotta hurry");
	this.query(new String [] {"im ready", "oh no",});
	this.changeMusic("resources/music/Doom-Theme.wav", -10F);
	this.setSelected("lame");
		}
	if (this.checkSelected("IM READY") || this.checkSelected("OH NO")) {
		number1 =RNG.nextInt(20);
		number2 = RNG.nextInt(20);
		correctAnswer = number1 + number2; 
		this.print("WHAT IS " + Integer.toString(number1) + " + " + Integer.toString(number2) );
		this.setSelected("dude");
		int decider = RNG.nextInt(2);
		questionAsked = true;
		String [] working = new String [3];
		for (int i = 0; i< 3; i++) {
			if (i == decider) {
				working[i] = Integer.toString(correctAnswer);
			} else {
				working [i] = Integer.toString(RNG.nextInt(40)); 
			}
		}
		this.query(working);
		}
	if (this.questionAsked) {
		timer = timer +1;
		if (this.checkSelected(Integer.toString(correctAnswer))) {
			this.print("that was right");
			this.playSoundEffect("resources/soundEffects/correct.wav", 6F);
			this.setSelected("im ready");
			questionsCorrect = questionsCorrect + 1;
		} else {
			if (!this.checkSelected("DUDE")) {
				this.print("that was wrong");
				this.playSoundEffect("resources/soundEffects/wrong.wav", 6F);
				this.setSelected("im ready");
				quesitonsWrong = quesitonsWrong + 1;
			}
		}
	}
	if (timer == 450) {
		if (questionsCorrect - quesitonsWrong >= 10) {
			this.print("you pased good for you");
			this.setSelected("unessasry");
			this.questionAsked = false;
			this.stopEvent();
		} else {
			this.print("you failed you needed " + Integer.toString(10 -(questionsCorrect - quesitonsWrong)) + " more correct answers to pass");
			GameCode.setStress(GameCode.getStress() + (10 + ((questionsCorrect - quesitonsWrong) * 5 )));
			this.questionAsked = false;
			this.setSelected("unessasry");
			this.stopEvent();
		}
		timer = 0;
	}
	}
}
