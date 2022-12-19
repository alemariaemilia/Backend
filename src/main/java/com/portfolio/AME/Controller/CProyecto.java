
package com.portfolio.AME.Controller;

import com.portfolio.AME.Dto.dtoProyecto;
import com.portfolio.AME.Entity.Proyecto;
import com.portfolio.AME.Security.Controller.Mensaje;
import com.portfolio.AME.Service.SProyecto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alema
 */

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = {"https://mod3-frontfire.web.app","http://localhost:4200"})

public class CProyecto {
    @Autowired
    SProyecto sProyecto;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list() {
        List<Proyecto> list = sProyecto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") int id) {
        if (!sProyecto.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proyecto = sProyecto.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sProyecto.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sProyecto.delete(id);
        return new ResponseEntity(new Mensaje("Proyecto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtoproyecto) {
        if (StringUtils.isBlank(dtoproyecto.getTituloP())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sProyecto.existsByTituloP(dtoproyecto.getTituloP())) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proyecto = new Proyecto(
                dtoproyecto.getTituloP(), dtoproyecto.getDescripcionP(), dtoproyecto.getImgP(), dtoproyecto.getUrlP());
        sProyecto.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto creado"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyecto dtoproyecto) {
        if (!sProyecto.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (sProyecto.existsByTituloP(dtoproyecto.getTituloP())
                && sProyecto.getByTituloP(dtoproyecto.getTituloP()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese titulo ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoproyecto.getTituloP())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proyecto = sProyecto.getOne(id).get();

        proyecto.setTituloP(dtoproyecto.getTituloP());
        proyecto.setDescripcionP(dtoproyecto.getDescripcionP());
        proyecto.setImgP(dtoproyecto.getImgP());
        proyecto.setUrlP(dtoproyecto.getUrlP());

        sProyecto.save(proyecto);

        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }
}
