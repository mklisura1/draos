package order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import order.wrapper.OrderCartWrapper;

@Controller
public class OrderController {
	
	@RequestMapping(value="/order", method = RequestMethod.GET)
	public ModelAndView orderPage(@ModelAttribute("orderCartWrapper") OrderCartWrapper orderCartWrapper, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("Order");
		
		modelAndView.addObject("orderCartWrapper", orderCartWrapper);
		return modelAndView;
	}
	
	@RequestMapping(value="/order", method = RequestMethod.POST)
	public ModelAndView orderPage(@Valid @ModelAttribute("orderCartWrapper") OrderCartWrapper orderCartWrapper, BindingResult result, HttpServletRequest request) {
		
		if(result.hasErrors())
		{
			Boolean has_error = true;
			ModelAndView modelAndView = new ModelAndView("Order");
			
			modelAndView.addObject("orderCartWrapper", orderCartWrapper);
			modelAndView.addObject("has_error", has_error);
			return modelAndView;
		}
		
		return new ModelAndView("redirect:/index_succes_order");
	}

}
