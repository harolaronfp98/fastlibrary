/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Harol
 * @param <T>
 */
public interface CRUD<T> {
    
    public boolean agregar(T data);
    public boolean eliminar(int id);
    public boolean modificar(T data);
    public ArrayList<T> listarTodos();
    public T listarUno(int id);
    public T verificarUno(String email);
    
}
