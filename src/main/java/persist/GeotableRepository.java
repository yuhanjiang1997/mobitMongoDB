package persist;

import mode.mongodb.Geotable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GeotableRepository extends MongoRepository<Geotable,String> {
}
