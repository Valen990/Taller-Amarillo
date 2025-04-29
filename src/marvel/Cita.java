/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    String nombre;
    String nombre_m;
    LocalDate fecha;
    LocalTime hora;
    String motivo_cita;

    public Cita() {
    }

    public Cita(String nombre, String nombre_m, LocalDate fecha, LocalTime hora, String motivo_cita) {
        this.nombre = nombre;
        this.nombre_m = nombre_m;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo_cita = motivo_cita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getMotivo_cita() {
        return motivo_cita;
    }

    public void setMotivo_cita(String motivo_cita) {
        this.motivo_cita = motivo_cita;
    }
    
    public String Imprimir(){
        return getNombre() + ", " + getNombre_m() + ", " + getFecha() + ", " + getHora() + ", " + getMotivo_cita();
    }
}