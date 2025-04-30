/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoPlano {
    
    private static final String RUTA_ARCHIVO = "clientes.txt";

    public static void guardarEnArchivo(List<Persona> ListaClientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Persona cliente : ListaClientes) {
                writer.write(cliente.getNombre() + ", " + 
                            cliente.getFamilia() + ", " + 
                            cliente.getCedula() + ", " +
                            cliente.getCorreo() + ", " +
                            cliente.getContrasena() + ", " +
                            cliente.getTel() + ", " + 
                            cliente.getDireccion());
                writer.newLine();
            }
            System.out.println("Datos de los clientes guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static List<Persona> cargarDesdeArchivo() {
        List<Persona> ListaClientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(", ");
                if(datos.length == 7) {
                    Persona cliente = new Persona();
                    cliente.setNombre(datos[0].trim());
                    cliente.setFamilia(datos[1].trim());
                    cliente.setCedula(Integer.parseInt(datos[2].trim()));
                    cliente.setCorreo(datos[3].trim());
                    cliente.setContrasena(datos[4].trim());
                    cliente.setTel(Integer.parseInt(datos[5].trim()));
                    cliente.setDireccion(datos[6].trim());
                    
                    ListaClientes.add(cliente);
                }
            }
            System.out.println("Datos de los clientes cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en formato numérico: " + e.getMessage());
        }
        return ListaClientes;
    }
    
    public static void eliminarDeArchivo(String nombre) {
        List<Persona> ListaClientes = cargarDesdeArchivo();
        boolean eliminado = false;

        for (Persona cliente : new ArrayList<>(ListaClientes)) {
            if (cliente.getNombre().equals(nombre)) {
                ListaClientes.remove(cliente);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarEnArchivo(ListaClientes);
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("Cliente no encontrado: " + nombre);
        }
    }
    
    public static void actualizarClienteEnArchivo(String nombreActual, Persona datosActualizados) {
    List<Persona> ListaClientes = cargarDesdeArchivo(); 
    boolean actualizado = false;

    for (int i = 0; i < ListaClientes.size(); i++) {
        Persona clienteActual = ListaClientes.get(i);
        if (clienteActual.getNombre().equals(nombreActual)) {
            ListaClientes.set(i, datosActualizados); 
            actualizado = true;
            break;
        }
    }

    if (actualizado) {
        guardarEnArchivo(ListaClientes);
        System.out.println("Cliente actualizado correctamente.");
    } else {
        System.out.println("No se encontró un cliente con el nombre: " + nombreActual);
    }
}
}