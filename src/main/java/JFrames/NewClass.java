
package JFrames;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NewClass {
    public static void main(String[] args) {
         ArrayList<String> sueldo = new ArrayList<>();
        ArrayList<String> SueldoSinComa = new ArrayList<>();
        SueldoSinComa.add("6,000");
        SueldoSinComa.add("6,000");
        SueldoSinComa.add("6,000");
        JOptionPane.showMessageDialog(null, SueldoSinComa.size());
        for (int i = 0; i < SueldoSinComa.size(); i++) {
            JOptionPane.showMessageDialog(null, sueldo);
            try {
               SueldoSinComa.set(i, SueldoSinComa.get(i).replace(",", ""));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }
        JOptionPane.showMessageDialog(null, SueldoSinComa);
        
    }
}
