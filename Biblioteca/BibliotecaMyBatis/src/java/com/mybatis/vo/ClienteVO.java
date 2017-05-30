
package com.mybatis.vo;

/**
 *
 * @author Melissa
 */
public class ClienteVO {
    private String dni;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String email;
    private String movil;
    
    public ClienteVO() {
        
    }

    public ClienteVO(String dni, String nombre, String primer_apellido, String segundo_apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public ClienteVO(String dni, String nombre, String primer_apellido, String segundo_apellido, String email, String movil) {
        this.dni = dni;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.email = email;
        this.movil = movil;
    }
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }
    
    
}
