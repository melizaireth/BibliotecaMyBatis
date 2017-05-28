/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.vo;

import java.util.Date;

/**
 *
 * @author Melissa
 */
public class LibroVO {
    private String isbn;
    private String nombre_libro;
    private String autor;
    private Date fecha_publicacion;
    private String categoria;
    private int total_copias;
    private int prestamos;
    
    public LibroVO (){
    
    }

    public LibroVO(String isbn, String nombre_libro, String autor, Date fecha_publicacion, String categoria) {
        this.isbn = isbn;
        this.nombre_libro = nombre_libro;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
        this.categoria = categoria;
    }

    public LibroVO(String nombre_libro, String autor, Date fecha_publicacion, String categoria) {
        this.nombre_libro = nombre_libro;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotal_copias() {
        return total_copias;
    }

    public void setTotal_copias(int total_copias) {
        this.total_copias = total_copias;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
    @Override
    public String toString(){
        return isbn+"---"+nombre_libro;
        //return super.toString();
    }
}
