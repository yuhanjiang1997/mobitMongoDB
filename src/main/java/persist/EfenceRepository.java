package persist;


import mode.lock.Efence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EfenceRepository extends MongoRepository<Efence, String> {
}
