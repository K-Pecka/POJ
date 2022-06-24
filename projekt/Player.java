package projekt;

public class Player {
    private int bankEX=0;
    private int level;
    private String nickname;
    public character character = new character();
    public Player(String nickname)
    {
        this.nickname = nickname;
        this.level = 1;
    }
    public String getNickName()
    {
        return this.nickname;
    }
    public int getBankEx()
    {
        return this.bankEX;
    }
    public void setBankEx(int bankEX)
    {
        this.bankEX=bankEX;
    }
    public int getLevel()
    {
        return this.level;
    }
    public void setLevel(int level)
    {
        this.level=level;
    }
    public void playerInfo()
    {
        System.out.println("\n=============PLAYER INFO================");
        System.out.println(
            "Nickname: "+this.nickname+"\n"+
            "Level: "+this.level+"\n"+
            "Class: "+this.character.CharacterClass.get(this.character.getClassCharacter())+"\n"+
            "Weapon: "+this.character.getWeapon()+"\n"+
            "Experience points: "+this.getBankEx());
        System.out.println("========================================\n\n\n");
    }
}
