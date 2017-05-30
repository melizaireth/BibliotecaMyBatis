/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.dao;

import com.mybatis.vo.ClienteVO;
import com.mybatis.vo.ReservaVO;

/**
 *
 * @author Melissa
 */
public interface ReservaDAO {
    public void nuevaReseva(ReservaVO rvo);
    public ClienteVO getReservaByDNI();
}
