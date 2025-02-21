package com.bancolombia.test.models;

public class Funcionarios {

    private String nommbre, apellido, direccion, puesto;
    private int edad, telefono, id;

    public Funcionarios(
        String nombre,
        String apellido, 
        String direccion, 
        String puesto,
        int edad, 
        int telefono, 
        int id
        ){
            this.nommbre  = nombre;
            this.apellido = apellido;
            this.direccion = direccion;
            this.puesto    = puesto;
            this.edad      = edad;
            this.telefono  = telefono;
            this.id = id; 

        }


    public String getNommbre() {
        return nommbre;
    }
    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
