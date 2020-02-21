package com.kbsp.controllers;

import com.kbsp.models.Shipwreck;
import com.kbsp.repositories.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by jhirshowitz on 6/9/2016.
 */
@RestController
@RequestMapping("/api/v1/")
public class ShipwreckController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;
    @RequestMapping(value="shipwrecks", method= {RequestMethod.GET})
    public List<Shipwreck> list(){
        return shipwreckRepository.findAll();
    }

    @RequestMapping(value="shipwrecks/{id}", method= {RequestMethod.GET})
    public Shipwreck get(@PathVariable Long id){
    	Optional<Shipwreck> optionalShipwreck = shipwreckRepository.findById(id);
    	return optionalShipwreck.get();
    }

    @RequestMapping(value="shipwrecks", method= {RequestMethod.POST})
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value="shipwrecks/{id}", method= {RequestMethod.PUT})
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        Optional<Shipwreck> optionalShipwreck = shipwreckRepository.findById(id);
        optionalShipwreck.ifPresent(existingShipwreck -> {  
        	BeanUtils.copyProperties(shipwreck,existingShipwreck);
        	shipwreckRepository.saveAndFlush(existingShipwreck);         	
        });
        return optionalShipwreck.get();
    }

    @RequestMapping(value="shipwrecks/{id}", method= {RequestMethod.DELETE})
    public Shipwreck delete(@PathVariable Long id){
        Optional<Shipwreck> optionalShipwreck = shipwreckRepository.findById(id);
        optionalShipwreck.ifPresent(shipwreck -> shipwreckRepository.delete(shipwreck));
        
        return optionalShipwreck.get();
    }

}
