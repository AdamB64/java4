
/**
 * Write a description of class CharacterTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class CharacterTest
{
    public static void main(String[] args)
    {
        Enemy dave = new Enemy("Dave","A smelly zombie"); 
        dave.describe();
        dave.setConversation("hello my name is dave how are you");
        dave.talk();
        dave.setWeakness("Cheese");

        Scanner input = new Scanner(System.in);
        System.out.println("What will you fght with?");
        String fightWith = input.nextLine();
        boolean winFight = dave.fight(fightWith);

        if(winFight)
        {
            System.out.println("you win");
        }else{
            System.out.println("you lose");
        }
    }
}
