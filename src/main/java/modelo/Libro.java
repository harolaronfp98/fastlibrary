/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Libro {
    
    private int id_libro;
    private String codigo_libro;
    private String aniopubl_libro;
    private String autornombre_libro;
    private String autorapepater_libro;
    private String autorapemater_libro;
    private String editorial_libro;
    private String distritopubl_libro;
    private int estado;

    public Libro() {
    }

    public Libro(int id_libro, String codigo_libro, String aniopubl_libro, String autornombre_libro, String autorapepater_libro, String autorapemater_libro, String editorial_libro, String distritopubl_libro, int estado) {
        this.id_libro = id_libro;
        this.codigo_libro = codigo_libro;
        this.aniopubl_libro = aniopubl_libro;
        this.autornombre_libro = autornombre_libro;
        this.autorapepater_libro = autorapepater_libro;
        this.autorapemater_libro = autorapemater_libro;
        this.editorial_libro = editorial_libro;
        this.distritopubl_libro = distritopubl_libro;
        this.estado = estado;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(String codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public String getAniopubl_libro() {
        return aniopubl_libro;
    }

    public void setAniopubl_libro(String aniopubl_libro) {
        this.aniopubl_libro = aniopubl_libro;
    }

    public String getAutornombre_libro() {
        return autornombre_libro;
    }

    public void setAutornombre_libro(String autornombre_libro) {
        this.autornombre_libro = autornombre_libro;
    }

    public String getAutorapepater_libro() {
        return autorapepater_libro;
    }

    public void setAutorapepater_libro(String autorapepater_libro) {
        this.autorapepater_libro = autorapepater_libro;
    }

    public String getAutorapemater_libro() {
        return autorapemater_libro;
    }

    public void setAutorapemater_libro(String autorapemater_libro) {
        this.autorapemater_libro = autorapemater_libro;
    }

    public String getEditorial_libro() {
        return editorial_libro;
    }

    public void setEditorial_libro(String editorial_libro) {
        this.editorial_libro = editorial_libro;
    }

    public String getDistritopubl_libro() {
        return distritopubl_libro;
    }

    public void setDistritopubl_libro(String distritopubl_libro) {
        this.distritopubl_libro = distritopubl_libro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
