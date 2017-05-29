
package com.mybatis.dao;
import com.mybatis.vo.LibroVO;
import java.util.List;
/**
 *
 * @author Melissa
 */
public interface LibroDAO {
    public void nuevoLibro(LibroVO lvo);
    public List<LibroVO> getLibros();
}
