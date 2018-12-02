import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        //GANZE Zahlen
        int a = 10;
        int b = 20;

        System.out.println(Taschenrechner.addierenI(a,b));
        System.out.println(Taschenrechner.subtrahierenI(a,b));
        System.out.println(Taschenrechner.multiplizierenI(a,b));
        System.out.println(Taschenrechner.dividierenI(a,b));

        //Gleitkomma Zahlen
        double c = 2.5;
        double d = 3.5;

        System.out.println(Taschenrechner.addierenD(c,d));
        System.out.println(Taschenrechner.subtrahierenD(c,d));
        System.out.println(Taschenrechner.multiplizierenD(c,d));
        System.out.println(Taschenrechner.dividierenD(c,d));



        //Aufgabe 2
        partialString(JOptionPane.showInputDialog(null,"Bitte geben Sie einen Wert ein"));
    }

    public static void partialString(String a)
    {
        int length = a.length();
        System.out.println(length);
        if (length < 3)
        {
            System.out.println("Geben Sie einen längeren Wert ein");
        } else
        {
            String length1 = a.substring(2);
        System.out.println(length1);
        }

    }
}
