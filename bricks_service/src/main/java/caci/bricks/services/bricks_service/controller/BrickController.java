package caci.bricks.services.bricks_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import caci.bricks.services.bricks_service.model.Bricks;
import caci.bricks.services.bricks_service.application.BrickService;
import caci.bricks.services.bricks_service.exceptions.ApiException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class BrickController {
	
    @Autowired
    private BrickService brickService;

	@GetMapping("/bricks")
    public List getAllBricks() {
        return brickService.getAllBricks();
    }

    @GetMapping("/bricks/{orderId}")
    public Bricks getBrick(@PathVariable Long orderId){
        return brickService.getBricks(orderId);
    }

    @PostMapping("/bricks")
    public void addOrder(@RequestBody Bricks bricks) {
    	brickService.addBricks(bricks);
    }

    @PutMapping("/bricks/{orderId}") 
    public void updateBrick(@PathVariable Long orderId, @RequestBody Bricks bricks) throws ApiException {
    	brickService.updateBrick(orderId, bricks);
    }
}
