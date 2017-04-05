package lebin.sample.eureka.client2;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookApplication
 * TODO
 * 
 * @author   Liebin.Zheng 
 * @Date	 2017年3月16日
 */
@RestController
@SpringBootApplication
public class BookApplication {
	
	  @RequestMapping(value = "/hello")
	  public String available() {
	    return "Spring in Action";
	  }

	  @RequestMapping(value = "/showtime")
	  public String checkedOut() {
	    return "Spring Boot in Action." + new Date();
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(BookApplication.class, args);
	  }

}

