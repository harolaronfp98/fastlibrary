/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fastlibrary.fastlibrary;

import controlador.LibroControlador;
import controlador.UsuarioControlador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Libro;
import model.Usuario;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Harol
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

    UsuarioControlador usuarioControlador = new UsuarioControlador();
    LibroControlador libroControlador = new LibroControlador();
    int cont = 3;
    String bd = "";
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
            usuario.setEstado(1);
            
            usuarioControlador.agregar(usuario);
            
            response.sendRedirect("index.jsp");
        }else{
            
            String email = request.getParameter("usuario_email");
            String password = request.getParameter("usuario_password");
            
            Usuario usuario = usuarioControlador.verificarUno(email);
            
            if(!email.equals(bd)){
                cont = 3;
            }
            if(usuario != null && !usuario.getUsuarioEmail().isEmpty()){
                boolean passwordMatch = checkPassword(password, usuario.getPasswordDesencriptado());
                if(passwordMatch){
                    cont = 3;
                    
                    Cookie userEmail = new Cookie("userEmail", usuario.getUsuarioEmail());
                    
                    userEmail.setMaxAge(1800);
                    
                    response.addCookie(userEmail);
                    
                    /*request.setAttribute("email", usuario.getUsuarioEmail());
                    request.setAttribute("celular", usuario.getUsuarioCelular());
                    request.setAttribute("password", usuario.getUsuarioPassword());
                    request.setAttribute("username", usuario.getUsuarioCodigo());

                    String resultPage = "library/home.jsp";
                    RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
                    dispatcher.forward(request, response);*/
                    if(usuario.getIdNivel() == 3){
                        response.sendRedirect("admin/home.jsp");
                    }else{
                        response.sendRedirect("library/home.jsp");
                    }
                    
                    System.out.println("Contraseña correcta");
                }else if(cont <= 1){
                    bd = usuario.getUsuarioEmail();
                    cont = 0;
                    request.setAttribute("message", "Supero los 3 intentos, intentelo dentro de 1 hora");
                    String resultPage = "index.jsp";
                    RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
                    dispatcher.forward(request, response);
                    System.out.println("Contraseña incorrecta - supero 3 intentos");
                }else{
                    bd = usuario.getUsuarioEmail();
                    cont--;
                    request.setAttribute("message", "Le quedan "+cont+" intentos");
                    String resultPage = "index.jsp";
                    RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
                    dispatcher.forward(request, response);
                    System.out.println("Contraseña incorrecta - turnos: "+cont);
                }
            }else{
                request.setAttribute("message", "Usuario no Encontrado");
                    String resultPage = "index.jsp";
                    RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
                    dispatcher.forward(request, response);
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
