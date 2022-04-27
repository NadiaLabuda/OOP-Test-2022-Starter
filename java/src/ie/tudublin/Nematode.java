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
}
