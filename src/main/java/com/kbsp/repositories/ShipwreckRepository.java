package com.kbsp.repositories;

import com.kbsp.models.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jhirshowitz on 6/23/2016.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
