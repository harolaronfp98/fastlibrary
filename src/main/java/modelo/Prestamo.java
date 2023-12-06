/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Prestamo {
    
    private int id_prestamo;
    private Libro id_libro;
    private Usuario id_usuario;
    private int estado;

    public Prestamo() {
    }

    public Prestamo(int id_prestamo, Libro id_libro, Usuario id_usuario, int estado) {
        this.id_prestamo = id_prestamo;
        this.id_libro = id_libro;
        this.id_usuario = id_usuario;
        this.estado = estado;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Libro getId_libro() {
        return id_libro;
    }

    public void setId_libro(Libro id_libro) {
        this.id_libro = id_libro;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
