package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.ContactInfo;
import dmacc.beans.Worker;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.WorkerRepository;

@SpringBootApplication
public class SpringWorkersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringWorkersApplication.class, args);
	}
	
	@Autowired
	WorkerRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Worker beny = appContext.getBean("worker", Worker.class);
		beny.setSupervisor("Bigger Beany");
		repo.save(beny);
		
		Worker worker = new Worker("Susan", "Accounting", "Accountant", "Biggest Beany");
		ContactInfo info = new ContactInfo("1234 Main Street, Des Moines, IA", "555-555-5555", "Mr Susan", "565-555-5555");
		worker.setContactInfo(info);
		repo.save(worker);
		
		List<Worker> allWorkers = repo.findAll();
		for(Worker w : allWorkers) {
			System.out.println(w.toString());
		}
		((AbstractApplicationContext) appContext).close();
	} 

}
