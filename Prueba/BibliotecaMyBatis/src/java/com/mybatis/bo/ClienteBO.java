/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.bo;

import com.mybatis.MapperUtil;
import com.mybatis.dao.ClienteDAO;
import com.mybatis.vo.ClienteVO;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Melissa
 */
public class ClienteBO implements ClienteDAO{

    @Override
    public void nuevoCliente(ClienteVO cvo) {
        SqlSession session = new MapperUtil().getSession();
        if(session!=null){
            try{
                
                System.out.println("Libro que se desea agregar: "+cvo.getDni());
                ClienteVO cliente = (ClienteVO) session.selectOne("com.mybatis.dao.ClienteDAO.getClienteByDNI", cvo.getDni());
                if(cliente !=null){               
                   System.out.println("Aun no se que colocar aca");
                //    int update = session.update("com.mybatis.dao.ClienteDAO.updateCantLibro", cliente);                    
                }else{
                   
                    session.insert("com.mybatis.dao.ClienteDAO.nuevoCliente", cvo);
                }
                
                session.commit();
            }finally{
                session.close();
            }
        }else{
            //enviar mensaje
        }
    }

    @Override
    public List<ClienteVO> getClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteVO getClienteByDNI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
