package main.java;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@lombok.Data 

public class ParentalControlService {
	
	public String getParentalControlLevel(String movieId, String controlPref) {
		final String uri = "https://iftn5sj4k9.execute-api.us-east-1.amazonaws.com/default/getMovieParentalControlLevel?movieId="+movieId;
	    RestTemplate restTemplate = new RestTemplate();
	    try {
	    	String result = restTemplate.getForObject(uri, String.class);
	    	System.out.println(result);
	    	return result;
    	}
    	catch(org.springframework.web.client.HttpClientErrorException.NotFound e) {
    		System.out.println( e.getClass().getCanonicalName());
    		return "The movie service could not find the given movie";
    	}
	    catch(org.springframework.web.client.HttpServerErrorException.BadGateway e) {
	    	return "System Error";
	    }
	}
	
	
}
