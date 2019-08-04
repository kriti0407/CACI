package caci.bricks.services.bricks_service.application;

import caci.bricks.services.bricks_service.model.Bricks;
import caci.bricks.services.bricks_service.persistence.BrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

@Service
public class BrickService {
	
	
	@Autowired
    private BrickRepository brickRepository;

    public List getAllBricks() {
        List bricks = new ArrayList<>();
        brickRepository.findAll().forEach(bricks::add);
        return bricks;
    }

    public Bricks getBricks(Long id) {
        return brickRepository.findById(id).orElseGet(Bricks::new);
    }

    public void addBricks(Bricks caci) {
        brickRepository.save(caci);
        
    }

    public void updateBrick(Long id, Bricks caci)  {
    	
       
        List bricks = new ArrayList<>();
        brickRepository.findAll().forEach(bricks::add);
        for(int i=0;i<bricks.size();i++) {
           Bricks b  = (Bricks) bricks.get(i);
           if((b.getOrder_id().equals(id)) && !(b.getOrderStatus().equals("dispatched")) ){
        	   brickRepository.save(caci);
           }
           
      
        }
       
    }

}
