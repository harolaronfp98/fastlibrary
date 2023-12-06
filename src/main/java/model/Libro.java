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
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l"),
    @NamedQuery(name = "Libro.findByIdLibro", query = "SELECT l FROM Libro l WHERE l.idLibro = :idLibro"),
    @NamedQuery(name = "Libro.findByCodigoLibro", query = "SELECT l FROM Libro l WHERE l.codigoLibro = :codigoLibro"),
    @NamedQuery(name = "Libro.findByAniopublLibro", query = "SELECT l FROM Libro l WHERE l.aniopublLibro = :aniopublLibro"),
    @NamedQuery(name = "Libro.findByAutornombreLibro", query = "SELECT l FROM Libro l WHERE l.autornombreLibro = :autornombreLibro"),
    @NamedQuery(name = "Libro.findByAutorapepaterLibro", query = "SELECT l FROM Libro l WHERE l.autorapepaterLibro = :autorapepaterLibro"),
    @NamedQuery(name = "Libro.findByAutorapematerLibro", query = "SELECT l FROM Libro l WHERE l.autorapematerLibro = :autorapematerLibro"),
    @NamedQuery(name = "Libro.findByEditorialLibro", query = "SELECT l FROM Libro l WHERE l.editorialLibro = :editorialLibro"),
    @NamedQuery(name = "Libro.findByDistritopublLibro", query = "SELECT l FROM Libro l WHERE l.distritopublLibro = :distritopublLibro"),
    @NamedQuery(name = "Libro.findByEstado", query = "SELECT l FROM Libro l WHERE l.estado = :estado")})
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro")
    private Integer idLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codigo_libro")
    private String codigoLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "aniopubl_libro")
    private String aniopublLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "autornombre_libro")
    private String autornombreLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "autorapepater_libro")
    private String autorapepaterLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "autorapemater_libro")
    private String autorapematerLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "editorial_libro")
    private String editorialLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "distritopubl_libro")
    private String distritopublLibro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Libro() {
    }

    public Libro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Libro(Integer idLibro, String codigoLibro, String aniopublLibro, String autornombreLibro, String autorapepaterLibro, String autorapematerLibro, String editorialLibro, String distritopublLibro, int estado) {
        this.idLibro = idLibro;
        this.codigoLibro = codigoLibro;
        this.aniopublLibro = aniopublLibro;
        this.autornombreLibro = autornombreLibro;
        this.autorapepaterLibro = autorapepaterLibro;
        this.autorapematerLibro = autorapematerLibro;
        this.editorialLibro = editorialLibro;
        this.distritopublLibro = distritopublLibro;
        this.estado = estado;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getAniopublLibro() {
        return aniopublLibro;
    }

    public void setAniopublLibro(String aniopublLibro) {
        this.aniopublLibro = aniopublLibro;
    }

    public String getAutornombreLibro() {
        return autornombreLibro;
    }

    public void setAutornombreLibro(String autornombreLibro) {
        this.autornombreLibro = autornombreLibro;
    }

    public String getAutorapepaterLibro() {
        return autorapepaterLibro;
    }

    public void setAutorapepaterLibro(String autorapepaterLibro) {
        this.autorapepaterLibro = autorapepaterLibro;
    }

    public String getAutorapematerLibro() {
        return autorapematerLibro;
    }

    public void setAutorapematerLibro(String autorapematerLibro) {
        this.autorapematerLibro = autorapematerLibro;
    }

    public String getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public String getDistritopublLibro() {
        return distritopublLibro;
    }

    public void setDistritopublLibro(String distritopublLibro) {
        this.distritopublLibro = distritopublLibro;
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
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Libro[ idLibro=" + idLibro + " ]";
    }
    
}
