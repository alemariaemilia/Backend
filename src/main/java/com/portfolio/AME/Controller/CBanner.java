package com.portfolio.AME.Controller;

import com.portfolio.AME.Dto.dtoBanner;
import com.portfolio.AME.Entity.Banner;
import com.portfolio.AME.Security.Controller.Mensaje;
import com.portfolio.AME.Service.SBanner;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alema
 */

@RestController
@RequestMapping("/banner")
@CrossOrigin(origins ="http://localhost:4200")
public class CBanner {
    @Autowired
    SBanner sBanner;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Banner>> list() {
        List<Banner> list = sBanner.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id") int id) {
        if (!sBanner.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Banner banner = sBanner.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoBanner dtobanner) {
        if (!sBanner.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (sBanner.existsByTituloB(dtobanner.getTituloB())
                && sBanner.getByTituloB(dtobanner.getTituloB()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtobanner.getTituloB())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Banner banner = sBanner.getOne(id).get();

        banner.setTituloB(dtobanner.getTituloB());
        banner.setImgB(dtobanner.getImgB());

        sBanner.save(banner);

        return new ResponseEntity(new Mensaje("Banner actualizada"), HttpStatus.OK);
    }
}
