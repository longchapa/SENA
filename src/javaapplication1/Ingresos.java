/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.Transient;

/**
 *
 * @author calvo
 */
@Entity
@Table(name = "ingresos", catalog = "postgres", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Ingresos.findAll", query = "SELECT i FROM Ingresos i")
    , @NamedQuery(name = "Ingresos.findById", query = "SELECT i FROM Ingresos i WHERE i.id = :id")
    , @NamedQuery(name = "Ingresos.findByFecha", query = "SELECT i FROM Ingresos i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Ingresos.findByNombre", query = "SELECT i FROM Ingresos i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Ingresos.findByDescripcion", query = "SELECT i FROM Ingresos i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "Ingresos.findByProvedor", query = "SELECT i FROM Ingresos i WHERE i.provedor = :provedor")
    , @NamedQuery(name = "Ingresos.findByCantidad", query = "SELECT i FROM Ingresos i WHERE i.cantidad = :cantidad")
    , @NamedQuery(name = "Ingresos.findByCosto", query = "SELECT i FROM Ingresos i WHERE i.costo = :costo")
    , @NamedQuery(name = "Ingresos.findBySaldo", query = "SELECT i FROM Ingresos i WHERE i.saldo = :saldo")})
public class Ingresos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "provedor")
    private String provedor;
    @Column(name = "cantidad")
    private BigInteger cantidad;
    @Column(name = "costo")
    private BigInteger costo;
    @Column(name = "saldo")
    private BigInteger saldo;

    public Ingresos() {
    }

    public Ingresos(Integer id) {
        this.id = id;
    }

    public Ingresos(Integer id, String nombre, String descripcion, String provedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.provedor = provedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        String oldProvedor = this.provedor;
        this.provedor = provedor;
        changeSupport.firePropertyChange("provedor", oldProvedor, provedor);
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        BigInteger oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    public BigInteger getCosto() {
        return costo;
    }

    public void setCosto(BigInteger costo) {
        BigInteger oldCosto = this.costo;
        this.costo = costo;
        changeSupport.firePropertyChange("costo", oldCosto, costo);
    }

    public BigInteger getSaldo() {
        return saldo;
    }

    public void setSaldo(BigInteger saldo) {
        BigInteger oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingresos)) {
            return false;
        }
        Ingresos other = (Ingresos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Ingresos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
