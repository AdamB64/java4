
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String name;
    private String description;
    
    public Item(String itemName)
    {
        name=itemName;
    }
    
    public void setDescription(String itemDescription){
        description = itemDescription;
    }
    
    public String getDescription()
    {
        return description;
    }
    
     public void setName(String itemName){
        name = itemName;
    }
    
    public String getName(){     
        return name;
    }
    
    public void describe()
    {
        System.out.println(description);
    }
    
     public void getDetails()
    {
        System.out.println(name);
        System.out.println(description);
    }
}
