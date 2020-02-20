package com.kbsp;

import com.kbsp.controllers.ShipwreckController;
import com.kbsp.models.Shipwreck;
import com.kbsp.repositories.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import java.math.BigInteger;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by jhirshowitz on 6/24/2016.
 */
public class ShipwreckControllerTest {
    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository sr;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void GetShipwreckById(){
        Shipwreck sw = new Shipwreck();
        sw.setId(BigInteger.valueOf(1));
        when(sc.get(1L)).thenReturn(sw);

        Shipwreck  newWreck = sc.get(1L);

        verify(sr).findById(1L);
        assertEquals( newWreck.getId(), (Long) 1L);
        assertThat(newWreck.getId(), is(1l));
    }
}
