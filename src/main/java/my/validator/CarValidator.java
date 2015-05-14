package my.validator;

import my.entity.Car;
import my.parser.ParserResults;

public class CarValidator implements Validator<Car> {

	public ValidatorResults<Car> validate(ParserResults<Car> parserResults) {
		return new ValidatorResults<Car>();
	}

}
