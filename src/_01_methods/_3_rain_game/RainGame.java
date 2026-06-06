package _01_methods._3_rain_game;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Make a game where the user has to catch rain drops in a bucket!
 * 
 * In the setup() method:
 * 1. If you are using an image for the bucket, load it and resize it here.
 *    A bucket image, bucket.png, has been provided if you want to use it.
 *    bucket = loadImage("images/bucket.png");
 *    bucket.resize(100, 100);  // you can choose values other than 100, 100
 * 
 * In the draw() method:
 * 2. Set a background color
 * 
 * 3. Draw a raindrop (ellipse) at the top of the screen
 * 
 * 4. Make the rain fall down the screen.
 *    Hint: make a variable for the raindrop's Y position and change it after
 *    you draw the raindrop.
 * 
 * 5. When the rain falls off the bottom of the canvas, start a new rain drop
 *    falling from the top.
 *    Each new drop should start at a random position (X position) at the top.
 *    Hint: This code will get a random number between 0 and the window width.
 *    int randomNumber = (int)random(width);
 * 
 * 6. Draw a bucket (rectangle or image) at the bottom of the screen.
 *    The bucket's width needs to be stored in the bucketWidth variable.
 * 
 * 7. Make the bucket move side-to-side with the mouse. Hint: use mouseX
 * 
 * 8. When the rain drop has fallen to the bucket, call the checkCatch() method
 *    to see if the rain drop is in the bucket.
 * 
 * 9. Show the current score on the screen using the code below.
 *    Change the color if it does not show up on your background.
 *    fill(0, 0, 0);
 *    textSize(16);
 *    text("Score: " + score, 20, 20);
 */
public class RainGame extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 600;

    int score = 0;
    int bucketWidth = 50;
    int bucketHeight;
    PImage bucket;
    int y;
    int x;

    int backgroundRedValue = 220;
    int backgroundGreenValue = 247;
    int backgroundBlueValue = 246;
    int theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround = 600;
    int theSpeedOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround = 15;
    // for (i=0;i>=0;i++){
    // int backgroundRedValue = backgroundRedValue - 5;
    // int backgroundGreenValue = backgroundGreenValue - 5;
    // int backgroundBlueValue = backgroundBlueValue - 5;
    // int theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround = 600;
    // int theSpeedOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround = 15;
    // random rand = rand.NextIn(600)
    // }

    // while (theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround>0){
    //     draw(backgroundRedValue,backgroundBlueValue,backgroundGreenValue,theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround);
    //     theSpeedOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround = theSpeedOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround + 1;
    //     theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround = theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround - theSpeedOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround;
    // }
    // if (theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround == 0){
    //     checkCatch(x);
    // }
    // Sets the size of your canvas
    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
        bucket = loadImage("images/bucket.png");
        bucket.resize(100, 100);
    }

    public void draw(){
        background(backgroundRedValue, backgroundGreenValue, backgroundBlueValue);
        fill(44, 16, 181);
        stroke(245, 213, 54);
        ellipse(13,41,300,theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround);
    }
   // @Override
    // public void draw(int backgroundRedValue, int backgroundBlueValue, int backgroundBlueValue, int theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround) {
    //     background(backgroundRedValue, backgroundGreenValue, backgroundBlueValue);
    //     fill(44, 16, 181);
    //     stroke(245, 213, 54);
    //     ellipse(13,41,300,theHeightOfTheRainDropThatLooksSuspiciouslyLikeAnEllipseWhichIsSlowlyFallingToTheGround);
    //   //  image
    //     // Try and make the sky slightly darker with each raindrop
    // }

    static public void main(String[] args) {
        PApplet.main(RainGame.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    void checkCatch(int x) {
        if (x > mouseX && x < mouseX + bucketWidth) {
            score++;
        } else if (score > 0) {
            score--;
        }
        println("Your score is now: " + score);
    }
}
