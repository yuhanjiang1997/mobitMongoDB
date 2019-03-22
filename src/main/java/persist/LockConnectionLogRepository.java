package persist;


import mode.lock.LockConnectionLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LockConnectionLogRepository extends MongoRepository<LockConnectionLog, String> {
}
