import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //Rocket parts
    stroke(122);
    fill(255,105,105);
    ellipse(width/2.22f, height/1.23f, width/13.33f, height/6.67f); 
    ellipse(width/2.86f, height/1.23f, width/13.33f, height/6.67f);
    fill(245,245,245);
    stroke(122);
    ellipse(width/2.5f, height/1.67f, width/5.71f, height/2.67f);
    
    //Antenna
    line(width/2.5f, height/2.96f, width/2.5f, height/2.42f);

    //Window
    fill(197,224,255);
    ellipse(width/2.5f, height/1.9f, width/10f, height/10f);
  
}
}