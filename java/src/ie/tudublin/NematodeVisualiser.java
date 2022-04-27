package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);		
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();
		drawArrows();
		loadNematodes();
		printNematodes();	
	}

	void printNematodes()
    {
        for(Nematode n:nematodes)
        {
            System.out.println(n);
        }
    }
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

		for(TableRow row:table.rows())
		{
			Nematode n = new Nematode(row);
			nematodes.add(n);
		}
	}

	public void drawNematodes()
	{
		for(Nematode n:nematodes)
		{
			n.render(this);
		}
	}

	public void drawArrows()
	{
		stroke(255);
		fill(255, 255, 0);
		line(100, 400, 200, 400);
		line(100, 400, 130, 370);
		line(100, 400, 130, 430);


		line(600, 400, 700, 400);
		line(670, 370, 700, 400);
		line(670, 430, 700, 400);
	}


	public void draw()
	{
		background(0);
		drawNematodes();
	}
}
