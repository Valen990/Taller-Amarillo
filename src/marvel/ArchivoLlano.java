/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package marvel;
import java.io.*;
import java.util.List;
import javax.swing.JOptionPane;

public class ArchivoLlano {
    private static final String RUTA_ARCHIVO = "vacunas.txt";

   public static void guardarVacunacionesEnArchivo(List<Vacunacion> ListaVacunas) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
        for (Vacunacion v : ListaVacunas) {
            writer.write(v.getNombre_m() + ", " +
                         v.getNombre() + ", " +
                         v.getVacuna() + ", " +
                         v.getEstado());
            writer.newLine();
        }
        System.out.println("Vacunaciones guardadas correctamente.");
    } catch (IOException e) {
        System.err.println("Error al guardar las vacunaciones: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al guardar vacunaciones");
    }
}

    public static void guardarEnArchivo(Vacunacion ListaVacunas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Preguntar.
    /*static void actualizarVacunacion(Vacunacion vacunaSeleccionada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
    //Se supone que para editar.
    /*public static void actualizarVacunacionEnArchivo(String nombreOriginal, Vacunacion vacunaActualizada) {
        try {
            List<Vacunacion> vacunaciones = leerTodasLasVacunaciones();
            
            for (int i = 0; i < vacunaciones.size(); i++) {
                if (vacunaciones.get(i).getNombre_m().equals(nombreOriginal)) {
                    vacunaciones.set(i, vacunaActualizada);
                    break;
                }
            }
            
            guardarTodasLasVacunaciones(vacunaciones);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar archivo: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static List<Vacunacion> leerTodasLasVacunaciones() {
        return new ArrayList<>();
    }
    
    private static void guardarTodasLasVacunaciones(List<Vacunacion> lista) {
    }*/

    static void guardarVacunacion(Vacunacion v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}