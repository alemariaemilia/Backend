
package com.portfolio.AME.Service;

import com.portfolio.AME.Entity.Proyecto;
import com.portfolio.AME.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alema
 */

@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto rProyecto;

    public List<Proyecto> list() {
        return rProyecto.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return rProyecto.findById(id);
    }

    public Optional<Proyecto> getByTituloP(String tituloP) {
        return rProyecto.findByTituloP(tituloP);
    }

    public void save(Proyecto proyecto) {
        rProyecto.save(proyecto);
    }

    public void delete(int id) {
        rProyecto.deleteById(id);
    }

    public boolean existsById(int id) {
        return rProyecto.existsById(id);
    }

    public boolean existsByTituloP(String tituloP) {
        return rProyecto.existsByTituloP(tituloP);
    }
}
