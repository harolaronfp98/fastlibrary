/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fastlibrary.fastlibrary;

import controlador.LibroControlador;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.MultipartConfig;
import model.Libro;

/**
 *
 * @author Harol
 */
@WebServlet(name = "LibroServlet", urlPatterns = {"/libro"})
@MultipartConfig
public class LibroServlet extends HttpServlet {
    
    LibroControlador libroControlador = new LibroControlador();

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
        
        String titulo = request.getParameter("autornombre_libro");
        String nombre_autor = request.getParameter("autorapepater_libro");
        String apellido_autor = request.getParameter("autorapemater_libro");
        String fecha = request.getParameter("aniopubl_libro");
        String editorial = request.getParameter("editorial_libro");
        
        String uploadDirectory = getServletContext().getRealPath("/resource");
        Path uploadPath = Path.of(uploadDirectory);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        
        try {
            InputStream input = request.getPart("file").getInputStream();
            InputStream imagen = request.getPart("editorial_libro").getInputStream();
            String fileName = request.getPart("file").getSubmittedFileName();
            String imagenName = request.getPart("editorial_libro").getSubmittedFileName();
            
            Path fileImagePath = uploadPath.resolve(imagenName);
            Files.copy(imagen, fileImagePath, StandardCopyOption.REPLACE_EXISTING);
            
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(input, filePath, StandardCopyOption.REPLACE_EXISTING);

            String ruta = uploadPath+"\\"+fileName;
            System.out.println("Archivo subido con éxito: "+ruta);
            
            Libro libro = new Libro();
            libro.setAutornombreLibro(titulo);
            libro.setAutorapepaterLibro(nombre_autor);
            libro.setAutorapematerLibro(apellido_autor);
            libro.setAniopublLibro(fecha);
            libro.setEditorialLibro(editorial);
            libro.setCodigoLibro(fileName);
            libro.setDistritopublLibro(imagenName);
            libro.setEstado(1);
            
            libroControlador.agregar(libro);
            request.setAttribute("message", "Archivo subido con éxito: " + uploadPath+"\\"+fileName);
            String resultPage = "admin/home.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
            dispatcher.forward(request, response);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Error al subir el archivo:"+ e.getMessage());
        }
        
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
