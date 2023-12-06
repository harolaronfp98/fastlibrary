/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Nivel {
    
    private int id_nivel;
    private String nom_nivel;

    public Nivel() {
    }

    public Nivel(int id_nivel, String nom_nivel) {
        this.id_nivel = id_nivel;
        this.nom_nivel = nom_nivel;
    }

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getNom_nivel() {
        return nom_nivel;
    }

    public void setNom_nivel(String nom_nivel) {
        this.nom_nivel = nom_nivel;
    }
    
    
    
}
