/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import model.Libro;
import model.Usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Harol
 */
public class ControladorPersistencia{
    
    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();
    PersonaJpaController personaJpaController = new PersonaJpaController();
    LibroJpaController libroJpaController = new LibroJpaController();
    PrestamoJpaController prestamoJpaController = new PrestamoJpaController();

    public void agregarUsuario(Usuario t) {
        usuarioJpaController.create(t);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioJpaController.findUsuarioEntities();
    }
    
    public Usuario buscarUsuario(Integer id){
        return usuarioJpaController.findUsuario(id);
    }
    
    public Usuario buscarUno(String email){
        return usuarioJpaController.findUsuarioEmail(email);
    }
    
    public void eliminarUsuario(Integer id){
        try{
            usuarioJpaController.destroy(id);
        }catch(NonexistentEntityException ex){
            System.out.println("ERROR - ControladorPersistencia: "+ex);
        }
    }
    
    public void agregarLibro(Libro t) {
        libroJpaController.create(t);
    }
    
    public List<Libro> listarLibros() {
        return libroJpaController.findLibroEntities();
    }
    
    public List<Libro> listarLibrosPor(String titulo , String autor) {
        return libroJpaController.buscarLibros(titulo, autor);
    }
    
    public Libro listarUnLibro(Integer id) {
        return libroJpaController.findLibro(id);
    }
}
