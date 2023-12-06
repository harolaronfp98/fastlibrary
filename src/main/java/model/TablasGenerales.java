/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Harol
 */
@Entity
@Table(name = "tablas_generales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TablasGenerales.findAll", query = "SELECT t FROM TablasGenerales t"),
    @NamedQuery(name = "TablasGenerales.findByIdTblGen", query = "SELECT t FROM TablasGenerales t WHERE t.idTblGen = :idTblGen"),
    @NamedQuery(name = "TablasGenerales.findByNomTblGen", query = "SELECT t FROM TablasGenerales t WHERE t.nomTblGen = :nomTblGen"),
    @NamedQuery(name = "TablasGenerales.findByEstado", query = "SELECT t FROM TablasGenerales t WHERE t.estado = :estado"),
    @NamedQuery(name = "TablasGenerales.findByFecReg", query = "SELECT t FROM TablasGenerales t WHERE t.fecReg = :fecReg"),
    @NamedQuery(name = "TablasGenerales.findByUserReg", query = "SELECT t FROM TablasGenerales t WHERE t.userReg = :userReg"),
    @NamedQuery(name = "TablasGenerales.findByFecAct", query = "SELECT t FROM TablasGenerales t WHERE t.fecAct = :fecAct"),
    @NamedQuery(name = "TablasGenerales.findByUserAct", query = "SELECT t FROM TablasGenerales t WHERE t.userAct = :userAct"),
    @NamedQuery(name = "TablasGenerales.findByFecEli", query = "SELECT t FROM TablasGenerales t WHERE t.fecEli = :fecEli"),
    @NamedQuery(name = "TablasGenerales.findByUserEli", query = "SELECT t FROM TablasGenerales t WHERE t.userEli = :userEli")})
public class TablasGenerales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tbl_gen")
    private Integer idTblGen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom_tbl_gen")
    private String nomTblGen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_reg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecReg;
    @Column(name = "user_reg")
    private Integer userReg;
    @Column(name = "fec_act")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAct;
    @Column(name = "user_act")
    private Integer userAct;
    @Column(name = "fec_eli")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecEli;
    @Column(name = "user_eli")
    private Integer userEli;

    public TablasGenerales() {
    }

    public TablasGenerales(Integer idTblGen) {
        this.idTblGen = idTblGen;
    }

    public TablasGenerales(Integer idTblGen, String nomTblGen, int estado, Date fecReg) {
        this.idTblGen = idTblGen;
        this.nomTblGen = nomTblGen;
        this.estado = estado;
        this.fecReg = fecReg;
    }

    public Integer getIdTblGen() {
        return idTblGen;
    }

    public void setIdTblGen(Integer idTblGen) {
        this.idTblGen = idTblGen;
    }

    public String getNomTblGen() {
        return nomTblGen;
    }

    public void setNomTblGen(String nomTblGen) {
        this.nomTblGen = nomTblGen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public Integer getUserReg() {
        return userReg;
    }

    public void setUserReg(Integer userReg) {
        this.userReg = userReg;
    }

    public Date getFecAct() {
        return fecAct;
    }

    public void setFecAct(Date fecAct) {
        this.fecAct = fecAct;
    }

    public Integer getUserAct() {
        return userAct;
    }

    public void setUserAct(Integer userAct) {
        this.userAct = userAct;
    }

    public Date getFecEli() {
        return fecEli;
    }

    public void setFecEli(Date fecEli) {
        this.fecEli = fecEli;
    }

    public Integer getUserEli() {
        return userEli;
    }

    public void setUserEli(Integer userEli) {
        this.userEli = userEli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTblGen != null ? idTblGen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablasGenerales)) {
            return false;
        }
        TablasGenerales other = (TablasGenerales) object;
        if ((this.idTblGen == null && other.idTblGen != null) || (this.idTblGen != null && !this.idTblGen.equals(other.idTblGen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TablasGenerales[ idTblGen=" + idTblGen + " ]";
    }
    
}
