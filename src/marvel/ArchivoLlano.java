/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class ArchivoLlano {
    
    private static final String RUTA_ARCHIVO = "vacunas.txt";

    public static void guardarEnArchivo(List<Vacunacion> ListaVacunas) {
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
   
    public static List<Vacunacion> cargarDesdeArchivo() {
        List<Vacunacion> ListaVacunas = new ArrayList<>();
        File archivo = new File(RUTA_ARCHIVO);

        if (!archivo.exists() || archivo.length() == 0) {
            return ListaVacunas;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 4) {
                    Vacunacion v = new Vacunacion();
                    v.setNombre_m(datos[0].trim());
                    v.setNombre(datos[1].trim());
                    v.setVacuna(datos[2].trim());
                    v.setEstado(datos[3].trim());
                    
                    ListaVacunas.add(v);
                }
            }
            System.out.println("Datos de las vacunaciones cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar las vacunaciones: " + e.getMessage());
        }
        return ListaVacunas;
    }
    
    public static void eliminarDeArchivo(String nombre_m) {
        List<Vacunacion> ListaVacunas = cargarDesdeArchivo();
        boolean eliminado = false;

        Iterator<Vacunacion> it = ListaVacunas.iterator();
        while (it.hasNext()) {
            Vacunacion v = it.next();
            if (v.getNombre_m().equals(nombre_m)) {
                it.remove();
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarEnArchivo(ListaVacunas);
            System.out.println("Vacunación eliminada correctamente.");
        } else {
            System.out.println("Vacunación no encontrada: " + nombre_m);
        }
    }
   
    public static void actualizarVacunacionEnArchivo(String nombreOriginal, Vacunacion vacunaActualizada) {
        List<Vacunacion> ListaVacunas = cargarDesdeArchivo();
        boolean actualizado = false;

        for (int i = 0; i < ListaVacunas.size(); i++) {
            Vacunacion vacunaActual = ListaVacunas.get(i);
            if (vacunaActual.getNombre_m().equals(nombreOriginal)) {
                ListaVacunas.set(i, vacunaActualizada);
                actualizado = true;
                break;
            }
        }

        if (actualizado) {
            guardarEnArchivo(ListaVacunas);
            System.out.println("Vacunación actualizada correctamente.");
        } else {
            System.out.println("No se encontró una vacunación con el nombre: " + nombreOriginal);
        }
    }
}