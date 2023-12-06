/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Provincia {
    
    private int id_provincia;
    private String nombre_provincia;
    private Departamento id_departamento;

    public Provincia() {
    }

    public Provincia(int id_provincia, String nombre_provincia, Departamento id_departamento) {
        this.id_provincia = id_provincia;
        this.nombre_provincia = nombre_provincia;
        this.id_departamento = id_departamento;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getNombre_provincia() {
        return nombre_provincia;
    }

    public void setNombre_provincia(String nombre_provincia) {
        this.nombre_provincia = nombre_provincia;
    }

    public Departamento getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Departamento id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    
    
}
