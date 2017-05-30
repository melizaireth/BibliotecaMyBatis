package com.mybatis.vo;

import java.util.Date;


public class ReservaVO {
  
    private String dni;
    private String isbn_libro;
    private Date fecha_solicitud;
    private Date fecha_devolucion;
    private int penalizacion;

    public ReservaVO() {
    }

    public ReservaVO(String dni, String isbn_libro, Date fecha_solicitud, Date fecha_devolucion, int penalizacion) {
        this.dni = dni;
        this.isbn_libro = isbn_libro;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_devolucion = fecha_devolucion;
        this.penalizacion = penalizacion;
    }
    public ReservaVO(String dni) {
        this.dni = dni;        
    }
     public ReservaVO(String dni, String isbn, Date fecha_solicitud) {
        this.dni = dni;        
        this.isbn_libro = isbn;
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getIsbn_libro() {
        return isbn_libro;
    }

    public void setIsbn_libro(String isbn_libro) {
        this.isbn_libro = isbn_libro;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(int penalizacion) {
        this.penalizacion = penalizacion;
    }
    
    
    
}
