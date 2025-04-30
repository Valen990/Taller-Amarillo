/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoLiso {

    private static final String RUTA_ARCHIVO = "mascotas.txt";

    public static void guardarEnArchivo(List<Mascota> ListaMascotas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Mascota a : ListaMascotas) {
                writer.write(a.getNombre_m() + ", " + 
                           a.getApodo() + ", " + 
                           a.getEspecie() + ", " +
                           a.getRaza() + ", " +
                           a.getColor_pelo() + ", " +
                           a.getEdad());
                writer.newLine();
            }
            System.out.println("Datos de la mascota guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos de la mascota: " + e.getMessage());
        }    
    }

    public static List<Mascota> cargarDesdeArchivo() {
        List<Mascota> ListaMascotas = new ArrayList<>();
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists() || archivo.length() == 0) {
            return ListaMascotas;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    Mascota a = new Mascota();
                    a.setNombre_m(datos[0].trim());
                    a.setApodo(datos[1].trim());
                    a.setEspecie(datos[2].trim());
                    a.setRaza(datos[3].trim());
                    a.setColor_pelo(datos[4].trim());
                    a.setEdad(datos[5].trim());
                                        
                    ListaMascotas.add(a);
                }
            }
            System.out.println("Datos de la mascota cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        } 
        return ListaMascotas;
    }

    public static void eliminarDeArchivo(String nombre_m) {
        List<Mascota> ListaMascotas = cargarDesdeArchivo();
        boolean eliminado = false;

        for (Mascota a : new ArrayList<>(ListaMascotas)) {
            if (a.getNombre_m().equals(nombre_m)) {
                ListaMascotas.remove(a);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarEnArchivo(ListaMascotas);
            System.out.println("Mascota eliminada correctamente.");
        } else {
            System.out.println("Mascota no encontrada: " + nombre_m);
        }
    }
    
    public static void actualizarMascotaEnArchivo(String nombre_mOriginal, Mascota datosActualizados) {
    List<Mascota> ListaMascotas = cargarDesdeArchivo(); 
    boolean actualizado = false;

    for (int i = 0; i < ListaMascotas.size(); i++) {
        Mascota mascotaActual = ListaMascotas.get(i);
        if (mascotaActual.getNombre_m().equals(nombre_mOriginal)) {
            ListaMascotas.set(i, datosActualizados); 
            actualizado = true;
            break;
        }
    }

    if (actualizado) {
        guardarEnArchivo(ListaMascotas);
        System.out.println("Mascota actualizada correctamente.");
    } else {
        System.out.println("No se encontró una mascota con el nombre: " + nombre_mOriginal);
    }
}
}