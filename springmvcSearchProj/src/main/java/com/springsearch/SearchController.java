package com.springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home()
	{

		return "home";
	}


	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query") String data)
	{
		if(data.isEmpty())
		{
			RedirectView v= new RedirectView();
			v.setUrl("home");	
			return v;
		}


		String url="https://www.google.com/search?q="+data;
		RedirectView v= new RedirectView();
		v.setUrl(url);		
		return v;


	}


}
