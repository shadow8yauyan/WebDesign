package repository;

import model.Testing;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by SOWY on 9/1/2016.
 */
public interface TestingRepository extends CrudRepository<Testing,String> {
    List<Testing> findAllBy();
}
