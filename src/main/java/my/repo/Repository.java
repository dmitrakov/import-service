package my.repo;

import java.util.List;

public interface Repository<T> {
	
	public void save(List<T> entities);
	
}
