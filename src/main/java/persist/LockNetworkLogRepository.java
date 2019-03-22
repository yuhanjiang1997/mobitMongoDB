package persist;


import mode.mongodb.LockNetworkLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LockNetworkLogRepository extends MongoRepository<LockNetworkLog, String> {
}
