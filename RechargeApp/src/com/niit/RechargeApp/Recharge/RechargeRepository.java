package com.niit.RechargeApp.Recharge;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RechargeRepository extends CrudRepository<Recharge, Long> {
    
	@Query(value = "SELECT c FROM RechargePlan c WHERE c.price LIKE '%' || :keyword || '%'"
            + " OR c.details LIKE '%' || :keyword || '%'"
            + " OR c.validity LIKE '%' || :keyword || '%'")
    public List<Recharge> search(@Param("keyword") String keyword);

	public void deleteByPrice(int price);

	public Object findByPrice(int price);

	
}
