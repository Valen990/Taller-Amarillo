/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class ArchivoGrueso {
    private static final String RUTA_ARCHIVO = "historial.txt";
    private static final SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");

    public static void guardarEnArchivo(List<Historial> ListaHistorial) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Historial m : ListaHistorial) {
                writer.write(m.getNombre_m() + ", " +
                             m.getObservaciones() + ", " +
                             fecha.format(m.getFecha()));
                writer.newLine();
            }
            System.out.println("Historiales guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los historiales: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar historiales");
        }
    }

    public static List<Historial> cargarDesdeArchivo() {
        List<Historial> ListaHistorial = new ArrayList<>();
        File archivo = new File(RUTA_ARCHIVO);

        if (!archivo.exists() || archivo.length() == 0) {
            return ListaHistorial;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",\\s*"); // Permite comas con o sin espacio
                if (datos.length == 3) {
                    Historial m = new Historial();
                    m.setNombre_m(datos[0].trim());
                    m.setObservaciones(datos[1].trim());
                    try {
                        m.setFecha(fecha.parse(datos[2].trim()));
                    } catch (ParseException e) {
                        System.err.println("Error de formato de fecha en línea: " + linea);
                        continue;
                    }
                    ListaHistorial.add(m);
                } else {
                    System.err.println("Línea ignorada (formato incorrecto): " + linea);
                }
            }
            System.out.println("Datos de los historiales cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los historiales: " + e.getMessage());
        }
        return ListaHistorial;
    }

    public static void eliminarDeArchivo(String nombre_m) {
        List<Historial> ListaHistorial = cargarDesdeArchivo();
        boolean eliminado = false;

        Iterator<Historial> it = ListaHistorial.iterator();
        while (it.hasNext()) {
            Historial m = it.next();
            if (m.getNombre_m().equals(nombre_m)) {
                it.remove();
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarEnArchivo(ListaHistorial);
            System.out.println("Historial eliminado correctamente.");
        } else {
            System.out.println("Historial no encontrado: " + nombre_m);
        }
    }

    public static void actualizarHistorialEnArchivo(String historialOriginal, Historial historialActualizado) {
        List<Historial> ListaHistorial = cargarDesdeArchivo();
        boolean actualizado = false;

        for (int i = 0; i < ListaHistorial.size(); i++) {
            Historial historialActual = ListaHistorial.get(i);
            if (historialActual.getNombre_m().equals(historialOriginal)) {
                ListaHistorial.set(i, historialActualizado);
                actualizado = true;
                break;
            }
        }

        if (actualizado) {
            guardarEnArchivo(ListaHistorial);
            System.out.println("Historial actualizado correctamente.");
        } else {
            System.out.println("No se encontró un historial con el nombre: " + historialOriginal);
        }
    }
}