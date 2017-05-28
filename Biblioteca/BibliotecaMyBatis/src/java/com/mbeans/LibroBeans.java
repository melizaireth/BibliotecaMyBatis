/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import com.mybatis.MapperUtil;
import com.mybatis.bo.LibroBO;
import com.mybatis.vo.LibroVO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Melissa
 */
@ManagedBean (name="libroBeans")
@SessionScoped 
public class LibroBeans {

    /**
     * Creates a new instance of LibroBeans
     */
    
    private LibroVO libro;
    private List<LibroVO> libros;
    private String adress;
    
    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
    public LibroBeans() {
        libro = new LibroVO();
    }

    public LibroVO getLibro() {
        return libro;
    }

    public void setLibro(LibroVO libro) {
        this.libro = libro;
    }

    public List<LibroVO> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroVO> libros) {
        this.libros = libros;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public String guardarNuevoLibro(){
        /*Para asignar un id por defecto, -1 y lo tomara como autoincremental
        No es el caso pero dejare el ejemplo:
        
        libro.setId(-1);        
        */
       
        LibroBO lbo = new LibroBO();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
             
        System.out.println("Fecha Publicación: "+format.format(libro.getFecha_publicacion()));
        
        
        lbo.nuevoLibro(libro);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Libro Guardado"));
        return "index"; //request.getRequestDispatcher("index.jsp")
    }
    
    public String rediret(){
        System.out.println("Metodo para redireccionar");
      //  adress = "prueba";
        return "success";
        
    }
    
    public List<LibroVO> consultaLibros(){
        libros = new ArrayList<LibroVO>();
        LibroBO lbo = new LibroBO();
        libros = lbo.getLibros();
        return libros;
    }
    
    public void handleFileUpload(FileUploadEvent event) {
        System.out.println("Subir fichero");
        UploadedFile file = event.getFile();
		FacesMessage message = new FacesMessage("Exito", event.getFile().getFileName() + " Subido Correctamente.");
		FacesContext.getCurrentInstance().addMessage(null, message);

		try {
			file.write("C:/Users/Melissa/Desktop/pruebas/" + file.getFileName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
