import javax.swing.*;

public class Aufruf
{
    public static void main(String[] args)
    {
        Vehicle auto1 = new Vehicle();
        Vehicle auto2 = new Vehicle();

        auto1.name="Audi";
        auto2.name="BMW";

        JOptionPane.showMessageDialog(null,"Ein " +auto1.name +" hat... ");
        Vehicle.calculatePower(180);

        JOptionPane.showMessageDialog(null, "Ein " +auto2.name +" hat... ");
        Vehicle.calculatePower(170);
    }
}
