
import javax.swing.JOptionPane;

public class firstGUI {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Please Enter your name");
        JOptionPane.showMessageDialog(null, "HELLO "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your are " +age+ " Years old");
        
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your hight"));
        JOptionPane.showMessageDialog(null, "You are "+height+ " Cm long");

    
    }
}
