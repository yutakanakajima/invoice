package jp.dip.invoiceapp.app.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.dip.invoiceapp.app.entity.InvoiceTbl;
import jp.dip.invoiceapp.app.param.InvoiceEntryForm;
import jp.dip.invoiceapp.app.repository.InvoiceRepository;

@Controller
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get(Model model) {
		model.addAttribute("message", "Hello!");
		return "InvoiceTop";
	}

	@RequestMapping(value = "/invoiceSearch", method = RequestMethod.GET)
	public String getSearch(Model model) {
		return "InvoiceSearch";
	}

	@RequestMapping(value = "/invoiceEntry", method = RequestMethod.GET)
	public String getEntry(Model model) {
		return "InvoiceEntry";
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.GET)
	public String select(@RequestParam("InvoiceNo") Integer invoiceNo, Model model) {
		List<InvoiceTbl> list = new ArrayList<InvoiceTbl>();
		System.out.println("URL:invoice,GET");
		if ((null == invoiceNo) || (0 == invoiceNo)) {
			System.out.println("URL:invoice,GET,ALL");
			list = invoiceRepository.findAll();
		} else {
			System.out.println("URL:invoice,GET,Once:" + invoiceNo);
			InvoiceTbl invoiceTbl = invoiceRepository.findByInvoiceNo(invoiceNo.intValue());
			list.add(invoiceTbl);
		}
		model.addAttribute("resultList", list);
		return "InvoiceSearch";
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.POST)
	String post(@ModelAttribute InvoiceEntryForm invoiceEntryRequest, Model model) {
		List<InvoiceTbl> list = invoiceRepository.findAll();
		int id = 20000;
		for (InvoiceTbl invoice : list) {
			if (id < invoice.getInvoiceNo()) {
				id = invoice.getInvoiceNo();
			}
		}
		id++;
		Date date = new Date();
		InvoiceTbl invoiceTbl = new InvoiceTbl();
		invoiceTbl.setInvoiceNo(id);
		invoiceTbl.setClientNo(1);
		invoiceTbl.setInvoiceStatus("10");
		invoiceTbl.setInvoiceCreateDate(date);
		invoiceTbl.setInvoiceTitle(invoiceEntryRequest.getInvoiceTitle());
		invoiceTbl.setInvoiceAmt(200);
		invoiceTbl.setTaxAmt(16);
		invoiceTbl.setInvoiceStartDate(new Date(invoiceEntryRequest.getInvoiceStartDate()));
		invoiceTbl.setInvoiceEndDate(new Date(invoiceEntryRequest.getInvoiceEndDate()));
		invoiceTbl.setInvoiceNote(invoiceEntryRequest.getInvoiceNote());
		invoiceTbl.setCreateUser(invoiceEntryRequest.getUserId());
		invoiceTbl.setCreateDatetime(date);
		invoiceTbl.setUpdateUser(invoiceEntryRequest.getUserId());
		invoiceTbl.setUpdateDatetime(date);
		invoiceTbl.setDelFlg("0");
		invoiceRepository.save(invoiceTbl);
		
		model.addAttribute("message", "Get InvoiceNo : " + id);
		return "InvoiceEntry";
	}

}
