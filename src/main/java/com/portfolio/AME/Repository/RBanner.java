package com.portfolio.AME.Repository;

import com.portfolio.AME.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alema
 */

public interface RBanner extends JpaRepository<Banner, Integer> {
    public Optional<Banner> findByTituloB(String tituloB);

    public boolean existsByTituloB(String tituloB);

}
