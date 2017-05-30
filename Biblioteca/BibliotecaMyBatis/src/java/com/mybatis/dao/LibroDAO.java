
package com.mybatis.dao;
import com.mybatis.vo.LibroVO;
import java.util.List;
/**
 *
 * @author Melissa
 */
public interface LibroDAO {
    public int TIPO_RESERVA = 1; 
    public int TIPO_DEVOLUCION = 2;
    public void nuevoLibro(LibroVO lvo);
    //tipo se refiere a si es reserva o devolución;
    public void updateReserva(int tipo, LibroVO libro);
    public List<LibroVO> getLibros();
    public LibroVO getLibroByIsbn(String isbn);
}
