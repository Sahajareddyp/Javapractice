class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music");
    }
    public void openGames()
    {
        System.out.println("Open Games");
    }
    public String getmePen(int cost)
    {
        return "Pen";
    }
}
public class MethodCreation {

    public static void main(String args[])
    {

    Computer comp = new Computer();
    comp.playMusic();
    String str=comp.getmePen(10);
    System.out.println(str);
    }
    
}
