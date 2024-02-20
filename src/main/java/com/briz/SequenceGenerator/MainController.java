package com.briz.SequenceGenerator;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	MainRepository mrepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return" program testet....";
	}
	@RequestMapping("/save")
	public String save()
	{
		Main p=new Main();
		p.setProductname("T-shirt");
		p.setPrice("2000");
		mrepo.save(p);
		return"data saved";
	}
	@RequestMapping("/saveall")
	public String saveall()
	{
		Main p1=new Main();
		p1.setProductname("Jeans");
		p1.setPrice("2500");
		
		Main p2=new Main();
		p2.setProductname("Frock");
		p2.setPrice("3700");
		
		Main p3=new Main();
		p3.setProductname("Utensils");
		p3.setPrice("4570");
		
		Main p4=new Main();
		p4.setProductname("Shoes");
		p4.setPrice("1250");
		
		Main p5=new Main();
		p5.setProductname("Frame");
		p5.setPrice("1570");
		
		Main p6=new Main();
		p6.setProductname("Shirt");
		p6.setPrice("2700");
		
		List<Main>list=Arrays.asList(p1,p2,p3,p4,p5,p6);
		mrepo.saveAll(list);
		return"multiples data saved";
	}
	
	@RequestMapping("/all")
	public  List<Main> all()
	{
		return mrepo.findAll();
	}

}
