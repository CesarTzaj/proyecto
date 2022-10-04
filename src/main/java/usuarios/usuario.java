
package usuarios;

import javax.swing.JOptionPane;

public class usuario {
  private String nombre;

    public usuario(String n) {
        this.nombre = n;
    }

    public usuario() {
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
  
}
