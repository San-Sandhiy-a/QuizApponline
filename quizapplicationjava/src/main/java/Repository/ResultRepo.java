package Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Result;


@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}