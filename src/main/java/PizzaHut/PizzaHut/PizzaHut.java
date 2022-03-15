package PizzaHut.PizzaHut;

import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class PizzaHut {

	public static void main(String[] args) {
		SpringApplication.run(PizzaHut.class, args);
//		SpringApplication spr=new SpringApplication(PizzaHut.class); //2nd way 
//		System.out.println("Enter port no "); 
//		Scanner scan=new Scanner(System.in);
//		int port=scan.nextInt();//User will type the port no. For ex: 9060
//		HashMap portconf=new HashMap(); portconf.put("server.port", port);
//		spr.setDefaultProperties(portconf);
//		spr.run(args);
	}

}
