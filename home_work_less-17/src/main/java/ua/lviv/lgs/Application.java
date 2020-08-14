package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);
		
		Univercity univercity = new Univercity();
		univercity.setName("myName");
		univercity.setLevelOfAccreditation(2);
		univercity.setNumbersOfInstitutes(12);
		univercity.setAmountOfStudents(1500);
		univercity.setUnivercityAddress("Lviv");
		
//		service.save(univercity);
		
		System.out.println(service.findById((long) 6));
		System.out.println(service.findByName("myName"));
		
		Univercity upd = service.findById((long) 6);
		upd.setName("updatedName");
		service.save(upd);
		
		service.findAll().stream().forEach(System.out::println);
		
		service.deleteById((long) 6);
	}
}
