/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.bo;

import com.mybatis.MapperUtil;
import com.mybatis.dao.ReservaDAO;
import com.mybatis.vo.ClienteVO;
import com.mybatis.vo.ReservaVO;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Melissa
 */
public class ReservaBO implements ReservaDAO{

    @Override
    public void nuevaReseva(ReservaVO rvo) {
        SqlSession session = new MapperUtil().getSession();
        if(session!=null){
            try{
                
                session.insert("com.mybatis.dao.ReservaDAO.nuevaReseva", rvo);            
                
                session.commit();
            }finally{
                session.close();
            }
        }else{
            //enviar mensaje
        }
    }

    @Override
    public ClienteVO getReservaByDNI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
