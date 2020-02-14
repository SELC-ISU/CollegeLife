package main;

import resources.SpriteContainer;

public abstract class GameAPI { public GameAPI() {}
  protected static SpriteContainer sprites = MainLoop.getSprites ();;
  /**\
   * returns true if the key at a given askii code is pressed down
   * @param keyCode the askii code of the key you want to check
   * @return true if the key is pressed down false otherwise
   */
  public boolean keyCheck(int keyCode) {
    return MainLoop.getWindow().keyCheck(keyCode);
  }
  /**
   * returns true if the key at a given askii code was pushed.  Unlike keyCheck it will only return true once until the key is released again 
   * In other words it will check if a key was pressed since it was last time it was not pressed (and of course that is is still being pressed).
   * @param keyCode the askii code of the key you want to check
   * @return wheather that key is pushed down and it has been released sience it was last check
   */
  public boolean keyPressed(int keyCode) {
    return MainLoop.getWindow().keyPressed(keyCode);
  }
  /**
   * returns true if the key your checking has been released seince you last checked
   * @param keyCode the askii code of the key you are trying to check
   * @return true if the key your checking has been released seince you last checked
   */
  public boolean keyReleased(int keyCode) {
    return MainLoop.getWindow().keyReleased(keyCode);
  }
  /**
   * retuns an array of all the keys (orginzied by askii code). And whether or not they are pressed
   * @return an array of all the keys (orginzied by askii code). And whether or not they are pressed
   */
  public boolean[] keysPressed() {
	  return MainLoop.getWindow().KeysPressed(); 
	  }
  
  public SpriteContainer getSprites()
  {
    return MainLoop.getSprites();
  }
}
