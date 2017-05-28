/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.dao;

import com.mybatis.vo.ClienteVO;

/**
 *
 * @author Melissa
 */
public interface ReservaDAO {
    public void nuevaReseva();
    public ClienteVO getReservaByDNI();
}
