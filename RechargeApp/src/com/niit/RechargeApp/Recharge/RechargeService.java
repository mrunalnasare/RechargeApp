package com.niit.RechargeApp.Recharge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class RechargeService {
    @Autowired RechargeRepository repo;
     
    public void save(Recharge recharge) {
        repo.save(recharge);
    }
     
    public List<Recharge> listAll() {
        return (List<Recharge>) repo.findAll();
    }
     
    public int get(int price) {
       return (int) repo.findByPrice(price);
		  }
     
    public void delete(int price) {
        repo.deleteByPrice(price);
    }
     
}