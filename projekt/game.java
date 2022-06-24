package projekt;

import java.util.ArrayList;
import java.util.Scanner;

public class game {
    public static final int SPACE=50;
    public static Scanner scanner = new Scanner(System.in);
    public static Player player;
    public static Level level;
    public static void main(String[] args) {
        System.out.println("\n\n===========================================================\n");
        System.out.print("Welcome to the HEROSES game!\nEnter your nickname: ");
        player = new Player(scanner.next());
        chooseClass();
        cls();
        player.playerInfo();
        levelUp();   
        player.playerInfo();
    }
    public static void chooseClass()
    {
        System.out.println("Choose your character class:");
        Print_character_class();
        System.out.print("Character class:");
        int choose=chooseCheck(player.character.CharacterClass,"character class:",new int[0]);
        switch(choose)
        {
            case 1:player.character = new Mage();player.character.setClassCharacter(1);break;
            case 2:player.character = new Knight();player.character.setClassCharacter(2);break;
            case 3:player.character = new Archer();player.character.setClassCharacter(3);break;
        }
    }
    public static void levelUp()
    {
        System.out.println("Congratulations! you have reached a new level!");
        System.out.println("========================================\n");
        System.out.println("Your actually statistic:\n");
        System.out.println(player.character.statistics.toString());
        System.out.println("\n========================================\n");
        level = new Level();
        boolean isChoose = true;
        int chooseOption;
        int points;
        int sum=0;
        int pointDistributed=level.getMAX_POINTS()+player.getBankEx();
        while(isChoose)
        {
            if(sum<pointDistributed || !isChoose)
            {
                System.out.println("\nSelect options:");
                Print_statistics();
                System.out.print("or if you want to save points enter -1: ");
                int[] exception= {-1};
                chooseOption=chooseCheck(player.character.statistics.statisticsName,"Select options or if you want to save points enter -1:",exception);
                if(chooseOption ==-1)break;
                System.out.print("\nHow many points do you want to spend on these stats [1-"+(pointDistributed-sum)+"] :");
                points = chooseCheckInt(pointDistributed-sum,"How many points do you want to spend on these stats [1-"+(pointDistributed-sum)+"] :");
                sum+=points;
                switch(chooseOption)
                {
                    case 1:level.setStrength(points+level.getStrength());break;
                    case 2:level.setDefence(points+level.getDefence());break;
                    case 3:level.setIntelligence(points+level.getIntelligence());break;
                    case 4:level.setDextrity(points+level.getDextrity());break;
                    case 5:level.setAgility(points+level.getAgility());break;
                    case 6:level.setSpeed(points+level.getSpeed());break;
                    default:System.out.println("Podano złą wartość");isChoose=!isChoose;
                }
            }
            else
            {
                break;
            }
        }
        player.setBankEx(level.getMAX_POINTS()-sum);
        player.character.levelUp(level);
        player.setLevel(player.getLevel()+1);
        System.out.println("Your actually statistic:\n");
        System.out.println("=====================================");
        System.out.println(player.character.statistics.toString());
        System.out.println("=====================================");
    }
    public static void Print_character_class()
    {
        int heroInterator=1;
        for(String hero : player.character.CharacterClass)
        {
            System.out.println(" "+heroInterator+")"+hero);
            heroInterator++;
        }
    }
    public static void Print_statistics()
    {
        int statisticsInterator=1;
        for(String statistics : player.character.statistics.statisticsName)
        {
            System.out.println(" "+statisticsInterator+")"+statistics);
            statisticsInterator++;
        } 
    }
    public static void cls()
    {
        for(int i=0;i<SPACE;i++)System.out.println("");
    }
    public static int chooseCheck(ArrayList<String> list,String message,int[] exception)
    {
        Boolean correct=true;
        int Choose=0;
        while(correct)
        {
            correct=false;
            try
            {
                Choose=Integer.parseInt(scanner.next());
                for(int i=0;i<exception.length;i++)if(Choose==exception[i])return Choose;
                list.get(Choose-1);
            }
            catch(IndexOutOfBoundsException e)
            {
                System.err.println("An unidentified option has been selected! Select options [1-"+list.size()+"]");
                correct=true;
                System.out.print(message);
            }
            catch(NumberFormatException  e)
            {
                System.err.println("enter the number [1-"+list.size()+"]");
                correct=true;
                System.out.print(message);
            }
            
        }
        return Choose;
    }
    public static int chooseCheckInt(int max,String message)
    {
        Boolean correct=true;
        int Choose=0;
        while(correct)
        {
            correct=false;
            try
            {
                Choose=Integer.parseInt(scanner.next());
                if(Choose>max || Choose<1){System.err.println("enter the number [1-"+max+"]");correct=true;System.out.print(message);}
                if(Choose==0)return Choose;
            }
            catch(NumberFormatException  e)
            {
                System.err.println("enter the number [1-"+max+"]");
                System.out.print(message);
                correct=true;
            }
            
        }
        return Choose;
    }
}   