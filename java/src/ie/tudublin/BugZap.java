package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}
	
	float playerX;
	float playerY;
	float playerWidth;

	public void setup() {
		//background (0);
		colorMode(HSB);
		//background (0);

		smooth();

		playerX = width /2 ;
		playerY = height - 50;
		playerWidth = 50;
	}

	void drawPlayer(float x, float y, float w )
	{
		stroke (255);
		noFill();
		rectMode(CENTER);
		rect(x, y, w, 20);
		//size(100, 10);
		//stroke(255,0 ,0 );
		line(x, y, 10, x, y, 20);
		//size(400, 400);
		//line(120, 80, 340, 300);
	}

	public void draw() {
		background (0);
		strokeWeight(2);
		drawPlayer (playerX,playerY,playerWidth);
	}

	/*public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			playerX -- ;
			
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			playerX ++ ;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	*/

}