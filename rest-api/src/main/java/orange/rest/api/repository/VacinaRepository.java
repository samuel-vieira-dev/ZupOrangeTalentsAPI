package orange.rest.api.repository;

import orange.rest.api.model.VacinaModel;
import org.springframework.data.repository.CrudRepository;

public interface VacinaRepository extends CrudRepository<VacinaModel, Long> {
}
