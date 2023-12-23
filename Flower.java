public class Flower
{
    private static int picked = 0;
    private String flowerColour;
    public Flower()
    {
        flowerColour = "red";
    }

    public void pick()
    {
        picked++;
    }

    public void getStatus()
    {
        System.out.println(picked + " Flowers have been picked");
    }
}
