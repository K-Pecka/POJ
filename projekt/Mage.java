package projekt;

public class Mage extends character {
    
    public Mage()
    {
        this.setWeapon("wand");
    }
    @Override
    public void levelUp(Level lv) {
        this.statistics.setStrength(this.statistics.getStrength()+lv.getStrength());
        this.statistics.setDefence(this.statistics.getDefence()+lv.getDefence()); 
        this.statistics.setIntelligence(this.statistics.getIntelligence()+lv.getIntelligence()*1.2);
        this.statistics.setDextrity(this.statistics.getDextrity()+lv.getDextrity()*1.05);
        this.statistics.setAgility(this.statistics.getAgility()+lv.getAgility()*1.02);
        this.statistics.setSpeed(this.statistics.getSpeed()+lv.getSpeed());
    }

}
