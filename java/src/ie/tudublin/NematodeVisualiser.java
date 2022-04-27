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
			// n1 = new Nematode(name, length, limbs, gender, eyes)
			for(int i = 0; i < nematodes.size(); i++)
			{
				Nematode n = new Nematode;
				nematodes.add(n);
			}
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
		noFill();
		for(Nematode n:nematodes)
		{
			n.render(this);
		}
	}

	public void draw()
	{
		background(0);
		drawNematodes();
	}
}
