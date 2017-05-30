/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.mybatis.bo.ClienteBO;
import com.mybatis.bo.LibroBO;
import com.mybatis.bo.ReservaBO;
import com.mybatis.vo.ClienteVO;
import com.mybatis.vo.LibroVO;
import com.mybatis.vo.ReservaVO;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author Melissa
 */
@ManagedBean(name = "reserva")
@RequestScoped
public class ReservaBeans {

    /**
     * Creates a new instance of ReservaBeans
     */
    public ReservaBeans() {
    }
    private int index = 0;
    
    private ClienteVO cliente;
    private ReservaVO reserva;
    private LibroVO libro;
    private String dni;
    private String isbn;

    public int getIndex() {
            return index;
    }

    public void setIndex(int index) {
            this.index = index;
    }

    public ClienteVO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteVO cliente) {
        this.cliente = cliente;
    }

    public ReservaVO getReserva() {
        return reserva;
    }

    public void setReserva(ReservaVO reserva) {
        this.reserva = reserva;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LibroVO getLibro() {
        return libro;
    }

    public void setLibro(LibroVO libro) {
        this.libro = libro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @PostConstruct
    public void init() {
        cliente = new ClienteVO();
        libro = new LibroVO();
        
    }
   
    public void buscarCliente(AjaxBehaviorEvent evento){
       
       ClienteBO cbo = new ClienteBO();
       cliente = cbo.getClienteByDNI(dni);
       LibroBO lbo = new LibroBO();
       libro = lbo.getLibroByIsbn(isbn);
    }
    
    public void reservarLibro(AjaxBehaviorEvent evento){
        System.out.println("Llega al metodo 2 - DNI: "+cliente.getDni()+" - ISBN: "+libro.getIsbn());
        Date fecha = new Date();
        LibroBO lbo = new LibroBO();
        libro.setPrestamos(libro.getPrestamos()+1);
        lbo.updateReserva(1, libro);
        ReservaBO rbo = new ReservaBO();
        ReservaVO rvo = new ReservaVO(cliente.getDni(), libro.getIsbn(), fecha);
        rbo.nuevaReseva(rvo);        
    }
    
}
