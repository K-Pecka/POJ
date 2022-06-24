package projekt;

import java.util.ArrayList;

public class Statistics {
    ArrayList<String> statisticsName = new ArrayList<String>();
    private double strength=0;
    private double defence=0;
    private double intelligence=0;
    private double dextrity=0;
    private double agility=0;
    private double speed=0;
    public Statistics()
    {
        this(0,0,0,0,0,0);
    }
    public Statistics(double strength, double defence, double intelligence, double dextrity, double agility, double speed)
    {
        this.strength=strength;
        this.defence=defence;
        this.intelligence=intelligence;
        this.dextrity=dextrity;
        this.agility=agility;
        this.speed=speed;
        statisticsName.add("strength");
        statisticsName.add("defence");
        statisticsName.add("intelligence");
        statisticsName.add("dextrity");
        statisticsName.add("agility");
        statisticsName.add("speed");
    }
    public double getStrength(){return this.strength;}
    public double getDefence(){return this.defence;}
    public double getIntelligence(){return this.intelligence;}
    public double getDextrity(){return this.dextrity;}
    public double getAgility(){return this.agility;}
    public double getSpeed(){return this.speed;}

    public void setStrength(double strength){this.strength=strength;}
    public void setDefence(double defence){this.defence=defence;}
    public void setIntelligence(double intelligence){this.intelligence=intelligence;}
    public void setDextrity(double dextrity){this.dextrity=dextrity;}
    public void setAgility(double agility){this.agility=agility;}
    public void setSpeed(double speed){this.speed=speed;}
    public String toString()
    {
        return "Strength: "+this.getStrength()+"\n"+
        "Defence: "+this.getDefence()+"\n"+
        "Inteligent: "+this.getIntelligence()+"\n"+
        "Dextrity: "+this.getDextrity()+"\n"+
        "Agilty: "+this.getAgility()+"\n"+
        "Speed: "+this.getSpeed();
        
    }
}
