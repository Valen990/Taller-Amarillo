/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marvel;

public class Vacunacion extends Mascota{
    String nombre;
    String vacuna;
    String estado; 

    public Vacunacion() {
    }

    public Vacunacion(String id_mascota, String nombre_m, String apodo, String especie, String raza, String color_pelo, String edad) {
        super(id_mascota, nombre_m, apodo, especie, raza, color_pelo, edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getId_mascota() {
        return id_mascota;
    }

    @Override
    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    @Override
    public String getNombre_m() {
        return nombre_m;
    }

    @Override
    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    @Override
    public String getApodo() {
        return apodo;
    }

    @Override
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String getColor_pelo() {
        return color_pelo;
    }

    @Override
    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    @Override
     public String Imprimir(){
        return getNombre_m() + ", " + getNombre() + ", " + getVacuna() + ", " + getEstado();
    }
}