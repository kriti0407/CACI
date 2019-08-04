package caci.bricks.services.bricks_service.persistence;

import caci.bricks.services.bricks_service.model.Bricks;
import caci.bricks.services.bricks_service.persistence.BrickRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)

public class BrickRepositoryTest {

	   @Autowired
	   private TestEntityManager entityManager;
	   
	   @Autowired
	   private BrickRepository brickRepository;
	   
	   
	   @Test
	   public void whenFindAll() {
	       //given
	       Bricks bricks = new Bricks();
	       bricks.setNoOfBricks(10);
	       entityManager.persist(bricks);
	       entityManager.flush();
	       Bricks bricks2 = new Bricks();
	       bricks2.setNoOfBricks(20);
	       entityManager.persist(bricks2);
	       entityManager.flush();
	       //when
	       List<Bricks> brick = (List<Bricks>) brickRepository.findAll();
	       //then
	       assertThat(brick.size()).isEqualTo(5);
	       assertThat(brick.get(3)).isEqualTo(bricks);
	      
	   }
	   @Test
	   public void whenFindAllById() {
	       //given
		   Bricks bricks = new Bricks();
		   bricks.setNoOfBricks(30);
	       entityManager.persist(bricks);
	       entityManager.flush();  
	       //when
	       Object testBricks = brickRepository.findById(bricks.getOrder_id());
	       //then
	       assertThat(((Bricks) testBricks).getNoOfBricks()).isEqualTo(bricks.getNoOfBricks());
	   }
}
