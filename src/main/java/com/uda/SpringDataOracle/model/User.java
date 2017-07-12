package com.uda.SpringDataOracle.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by enzamora on 12/07/17.
 */
@Entity(name = "SpringUser")
public class User {

    // "customer_seq" is Oracle sequence name.
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "USER_SEQ")
    Long id;

    @Column(name = "NOMBRE")
    String nombre;

    @Column(name = "APELLIDO1")
    String apellido1;

    @Column(name = "APELLIDO2")
    String apellido2;

    @Column(name = "EJIE")
    String ejie;

    @Column(name = "FECHA_ALTA")
    Date fechaAlta;

    @Column(name = "FECHA_BAJA")
    Date fechaBaja;

    @Column(name = "ROL")
    String rol;

    @Column(name = "FECHA_MODIF")
    Date fechaModif;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEjie() {
        return ejie;
    }

    public void setEjie(String ejie) {
        this.ejie = ejie;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFechaModif() {
        return fechaModif;
    }

    public void setFechaModif(Date fechaModif) {
        this.fechaModif = fechaModif;
    }
}
