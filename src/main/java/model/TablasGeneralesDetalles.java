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
@Table(name = "tablas_generales_detalles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TablasGeneralesDetalles.findAll", query = "SELECT t FROM TablasGeneralesDetalles t"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByIdTblGenDet", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.idTblGenDet = :idTblGenDet"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByNomTblGenDet", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.nomTblGenDet = :nomTblGenDet"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByIdTblGen", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.idTblGen = :idTblGen"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByEstado", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.estado = :estado"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByFecReg", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.fecReg = :fecReg"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByUserReg", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.userReg = :userReg"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByFecAct", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.fecAct = :fecAct"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByUserAct", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.userAct = :userAct"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByFecEli", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.fecEli = :fecEli"),
    @NamedQuery(name = "TablasGeneralesDetalles.findByUserEli", query = "SELECT t FROM TablasGeneralesDetalles t WHERE t.userEli = :userEli")})
public class TablasGeneralesDetalles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tbl_gen_det")
    private Integer idTblGenDet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom_tbl_gen_det")
    private String nomTblGenDet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tbl_gen")
    private int idTblGen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fec_reg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecReg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_reg")
    private int userReg;
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

    public TablasGeneralesDetalles() {
    }

    public TablasGeneralesDetalles(Integer idTblGenDet) {
        this.idTblGenDet = idTblGenDet;
    }

    public TablasGeneralesDetalles(Integer idTblGenDet, String nomTblGenDet, int idTblGen, int estado, Date fecReg, int userReg) {
        this.idTblGenDet = idTblGenDet;
        this.nomTblGenDet = nomTblGenDet;
        this.idTblGen = idTblGen;
        this.estado = estado;
        this.fecReg = fecReg;
        this.userReg = userReg;
    }

    public Integer getIdTblGenDet() {
        return idTblGenDet;
    }

    public void setIdTblGenDet(Integer idTblGenDet) {
        this.idTblGenDet = idTblGenDet;
    }

    public String getNomTblGenDet() {
        return nomTblGenDet;
    }

    public void setNomTblGenDet(String nomTblGenDet) {
        this.nomTblGenDet = nomTblGenDet;
    }

    public int getIdTblGen() {
        return idTblGen;
    }

    public void setIdTblGen(int idTblGen) {
        this.idTblGen = idTblGen;
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

    public int getUserReg() {
        return userReg;
    }

    public void setUserReg(int userReg) {
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
        hash += (idTblGenDet != null ? idTblGenDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablasGeneralesDetalles)) {
            return false;
        }
        TablasGeneralesDetalles other = (TablasGeneralesDetalles) object;
        if ((this.idTblGenDet == null && other.idTblGenDet != null) || (this.idTblGenDet != null && !this.idTblGenDet.equals(other.idTblGenDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TablasGeneralesDetalles[ idTblGenDet=" + idTblGenDet + " ]";
    }
    
}
