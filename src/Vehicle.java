import javax.swing.*;

public class Vehicle
{
    int power;
    double weight;
    String name;

    public static String printName(String name)
    {
        return name;
    }

    public static void calculatePower(int power)
    {
        double ergebnis= power*1.36;
        JOptionPane.showMessageDialog(null,  +power+ " Power, dass entspricht "+ergebnis +" PS");
    }

}
