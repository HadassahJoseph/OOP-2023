package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{
// class that extends or inhertices another class therefore this class gets al the methods that the 
//pApplet class in java it called supersharp
	public void settings()
	{
		size(500, 500);
		//fullScreen();
	}

	public void setup() {
		//colorMode(HSB);
		//hsb - brightness , muche asier to work with , queue staruiation brightness
		background(255,0, 0);
		// this get called right at the strat along with setiings 
	}

	
	
	public void draw()
	{	
		// draw gets called at every frame i.e film is a series of series of still images 
		//background(0);
		//noStroke();
		//fill(mouseX, 255, 255);;
		//circle(random(0, width), random (0, width), random(0,width));
		fill(255,255,0);
		circle(250, 250, 400);
		noStroke();
		//triangle(50,450,450,450,50,450); 
		fill(0, 0, 255);
		//triangle(300, 300, 900, 900, 500, 500); 
		triangle(5,400,500,400,245,20);
		//triangle(55,300,440,300,250,50);
		//triangle(300, 40, 90, 20, 80, 70);
		fill(255,255,255);
		ellipse(250, 250, 200,80 );//x1,y1,w,h
		
		int pupilSize = 100;
		if (mouseX > 250 && mouseY > 250) {
		  pupilSize = 50;
		}

		fill(0,0,0);
		ellipse(250, 250, pupilSize, pupilSize);
		
		
		

		

		
		/*stroke(255);
		line(10, 10, 100, 100); //x1, y1 , x2, y2
		circle(300, 250, 70); //cx, cy, d
		fill(0, 255, 0);
		rect(10,300,10,100); // tlx, tly, w, h
		stroke(127);
		fill(0, 0, 255);
		noStroke();
		noFill();
		strokeWeight(1);
		triangle(300, 300, 900, 900, 500, 500); // (x1, y1), (x2, y2), and (x3, y3) 
		fill(0,0, 255);*/
		
	

	}
}
