
package lebin.sample.zuul.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * GatewayApplication
 * TODO
 * 
 * @author   Liebin.Zheng 
 * @Date	 2017年3月16日
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}

