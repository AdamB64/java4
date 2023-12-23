
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends Character
{
    private String weakness;
    public Enemy(String characterName, String characterDescription)
    {
        super(characterName,characterDescription);
        weakness=null;
    }
    
    public void setWeakness(String enemysWeakness)
    {
        weakness=enemysWeakness;
    }
   
    public String getWeakness()
    {
        return weakness;
    }
    
    @Override
    public boolean fight(String combatItem)
    {
        if(combatItem.equals(weakness))
        {
            System.out.println("Your fend " + name + " off with the " + combatItem);
            return true;
        }else
        {
            System.out.println(name + " crushes you, puny adventurer");
            return false;
        }
    }
}
