package com.infinite.web;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.infinite.hibernate.dimpl.Cartimpl;
import com.infinite.hibernate.dimpl.Cartimpl;
import com.infinite.hibernate.pojo.Cart;
/**
 * @author jahnavibo
 *
 */
@Controller
public class InsertController {
	private static final Logger logger = Logger.getLogger(InsertController.class);
	private ApplicationContext con;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("bean") Cart p,Model m){
		con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Cartimpl obj=con.getBean("dao",Cartimpl.class);
		obj.saveData(p);
		String Name=p.getName();
		float Amount=p.getAmount();
		int Quantity=p.getQuantity();
		float Totalprice=p.getTotalprice() ;
		m.addAttribute("msg",Name); 
		logger.info("inserted");
		return "inserted";	
	}
}


