/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Usuario {
    
    private int id_usuario;
    private Persona id_persona;
    private String usuario_codigo;
    private String password_desencriptado;
    private String usuario_password;
    private Nivel id_nivel;
    private String usuario_email;
    private String usuario_celular;
    private String usuario_fijo;
    private String usuario_numdoc;
    private Distrito id_distrito;
    private int estado;

    public Usuario() {
    }

    public Usuario(int id_usuario, Persona id_persona, String usuario_codigo, String password_desencriptado, String usuario_password, Nivel id_nivel, String usuario_email, String usuario_celular, String usuario_fijo, String usuario_numdoc, Distrito id_distrito, int estado) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.usuario_codigo = usuario_codigo;
        this.password_desencriptado = password_desencriptado;
        this.usuario_password = usuario_password;
        this.id_nivel = id_nivel;
        this.usuario_email = usuario_email;
        this.usuario_celular = usuario_celular;
        this.usuario_fijo = usuario_fijo;
        this.usuario_numdoc = usuario_numdoc;
        this.id_distrito = id_distrito;
        this.estado = estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }

    public String getUsuario_codigo() {
        return usuario_codigo;
    }

    public void setUsuario_codigo(String usuario_codigo) {
        this.usuario_codigo = usuario_codigo;
    }

    public String getPassword_desencriptado() {
        return password_desencriptado;
    }

    public void setPassword_desencriptado(String password_desencriptado) {
        this.password_desencriptado = password_desencriptado;
    }

    public String getUsuario_password() {
        return usuario_password;
    }

    public void setUsuario_password(String usuario_password) {
        this.usuario_password = usuario_password;
    }

    public Nivel getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(Nivel id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    public String getUsuario_celular() {
        return usuario_celular;
    }

    public void setUsuario_celular(String usuario_celular) {
        this.usuario_celular = usuario_celular;
    }

    public String getUsuario_fijo() {
        return usuario_fijo;
    }

    public void setUsuario_fijo(String usuario_fijo) {
        this.usuario_fijo = usuario_fijo;
    }

    public String getUsuario_numdoc() {
        return usuario_numdoc;
    }

    public void setUsuario_numdoc(String usuario_numdoc) {
        this.usuario_numdoc = usuario_numdoc;
    }

    public Distrito getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(Distrito id_distrito) {
        this.id_distrito = id_distrito;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }  
    
}
