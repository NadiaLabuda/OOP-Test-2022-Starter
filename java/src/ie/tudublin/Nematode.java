package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Nematode extends PApplet 
{
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    @Override
    public String toString()
    {
      return name
        + "," + length
        + "," + limbs
        + "," + gender
        + "," + eyes
        ;
    }

    public Nematode(TableRow row)
    {
        name = row.getString("name");
        length = row.getInt("length");
        limbs = row.getInt("limbs");
        gender = row.getString("gender");
        eyes = row.getInt("eyes");
    }

    public Nematode(String name, int length, int limbs, String gender, int eyes)
    {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getLimbs()
    {
        return limbs;
    }

    public void setLimbs(int limbs)
    {
        this.limbs = limbs;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getEyes()
    {
        return eyes;
    }

    public void setEyes(int eyes)
    {
        this.eyes = eyes;
    }

    public void render(NematodeVisualiser pa)
    {
        pa.stroke(255);
		pa.fill(255, 255, 0);
		pa.line(100, 400, 200, 400);
		pa.line(100, 400, 130, 370);
		pa.line(100, 400, 130, 430);

		pa.line(600, 400, 700, 400);
		pa.line(670, 370, 700, 400);
		pa.line(670, 430, 700, 400);

        int counter = 30;

        for (int i = 0; i < length;  i++)
        {
            pa.circle(250, 250, PApplet.BOTTOM + counter);
            counter = counter + 30;

        }

        // for (int i = 0; i < 13; i++)
        // {
        //     if (gender == "n")
        //     {
        //         pa.stroke(255);
        //         pa.fill(255, 255, 0);
        //         pa.line(PApplet.CENTER, 700, PApplet.CENTER, 730);
        //     }
        //     else if (gender == "f")
        //     {
        //         pa.ellipse(PApplet.CENTER, PApplet.BOTTOM, PApplet.CENTER, height - 50;);
        //     }
        // }

        pa.fill(255);
        pa.textSize(16);
        pa.textAlign(PApplet.TOP, PApplet.CENTER);
        pa.text(name, 200, 200);
    }
}
