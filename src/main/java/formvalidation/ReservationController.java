package formvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/reservation")
@Controller
public class ReservationController {
	@RequestMapping("/bookForm")
	public String bookForm(Model model)
	{
		Reservation res=new Reservation();
		model.addAttribute("reservation",res);
		
		return "reservation-page";
		
	}
	@RequestMapping("/submitform")
	public String submitform(@ModelAttribute("reservation") Reservation res)
	{
		return "confirmation-form";
		
	}

}
