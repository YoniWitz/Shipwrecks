package com.kbsp;

import com.kbsp.models.Shipwreck;
import com.kbsp.repositories.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by jhirshowitz on 6/24/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepoIntegrationTests {
    @Autowired
    private ShipwreckRepository shipwreckRepo;
    @Test
    public void GetAllWrecks(){
        List<Shipwreck> shipwrecks = shipwreckRepo.findAll();
        assertThat(shipwrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
