package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

	float playerX ,playerY, playerWidth;
	float bugX, bugY, bugWidth;
	float halfPlayer , halfBug;



	public void settings()
	{
		size(500, 500);
	}
	
	

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();


		playerX = width * 0.5f;// converts to float point constant 
		playerY = height - 100; //height of screen  	
	
		playerWidth = 50;
		halfPlayer = playerWidth * 0.5f;
	}

	void restBug() {
		bugY = 50;
		bugWidth = 50;
		halfBug = bugWidth * 0.5f ;
		bugX = random(halfBug, width - halfBug);
	}

	void drawPlayer(float x, float y, float w )
	{
		noFill();
		stroke(255);
		rectMode(CENTER);
		rect(x, y, w, w);
		line (x, y  - halfPlayer, x , y - halfPlayer * 2);

	}

	public void keyPressed() // public - makes method visible outside every-other class
	{
		//POLYMORISHEM :-  many shap :- it is a concept meaning thing can change cat van turn to a dog 
		// the type is of a superclass but the intance is of the subclass
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			playerX --;
			
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			playerX ++;
	
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
			line(playerX, playerY - halfPlayer, playerX, 0);
		}
	}

	public void draw() {
		background(0);
		drawPlayer(playerX, playerY, playerWidth);
		
	}

		

}