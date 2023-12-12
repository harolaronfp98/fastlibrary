/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Harol
 * @param <T>
 */
public interface CRUD<T> {
    
    public void agregar(T data);
    public void eliminar(Integer id);
    public void modificar(T data);
    public List<T> listarTodos();
    public List<T> listarTodosPor(String titulo, String autor);
    public T listarUno(Integer id);
    public T verificarUno(String email);
    
}
