package persist;


import mode.lock.MobitLock;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Copyright Mobit Belgium bvba
 * @Author: Jiubo.Jiang
 * @Date: 19/06/2017
 * @Description:
 */
public interface MobitLockRepository extends MongoRepository<MobitLock, String> {


}
