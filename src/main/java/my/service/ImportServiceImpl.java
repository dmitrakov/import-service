package my.service;

import my.parser.Parser;
import my.parser.ParserResults;
import my.repo.Repository;
import my.validator.Validator;
import my.validator.ValidatorResults;

public class ImportServiceImpl<T> implements ImportService<T> {

	private Parser<T> parser;
	private Validator<T> validator;
	private Repository<T> repository;

	public ImportResults<T> importData() {
		ParserResults<T> parserResults = parser.parse();
		
		ValidatorResults<T> validatorResults = validator
				.validate(parserResults);
		
		if (ValidatorResults.STATUS_OK)
			repository.save(parserResults.getParsedEntities());
		
		return new ImportResults<T>(parserResults, validatorResults);
	}

	public void setParser(Parser<T> parser) {
		this.parser = parser;
	}

	public void setValidator(Validator<T> validator) {
		this.validator = validator;
	}

	public void setRepository(Repository<T> repository) {
		this.repository = repository;
	}

}
