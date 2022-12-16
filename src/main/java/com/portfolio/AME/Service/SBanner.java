package com.portfolio.AME.Service;

import com.portfolio.AME.Entity.Banner;
import com.portfolio.AME.Repository.RBanner;
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
public class SBanner {
    @Autowired
    RBanner RBanner;

    public List<Banner> list() {
        return RBanner.findAll();
    }

    public Optional<Banner> getOne(int id) {
        return RBanner.findById(id);
    }

    public Optional<Banner> getByTituloB(String tituloB) {
        return RBanner.findByTituloB(tituloB);
    }

    public void save(Banner banner) {
        RBanner.save(banner);
    }

    public void delete(int id) {
        RBanner.deleteById(id);
    }

    public boolean existsById(int id) {
        return RBanner.existsById(id);
    }

    public boolean existsByTituloB(String tituloB) {
        return RBanner.existsByTituloB(tituloB);
    }
}
