package order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView indexPage() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public ModelAndView indexPageRedirect() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping(value="/index_succes_order", method = RequestMethod.GET)
	public ModelAndView indexPageSuccessOrder() {
		ModelAndView modelAndView = new ModelAndView("Index");
		
		Boolean has_error = false;
		
		modelAndView.addObject("has_error", has_error);
		
		return modelAndView;
	}
}