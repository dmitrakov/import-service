package my.app;

import my.entity.Bike;
import my.entity.Car;
import my.parser.JxlsParser;
import my.repo.BikeRepository;
import my.repo.CarRepository;
import my.service.ImportService;
import my.service.ImportServiceImpl;
import my.validator.BikeValidator;
import my.validator.CarValidator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "my")
public class AppConfig {

	@Bean
	public Controller controller() {
		return new Controller();
	}
	
	@Bean
	public ImportService<Car> carImportService() {
		ImportServiceImpl<Car> carImportService = new ImportServiceImpl<Car>();
		carImportService.setParser(new JxlsParser<Car>());
		carImportService.setValidator(new CarValidator());
		carImportService.setRepository(new CarRepository());
		
		return carImportService;
	}
	
	@Bean
	public ImportService<Bike> bikeImportService() {
		ImportServiceImpl<Bike> bikeImportService = new ImportServiceImpl<Bike>();
		bikeImportService.setParser(new JxlsParser<Bike>());
		bikeImportService.setValidator(new BikeValidator());
		bikeImportService.setRepository(new BikeRepository());
		
		return bikeImportService;
	}
}
