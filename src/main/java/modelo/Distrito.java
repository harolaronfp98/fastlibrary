/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Distrito {
    
    private int id_distrito;
    private String nombre_distrito;
    private Provincia id_provincia;
    private Departamento id_dep;

    public Distrito() {
    }

    public Distrito(int id_distrito, String nombre_distrito, Provincia id_provincia, Departamento id_dep) {
        this.id_distrito = id_distrito;
        this.nombre_distrito = nombre_distrito;
        this.id_provincia = id_provincia;
        this.id_dep = id_dep;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getNombre_distrito() {
        return nombre_distrito;
    }

    public void setNombre_distrito(String nombre_distrito) {
        this.nombre_distrito = nombre_distrito;
    }

    public Provincia getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(Provincia id_provincia) {
        this.id_provincia = id_provincia;
    }

    public Departamento getId_dep() {
        return id_dep;
    }

    public void setId_dep(Departamento id_dep) {
        this.id_dep = id_dep;
    }
    
    
    
}
