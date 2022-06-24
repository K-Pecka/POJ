package projekt;

public class character extends characterClassInfo implements Action{
    private String weapon; 
    private int live=100;
    private int classCharacter=0;
    protected Statistics statistics=new Statistics(); 
    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }
    public String getWeapon()
    {
        return this.weapon;
    }
    public void setClassCharacter(int classCharacter)
    {
        this.classCharacter=classCharacter-1;
    }
    public int getClassCharacter()
    {
        return this.classCharacter;
    }
    public int getLive()
    {
        return this.live;
    } 
    @Override
    public void levelUp(Level lv) {
        this.statistics.setStrength(this.statistics.getStrength()+lv.getStrength());
        this.statistics.setDefence(this.statistics.getDefence()+lv.getDefence()); 
        this.statistics.setIntelligence(this.statistics.getIntelligence()+lv.getIntelligence());
        this.statistics.setDextrity(this.statistics.getDextrity()+lv.getDextrity());
        this.statistics.setAgility(this.statistics.getAgility()+lv.getAgility());
        this.statistics.setSpeed(this.statistics.getSpeed()+lv.getSpeed());
    }
}
 