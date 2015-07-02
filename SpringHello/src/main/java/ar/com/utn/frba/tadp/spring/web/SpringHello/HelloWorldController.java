package ar.com.utn.frba.tadp.spring.web.SpringHello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	private String message;
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("welcomePage", "welcomeMessage", message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
