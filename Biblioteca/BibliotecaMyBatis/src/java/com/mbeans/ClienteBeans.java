/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.mybatis.bo.ClienteBO;
import com.mybatis.vo.ClienteVO;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Melissa
 */
@ManagedBean(name = "clienteBeans")
@RequestScoped 
public class ClienteBeans {

    private ClienteVO cliente = new ClienteVO();
    private List<ClienteVO> clientes;

    public ClienteVO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteVO cliente) {
        this.cliente = cliente;
    }

    public List<ClienteVO> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteVO> clientes) {
        this.clientes = clientes;
    }
      
    private int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    public String nuevoCLiente(){
        System.out.println("Nuevo Cliente");
        ClienteBO cbo = new ClienteBO();
        cbo.nuevoCliente(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se ha dado de alta al cliente "+cliente.getDni()));
        return "cliente";
    }
    
}
