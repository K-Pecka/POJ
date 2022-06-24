package projekt;

public class Archer extends character  {
    public Archer()
    {
        this.setWeapon("bow and arrow");
    }
    @Override
    public void levelUp(Level lv) {
        this.statistics.setStrength(this.statistics.getStrength()+lv.getStrength()*1.05);
        this.statistics.setDefence(this.statistics.getDefence()+lv.getDefence()*1.05); 
        this.statistics.setIntelligence(this.statistics.getIntelligence()+lv.getIntelligence());
        this.statistics.setDextrity(this.statistics.getDextrity()+lv.getDextrity()*1.20);
        this.statistics.setAgility(this.statistics.getAgility()+lv.getAgility()*1.02);
        this.statistics.setSpeed(this.statistics.getSpeed()+lv.getSpeed()*1.1);
    }
}
