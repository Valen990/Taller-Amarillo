/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArchivoPlano4 {
    private static final String RUTA_ARCHIVO = "citas.txt";
    private static final DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd-MM-yy");
    private static final DateTimeFormatter hora = DateTimeFormatter.ofPattern("H:mm");

    public static void guardarEnArchivo(List<Cita> ListaCitas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Cita cita : ListaCitas) {
                String linea = String.join(", ",
                    cita.getNombre(),
                    cita.getNombre_m(),
                    cita.getFecha().format(fecha),
                    cita.getHora().format(hora),
                    cita.getMotivo_cita()
                );
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Datos de las citas guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos de las citas: " + e.getMessage());
            JOptionPane.showMessageDialog(null,
                "Error al guardar las citas:\n" + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void guardarCita(Cita cita) {
        List<Cita> lista = cargarDesdeArchivo();
        lista.add(cita);
        guardarEnArchivo(lista);
    }

    public static List<Cita> cargarDesdeArchivo() {
        List<Cita> ListaCitas = new ArrayList<>();
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists() || archivo.length() == 0) {
            return ListaCitas;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(", ");
                if (datos.length == 5) {
                    Cita cita = new Cita();
                    cita.setNombre(datos[0].trim());
                    cita.setNombre_m(datos[1].trim());
                    cita.setFecha(LocalDate.parse(datos[2].trim(), fecha));
                    cita.setHora(LocalTime.parse(datos[3].trim(), hora));
                    cita.setMotivo_cita(datos[4].trim());

                    ListaCitas.add(cita);
                }
            }
            System.out.println("Datos de las citas cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        return ListaCitas;
    }

    public static void eliminarDeArchivo(String nombre) {
        List<Cita> lista = cargarDesdeArchivo();
        boolean eliminado = lista.removeIf(cita -> cita.getNombre().equals(nombre));

        if (eliminado) {
            guardarEnArchivo(lista);
            System.out.println("Cita eliminada correctamente.");
        } else {
            System.out.println("Cita no encontrada: " + nombre);
        }
    }
}