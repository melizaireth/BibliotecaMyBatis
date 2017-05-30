/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.dao;

import com.mybatis.vo.ClienteVO;
import java.util.List;

/**
 *
 * @author Melissa
 */
public interface ClienteDAO {
    public void nuevoCliente(ClienteVO cvo);
    public List<ClienteVO> getClientes();
    public ClienteVO getClienteByDNI(String dni);
    
}
