package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    double theGravityOnThePlanetWhereTheFlappySphereIsLiving = .1;
    double theCurrentYVelocityOfTheFlappySphere = 0;
    double y = 300;
    double x = 25;
    double rectX = 800;
    int rectY=50;
    //int rectLength = 

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(125, 23, 133);
        fill(153, 114, 15);
        stroke(7, 19, 115);
        ellipse(25,300,50,50);
        fill(115, 7, 34);
        rect((int)rectX,rectY,200,100);
    }

    @Override
    public void draw() {
    	y = y + theCurrentYVelocityOfTheFlappySphere;
    	x = x+2;
    	rectX = rectX - 2;
    	theCurrentYVelocityOfTheFlappySphere = theCurrentYVelocityOfTheFlappySphere + theGravityOnThePlanetWhereTheFlappySphereIsLiving;
    	background(125, 23, 133);
    	fill(153, 114, 15);
    	ellipse((int)x,(int)y,50,50);
    	fill(115, 7, 34);
        rect((int)rectX,rectY,200,100);
        if(rectX==0) {
        	rectX=800;
        }
        if (x>=800) {
        	x=25;
        } 
        //rectY= (int) random(300);
    	
    	
        
    }
    public void mousePressed() {
    	//y = y - 100;
    	theCurrentYVelocityOfTheFlappySphere = -4;
    }
   

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
