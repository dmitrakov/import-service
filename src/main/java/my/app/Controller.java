package my.app;

import my.entity.Bike;
import my.entity.Car;
import my.service.ImportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller {
		
	@Autowired
	@Qualifier("carImportService")
	private ImportService<Car> carService;
	
	@Autowired
	@Qualifier("bikeImportService")
	private ImportService<Bike> bikeService;
	
	public void doImport () {
		System.out.println("Car Service: " + carService.importData());
		System.out.println("Bike Service: " + bikeService.importData());
	}
	
}
