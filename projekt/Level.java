package projekt;

public class Level extends Statistics {
    private int MAX_POINTS=10;
    public Level()
    {
        super(0,0,0,0,0,0);
    }
    public int getMAX_POINTS()
    {
        return this.MAX_POINTS;
    }
    public String toString()
    {
        return "Strength: "+this.getStrength()+"\n"+
        "Speed: "+this.getSpeed()+"\n"+
        "Inteligent: "+this.getIntelligence()+"\n"+
        "Dextrity: "+this.getDextrity()+"\n"+
        "Defence: "+this.getDefence()+"\n"+
        "Agilty: "+this.getAgility();
    }
}
