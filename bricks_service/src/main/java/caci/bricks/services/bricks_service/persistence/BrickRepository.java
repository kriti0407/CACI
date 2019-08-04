package caci.bricks.services.bricks_service.persistence;

import caci.bricks.services.bricks_service.model.Bricks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrickRepository extends CrudRepository <Bricks,Long>{

}
