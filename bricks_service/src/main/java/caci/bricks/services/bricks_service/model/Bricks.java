package caci.bricks.services.bricks_service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Bricks {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
   
	private Long order_id;
    private int noOfBricks = 0;
    private String orderStatus;


	public Bricks() {
    } 
    
    public Bricks(Long order_id,  int noOfBricks, String orderStatus) {
        this.order_id = order_id;
        this.noOfBricks = noOfBricks;
        this.orderStatus = orderStatus;
    }

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public int getNoOfBricks() {
		return noOfBricks;
	}

	public void setNoOfBricks(int noOfBricks) {
		this.noOfBricks = noOfBricks;
	}
    public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
    
    
    
}
