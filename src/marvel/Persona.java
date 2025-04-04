package marvel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Persona {
    //String id_persona;
    String nombre;
    String familia;
    int cedula;
    String correo;
    String contrasena;
    int tel;
    String direccion;
    
    Persona() {
    }

    public Persona(String id_persona, String nombre, String familia, int cedula, String correo, String contrasena, int tel, String direccion) {
        //this.id_persona = id_persona;
        this.nombre = nombre;
        this.familia = familia;
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tel = tel;
        this.direccion = direccion;
    }

    /*public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String Imprimir(){
        return getNombre() + ", " + getFamilia() + ", " + getTel() + ", " + getDireccion();
    }
}