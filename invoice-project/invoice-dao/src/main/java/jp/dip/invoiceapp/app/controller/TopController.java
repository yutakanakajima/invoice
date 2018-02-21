package jp.dip.invoiceapp.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String get(Model model) {
		model.addAttribute("message", "Hello!");
		return "InvoiceTop";
	}

	@RequestMapping(value = "/invoiceSearch", method = RequestMethod.GET)
	String getSearch(Model model) {
		model.addAttribute("message", "Hello1!");
		return "InvoiceSearch";
	}

	@RequestMapping(value = "/invoiceEntry", method = RequestMethod.GET)
	String getEntry(Model model) {
		model.addAttribute("message", "Hello1!");
		return "InvoiceEntry";
	}
}
