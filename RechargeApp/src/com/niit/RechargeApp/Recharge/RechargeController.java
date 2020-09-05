package com.niit.RechargeApp.Recharge;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class RechargeController {

	@Autowired
    private RechargeService rechargeService;
	
	//List of Recharge Plans
	@RequestMapping("/")
	public ModelAndView home() {
	    List<Recharge> listRecharge = rechargeService.listAll();
	    ModelAndView mav = new ModelAndView("index");
		mav.addObject("listRecharge", listRecharge);
	    return mav;
	}
	
	//Create New Recharge Plan
	@RequestMapping("/new")
	public String newRechargeForm(Map<String, Object> model) {
		Recharge recharge = new Recharge();
	    model.put("recharge", recharge);
	    return "new_recharge";
	}
	
	//Edit Recharge Plan
	@RequestMapping("/edit")
	public ModelAndView editRechargeForm(@RequestParam int price) {
	    ModelAndView mav = new ModelAndView("edit_recharge");
	    int recharge = rechargeService.get(price);
	    mav.addObject("recharge", recharge);
	 
	    return mav;
	}
	
	//Delete Recharge Plan
	@RequestMapping("/delete")
	public String deleteRechargeForm(@RequestParam int price) {
	    rechargeService.delete(price);
	    return "redirect:/";       
	}
	
}

