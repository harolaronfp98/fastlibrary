/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fastlibrary.fastlibrary;

import controlador.UsuarioControlador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Harol
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

    UsuarioControlador usuarioControlador = new UsuarioControlador();
    int cont = 0;
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String rule = request.getParameter("rule");
        String encryptedPassword;
        if(rule.equals("registrar")){
            String usuario_codigo = request.getParameter("usuario_codigo");
            String usuario_email = request.getParameter("usuario_email");
            String usuario_celular = request.getParameter("usuario_celular");
            String usuario_fijo = request.getParameter("usuario_fijo");
            String usuario_numdoc = request.getParameter("usuario_numdoc");
            String usuario_password = request.getParameter("usuario_password");
            
            Usuario usuario = new Usuario();
            usuario.setUsuarioCodigo(usuario_codigo);
            usuario.setUsuarioEmail(usuario_email);
            usuario.setUsuarioCelular(usuario_celular);
            usuario.setUsuarioFijo(usuario_fijo);
            usuario.setUsuarioNumdoc(usuario_numdoc);
            usuario.setUsuarioPassword(usuario_password);
            
            encryptedPassword = encryptPassword(usuario_password);
            usuario.setPasswordDesencriptado(encryptedPassword);
            
            usuario.setIdNivel(1);
            usuario.setIdDistrito(1);
            usuario.setIdPersona(1);
            usuario.setEstado(1);
            
            usuarioControlador.agregar(usuario);
        }else{
            String email = request.getParameter("usuario_email");
            String password = request.getParameter("usuario_password");
            
            Usuario usuario = usuarioControlador.verificarUno(email);
  
            boolean passwordMatch = checkPassword(password, usuario.getPasswordDesencriptado());

            if(usuario != null && !usuario.getUsuarioEmail().isEmpty()){
                if(passwordMatch && cont <= 3){
                    cont = 0;
                    System.out.println("Contraseña correcta");
                }else if(cont >= 3){
                    cont = 4;
                    System.out.println("Contraseña incorrecta - supero 3 intentos");
                }else{
                    cont++;
                    System.out.println("Contraseña incorrecta - turnos: "+cont);
                }
            }else{
                System.out.println("UsuarioServlet: Usuario no Encontrado");
            }
            
        }
        
    }
    
    protected String encryptPassword(String password) {
        return DigestUtils.md5Hex(password);
    }
    
    protected boolean checkPassword(String enteredPassword, String storedEncryptedPassword) {
        String enteredPasswordHash = encryptPassword(enteredPassword);
        return enteredPasswordHash.equals(storedEncryptedPassword);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
