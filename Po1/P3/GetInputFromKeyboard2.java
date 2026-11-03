import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "", hoby = "";
        name = JOptionPane.showInputDialog("Your Name :");
        hoby = JOptionPane.showInputDialog("Your Hobby :");
        String msg = "So your hobby is " + hoby + ". nice hobby mister." + name;
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("So your hobby is " + hoby + ". nice hoby mr. " + name);
    }
}
