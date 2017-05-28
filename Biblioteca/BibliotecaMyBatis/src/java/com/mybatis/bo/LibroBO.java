/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybatis.bo;

import com.mybatis.MapperUtil;
import com.mybatis.dao.LibroDAO;
import com.mybatis.vo.LibroVO;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Melissa
 */
public class LibroBO implements LibroDAO{

    @Override
    public void nuevoLibro(LibroVO lvo) {
        SqlSession session = new MapperUtil().getSession();
        if(session!=null){
            try{
                //Debemos validar que el libro 
                System.out.println("Libro que se desea agregar: "+lvo.getIsbn());
                LibroVO libro = (LibroVO) session.selectOne("com.mybatis.dao.LibroDAO.getLibroByIsbn", lvo.getIsbn());
                if(libro !=null){
                 //Aqui verificamos que si existe el libro es un nuevo ejemplar
                    libro.setTotal_copias(libro.getTotal_copias()+1);
                    int update = session.update("com.mybatis.dao.LibroDAO.updateCantLibro", libro);     
                    //falta validar la actualizacion dle libro para enviar mensaje
                }else{
                    //si no existe el ejemplar lo agregamos como nuevo
                    session.insert("com.mybatis.dao.LibroDAO.nuevoLibro", lvo);
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
    public List<LibroVO> getLibros() {
        SqlSession session = new MapperUtil().getSession();
        List<LibroVO> libros = new ArrayList<LibroVO>();
        if(session!=null){
            try{
                //Debemos validar que el libro 
                System.out.println("Listar todos los libros");
                libros =  session.selectList("com.mybatis.dao.LibroDAO.getLibros");               
              
            }finally{
                session.close();
            }
        }else{
            //enviar mensaje
        }
        return libros;
    }
    
}
