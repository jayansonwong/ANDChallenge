package main.java;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import main.java.ParentalControlService;

@RestController
public class PCSController {
 
  private ParentalControlService pcs = new ParentalControlService();
  
  @RequestMapping("/grantAccess/{movieId}/{controlPref}")
  public String access(@PathVariable String movieId, @PathVariable String controlPref) {
	  //return pcs.getParentalControlLevel(movieId, controlPref);
	  return pcs.getParentalControlLevel(movieId, controlPref);
//	  return true;
  }
}
