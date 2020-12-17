package springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld-form";
	}
	// need a controller method to process the form
	@RequestMapping("/processForm")
    public String processForm() {
    	
    	return "helloworld";
    	
    }
	
	// need a controller method to read form data.
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//Read the request form from the HTTML form
		String theName = request.getParameter("membername");
		
		//Convert data to upper
		theName= theName.toUpperCase();
		
		//create message
	String result = "Yo!" +theName;
		// add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersion3(@RequestParam("membername") String theName, Model model) {
		 
		 
		
		//Convert data to upper
		theName= theName.toUpperCase();
		
		//create message
	String result = "Hey My Friend from V3!  " +theName;
		// add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	
	
	
	
	
	
	}
	
	
}
