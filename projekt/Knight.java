package projekt;

public class Knight extends character  {
    public Knight()
    {
        this.setWeapon("sword");
    }
    @Override
    public void levelUp(Level lv) {
        this.statistics.setStrength(this.statistics.getStrength()+lv.getStrength()*1.20);
        this.statistics.setDefence(this.statistics.getDefence()+lv.getDefence()*1.1); 
        this.statistics.setIntelligence(this.statistics.getIntelligence()+lv.getIntelligence());
        this.statistics.setDextrity(this.statistics.getDextrity()+lv.getDextrity()*1.05);
        this.statistics.setAgility(this.statistics.getAgility()+lv.getAgility()*1.02);
        this.statistics.setSpeed(this.statistics.getSpeed()+lv.getSpeed()*1.05);
    }
}
