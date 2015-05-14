package my.validator;

import my.parser.ParserResults;

public interface Validator<T> {
	
	public ValidatorResults<T> validate(ParserResults<T> parserResults);
	
}
