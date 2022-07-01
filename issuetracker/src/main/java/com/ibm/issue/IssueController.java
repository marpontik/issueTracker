package com.ibm.issue;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;




@Controller
@SessionAttributes("name") 
public class IssueController {

	@Autowired
	private IssueService service;
	
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}

	@RequestMapping(value = "/list-issues", method = RequestMethod.GET)
	public String listIssues(ModelMap model) {
		model.addAttribute("issues", service.retrieveIssues("maria"));
		return "list-issues";
	}
	
	@RequestMapping(value = "/add-issue", method = RequestMethod.GET)
	public String showIssuePage(ModelMap model) {
		model.addAttribute("issue", new Issue());
		return "issue";
	}
	
	
	@RequestMapping(value = "/add-issue", method = RequestMethod.POST)
	public String addIssue(ModelMap model, @Valid Issue issue, BindingResult result) {
		
		
		if (result.hasErrors())
			return "issue";

		service.addIssue((String) model.get("name"), issue.getTitle(), issue.getDesc(), issue.getTargetDate(),
				false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-issues";
	}
	
	
	@RequestMapping(value = "/update-issue", method = RequestMethod.GET)
	public String showIssuePage(ModelMap model, @RequestParam int id) {
		model.addAttribute("issue", service.retrieveIssue(id));
		
		return "issue";
	}
	
	@RequestMapping(value = "/update-issue", method = RequestMethod.POST)
	public String updateIssue(ModelMap model, @Valid Issue issue,
			BindingResult result) {
		if (result.hasErrors())
			return "issue";

		issue.setUser("maria"); 
		service.updateIssue(issue);
		model.clear();
		return "redirect:/list-issues";
	}
			
			
  
		@RequestMapping(value = "/delete-issue", method = RequestMethod.GET)
		public String deleteIssue(ModelMap model,@RequestParam int id) {
			service.deleteIssue(id);
	        model.clear();
			return "redirect:/list-issues";
}
} 