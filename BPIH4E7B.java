import javax.swing.*;

public class BPIH4E7B {
    public static void main(String args[]) {
        String s;
        long factorial=1;
        int number=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        for(int i=1;i<=number;i++)
        {
            factorial*=i;
        }
        s=""+number+"!="+factorial;
        JOptionPane.showMessageDialog(null,s,"Factorial",JOptionPane.PLAIN_MESSAGE);
    }
}