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
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Persona.findByPersonaNombres", query = "SELECT p FROM Persona p WHERE p.personaNombres = :personaNombres"),
    @NamedQuery(name = "Persona.findByPersonaApater", query = "SELECT p FROM Persona p WHERE p.personaApater = :personaApater"),
    @NamedQuery(name = "Persona.findByPersonaAmater", query = "SELECT p FROM Persona p WHERE p.personaAmater = :personaAmater"),
    @NamedQuery(name = "Persona.findByPersonaFoto", query = "SELECT p FROM Persona p WHERE p.personaFoto = :personaFoto"),
    @NamedQuery(name = "Persona.findByPersonaDireccion", query = "SELECT p FROM Persona p WHERE p.personaDireccion = :personaDireccion"),
    @NamedQuery(name = "Persona.findByPersonaDireccionRef", query = "SELECT p FROM Persona p WHERE p.personaDireccionRef = :personaDireccionRef")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "persona_nombres")
    private String personaNombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "persona_apater")
    private String personaApater;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "persona_amater")
    private String personaAmater;
    @Size(max = 100)
    @Column(name = "persona_foto")
    private String personaFoto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "persona_direccion")
    private int personaDireccion;
    @Size(max = 100)
    @Column(name = "persona_direccion_ref")
    private String personaDireccionRef;

    public Persona() {
    }

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Integer idPersona, String personaNombres, String personaApater, String personaAmater, int personaDireccion) {
        this.idPersona = idPersona;
        this.personaNombres = personaNombres;
        this.personaApater = personaApater;
        this.personaAmater = personaAmater;
        this.personaDireccion = personaDireccion;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getPersonaNombres() {
        return personaNombres;
    }

    public void setPersonaNombres(String personaNombres) {
        this.personaNombres = personaNombres;
    }

    public String getPersonaApater() {
        return personaApater;
    }

    public void setPersonaApater(String personaApater) {
        this.personaApater = personaApater;
    }

    public String getPersonaAmater() {
        return personaAmater;
    }

    public void setPersonaAmater(String personaAmater) {
        this.personaAmater = personaAmater;
    }

    public String getPersonaFoto() {
        return personaFoto;
    }

    public void setPersonaFoto(String personaFoto) {
        this.personaFoto = personaFoto;
    }

    public int getPersonaDireccion() {
        return personaDireccion;
    }

    public void setPersonaDireccion(int personaDireccion) {
        this.personaDireccion = personaDireccion;
    }

    public String getPersonaDireccionRef() {
        return personaDireccionRef;
    }

    public void setPersonaDireccionRef(String personaDireccionRef) {
        this.personaDireccionRef = personaDireccionRef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
