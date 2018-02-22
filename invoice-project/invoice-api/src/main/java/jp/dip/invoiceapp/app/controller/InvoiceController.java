package jp.dip.invoiceapp.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.dip.invoiceapp.app.param.InvoiceSearchRequest;
import jp.dip.invoiceapp.app.repository.InvoiceRepository;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	String get(@ModelAttribute("InvoiceSearchData") @Valid InvoiceSearchRequest invoiceSearchRequest, BindingResult result, Model model) {
		if (result.hasErrors()) {
	        model.addAttribute("message", "Error!");
	    } else {
	    	model.addAttribute("InvoiceResult", invoiceRepository.findAll());
	    }
		return "InvoiceSearch";
	}

	@RequestMapping(method = RequestMethod.POST)
	String post(@ModelAttribute InvoiceSearchRequest invoiceSearchRequest, Model model) {
		Integer invoiceNo = invoiceSearchRequest.getInvoiceNo();
		model.addAttribute("InvoiceNo", "InvoiceNo:" + invoiceNo);
		return "InvoiceSearch";
	}

}
