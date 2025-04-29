package marvel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Mascota {
    String id_mascota;
    String nombre_m;
    String apodo;
    String especie;
    String raza;
    String color_pelo;
    String edad;
    
    Mascota() {
    }

    public Mascota(String id_mascota, String nombre_m, String apodo, String especie, String raza, String color_pelo, String edad) {
        this.id_mascota = id_mascota;
        this.nombre_m = nombre_m;
        this.apodo = apodo;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo = color_pelo;
        this.edad = edad;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String Imprimir(){
        return getNombre_m() + ", " + getApodo() + ", " + getEspecie() + ", " + getRaza() + ", " + getColor_pelo() + ", " + getEdad();
    }
}