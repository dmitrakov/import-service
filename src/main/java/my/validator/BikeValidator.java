package my.validator;

import my.entity.Bike;
import my.parser.ParserResults;

public class BikeValidator implements Validator<Bike>{

	public ValidatorResults<Bike> validate(ParserResults<Bike> parserResults) {
		return new ValidatorResults<Bike>();
	}

}
