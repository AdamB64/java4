
/**
 * Write a description of class game here.
 *
 * @author adam buchan
 * @version 11/01/22
 */
import java.util.*;
public class Room
{
    //room instance variables
    private String name;
    private String description;
    private Map<String,Room> linkedRooms = new HashMap<String,Room>();
    private Character character;

    public void linkRoom(Room roomToLink, String direction)
    {
        linkedRooms.put(direction, roomToLink);
    }

    public Room(String roomName)
    {
        name = roomName;  
        description=null;
        character=null;
    }

    public Character getCharacter()
    {
        return character;
    }

    public void setCharacter(Character characterInfo)
    {
        character= characterInfo;
    }
    
    public void setDescription(String roomDescription)
    {
        description = roomDescription;
    }

    public String getDescription()
    {
        return description;
    }

    public void setName(String roomName)
    {
        name = roomName;
    }

    public String getName()
    {     
        return name;
    }

    public void describe()
    {
        System.out.println(description);
    }

    public void getDetails()
    {
        System.out.println(name);
        System.out.println("----------------------------");
        System.out.println(description);
        for(Map.Entry<String, Room> entry: linkedRooms.entrySet()){
            System.out.println("The " + entry.getValue().getName() + " is " + entry.getKey());
        }
    }

    public Room move(String directions)
    {
        if(linkedRooms.containsKey(directions)){
            return linkedRooms.get(directions);
        }
        else
        {
            System.out.println("you cant go that way");
        }
        return this;
    }
}

