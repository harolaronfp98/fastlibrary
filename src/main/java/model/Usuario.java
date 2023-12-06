/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Harol
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByIdPersona", query = "SELECT u FROM Usuario u WHERE u.idPersona = :idPersona"),
    @NamedQuery(name = "Usuario.findByUsuarioCodigo", query = "SELECT u FROM Usuario u WHERE u.usuarioCodigo = :usuarioCodigo"),
    @NamedQuery(name = "Usuario.findByUsuarioPassword", query = "SELECT u FROM Usuario u WHERE u.usuarioPassword = :usuarioPassword"),
    @NamedQuery(name = "Usuario.findByIdNivel", query = "SELECT u FROM Usuario u WHERE u.idNivel = :idNivel"),
    @NamedQuery(name = "Usuario.findByUsuarioEmail", query = "SELECT u FROM Usuario u WHERE u.usuarioEmail = :usuarioEmail"),
    @NamedQuery(name = "Usuario.findByUsuarioCelular", query = "SELECT u FROM Usuario u WHERE u.usuarioCelular = :usuarioCelular"),
    @NamedQuery(name = "Usuario.findByUsuarioFijo", query = "SELECT u FROM Usuario u WHERE u.usuarioFijo = :usuarioFijo"),
    @NamedQuery(name = "Usuario.findByUsuarioNumdoc", query = "SELECT u FROM Usuario u WHERE u.usuarioNumdoc = :usuarioNumdoc"),
    @NamedQuery(name = "Usuario.findByIdDistrito", query = "SELECT u FROM Usuario u WHERE u.idDistrito = :idDistrito"),
    @NamedQuery(name = "Usuario.findByEstado", query = "SELECT u FROM Usuario u WHERE u.estado = :estado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "id_persona")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "usuario_codigo")
    private String usuarioCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "usuario_password")
    private String usuarioPassword;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "password_desencriptado")
    private String passwordDesencriptado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_nivel")
    private int idNivel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usuario_email")
    private String usuarioEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "usuario_celular")
    private String usuarioCelular;
    @Size(max = 15)
    @Column(name = "usuario_fijo")
    private String usuarioFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "usuario_numdoc")
    private String usuarioNumdoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_distrito")
    private int idDistrito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String usuarioCodigo, String usuarioPassword, String passwordDesencriptado, int idNivel, String usuarioEmail, String usuarioCelular, String usuarioNumdoc, int idDistrito, int estado) {
        this.idUsuario = idUsuario;
        this.usuarioCodigo = usuarioCodigo;
        this.usuarioPassword = usuarioPassword;
        this.passwordDesencriptado = passwordDesencriptado;
        this.idNivel = idNivel;
        this.usuarioEmail = usuarioEmail;
        this.usuarioCelular = usuarioCelular;
        this.usuarioNumdoc = usuarioNumdoc;
        this.idDistrito = idDistrito;
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuarioCodigo() {
        return usuarioCodigo;
    }

    public void setUsuarioCodigo(String usuarioCodigo) {
        this.usuarioCodigo = usuarioCodigo;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    public String getPasswordDesencriptado() {
        return passwordDesencriptado;
    }

    public void setPasswordDesencriptado(String passwordDesencriptado) {
        this.passwordDesencriptado = passwordDesencriptado;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getUsuarioCelular() {
        return usuarioCelular;
    }

    public void setUsuarioCelular(String usuarioCelular) {
        this.usuarioCelular = usuarioCelular;
    }

    public String getUsuarioFijo() {
        return usuarioFijo;
    }

    public void setUsuarioFijo(String usuarioFijo) {
        this.usuarioFijo = usuarioFijo;
    }

    public String getUsuarioNumdoc() {
        return usuarioNumdoc;
    }

    public void setUsuarioNumdoc(String usuarioNumdoc) {
        this.usuarioNumdoc = usuarioNumdoc;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
