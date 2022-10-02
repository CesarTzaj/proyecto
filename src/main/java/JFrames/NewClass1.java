
package JFrames;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NewClass1 {
    public static void main(String[] args) {
        ArrayList<Integer> DatosRepetidos = new ArrayList<>();
        ArrayList<Integer> TrabajadorID = new ArrayList<>();
        TrabajadorID.add(1);
        TrabajadorID.add(2);
        TrabajadorID.add(1);
        TrabajadorID.add(3);
        TrabajadorID.add(2);
        
        for (int i = 0; i < TrabajadorID.size(); i++) {

            for (int j = i + 1; j < TrabajadorID.size(); j++) {

                if (TrabajadorID.get(i) == TrabajadorID.get(j)) {
                    DatosRepetidos.add(TrabajadorID.get(i) );

                }
            }
        }
        JOptionPane.showMessageDialog(null, DatosRepetidos + "Dato repetido");
    }
}
