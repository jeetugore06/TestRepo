package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.MyRepository;
import study.entity.entity;

@RestController
public class StudentController {

	@Autowired
	MyRepository repo;
	
	@PostMapping("/bfhl")
	public entity returnInfo(@RequestParam String[]data) {

		entity ent=new entity();

		int numcount=0;
		int alphcount=0;
		for (int i = 0; i < data.length; i++) {
			if(isNumeric(data[i])) {
				numcount++;
			}
			else {
				alphcount++;
			}
		}

		String []alph=ent.getAlphabets();
		alph=new String[alphcount];

		int numb[]=ent.getNumbers();
		numb=new int[numcount];

		int a=0;int k=0;
		for (int i = 0; i < data.length; i++) {
			if(isNumeric(data[i])) {
				numb[a++]=Integer.parseInt(data[i]);
			}
			else {
				alph[k++]=data[i];
			}
		}

		ent.setStatus(true);
		ent.setAlphabets(alph);
		ent.setNumbers(numb);
		ent.setEmail("john@xyx.com");
		ent.setUser_id("john_doe_17091999");
		ent.setRoll_number("ABCD123");

		return ent;	
	}


	public static boolean isNumeric(String str) { 
		try {  
			Integer.parseInt(str);  
			return true;
		} catch(NumberFormatException e){  
			return false;  
		}  
	}
}

