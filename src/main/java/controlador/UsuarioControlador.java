/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaces.UsuarioInterface;
import java.util.List;
import model.Usuario;
import persistencia.ControladorPersistencia;

/**
 *
 * @author Harol
 */
public class UsuarioControlador implements UsuarioInterface{
    
    ControladorPersistencia controladorPersistencia = new ControladorPersistencia();

    @Override
    public void agregar(Usuario t) {
        controladorPersistencia.agregarUsuario(t);
    }

    @Override
    public List<Usuario> listarTodos() {
        return controladorPersistencia.listarUsuarios();
    }

    @Override
    public Usuario listarUno(Integer id) {
        return controladorPersistencia.buscarUsuario(id);
    }

    @Override
    public Usuario verificarUno(String email) {
        return controladorPersistencia.buscarUno(email);
    }

    @Override
    public void eliminar(Integer intgr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
