package jp.dip.invoiceapp.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.dip.invoiceapp.app.InvoiceSearchData;
import jp.dip.invoiceapp.app.dao.InvoiceDao;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	private InvoiceDao invoiceDao;
	
	@RequestMapping(method = RequestMethod.GET)
	String get(@ModelAttribute("InvoiceSearchData") @Valid InvoiceSearchData invoiceSearchData, BindingResult result, Model model) {
		if (result.hasErrors()) {
	        model.addAttribute("message", "Error!");
	    } else {
	    	model.addAttribute("InvoiceResult", invoiceDao.findAll());
	    }
		return "InvoiceSearch";
	}

	@RequestMapping(method = RequestMethod.POST)
	String post(@ModelAttribute InvoiceSearchData invoiceSearchData, Model model) {
		Integer invoiceNo = invoiceSearchData.getInvoiceNo();
		model.addAttribute("InvoiceNo", "InvoiceNo:" + invoiceNo);
		return "InvoiceSearch";
	}
}
