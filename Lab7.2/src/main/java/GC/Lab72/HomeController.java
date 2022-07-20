package GC.Lab72;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	@RequestMapping("/results")
	public String results(@RequestParam String city, Model model) {
		List<Hotel> hotels = repo.findByCity(city);
		model.addAttribute("hotels", hotels);
		model.addAttribute("city", city);
		
		return "results";
	}
}
