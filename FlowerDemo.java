
public class FlowerDemo
{
    public static void main(String[] args)
    {
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();
        Flower flower4 = new Flower();
        Flower flower5 = new Flower();
        Flower flower6 = new Flower();
        Flower flower7 = new Flower();
        Flower flower8 = new Flower();
        Flower flower9 = new Flower();
        Flower flower10 = new Flower();
        // Ask the flower1 object how many flowers have been picked
        flower1.getStatus();
        // Pick flower 5
        flower5.pick();
        // Ask the flower8 object how many flowers have been picked
        flower8.getStatus();
    }
}