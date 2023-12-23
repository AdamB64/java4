
/**
 * Represents an entity within the game
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character
{
    // instance variables
    protected String name, description, conversation;

    /**
     * Constructor for objects of class Character
     */
    public Character(String characterName, String characterDescription)
    {
        name = characterName;
        description = characterDescription;
        conversation = null;
    }

    /**
     * Describe the character
     */
    public void describe()
    {
        System.out.println(name + " is here!");
        System.out.println(description);
    }

    /**
      * Set what this character will say when talked to
      */
    public void setConversation(String characterConversation)
    {
        conversation = characterConversation;
    }

    /**
     * Talk to this character
     */
    public void talk()
    {
        if (conversation != null)
        {
            System.out.println("[" + name + " says]: " + conversation);
        }
        else
        {
            System.out.println(name + " doesn't want to talk to you");
        }
    }

    /**
      * Fight with this character
      */
    public boolean fight(String combatItem)
    {
        System.out.println(name + " doesn't want to fight with you");
        return true;
    }
}
