package events;

public class WisdomDog extends Event{
	private Lost lost;
	private static int timesPet;
	/** 
	 * uses the original constructer
	 */
	public WisdomDog(Lost lost) {
		super(0);
		this.lost = lost;
		timesPet = 0;
	}
	
	 
	public void runEventCode () {
	super.runEventCode();
	//System.out.println(this.checkSelected("unimportant"));
	if (this.checkSelected("unimportant")) {
	this.print("it is a dog! there is no way it has directions but who cares! it is a dog!");
	this.query(new String [] {"pet the good boy", "leave the dog just like everyone else"});
	this.setSelected("lame");
		}
	if (this.checkSelected("pet the good boy")) {
		this.print("you pet the dog and he wags his tail happpily");
		timesPet++;
		if(timesPet>2) {
			this.print("you hear someone say ahhhh, that is the spot!");
			this.print("you look around for somebody in the spot");
			this.print("the dog barks why have you stopped?");
			this.print("you continue petting the talking dog");
			this.print("then it dawns on you. you are still lost mybe the dog knows how to get to your class");
			this.print("He was very happy to help and you are now on your way to class");
			Lost.noLongerLost();
			this.stopEvent();
		}
		}
	if (this.checkSelected("leave the dog just like everyone else")) {
		this.print("you have no time for important things like dogs and leave");
		this.stopEvent();
		}
	}
	
	public String intro() {
		return("An adorable dog");
	}
}
