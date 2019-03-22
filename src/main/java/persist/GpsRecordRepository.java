package persist;


import mode.lock.GpsRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Copyright Mobit Belgium bvba
 * @Author: Jiubo.Jiang
 * @Date: 14/06/2017
 * @Description:
 */
public interface GpsRecordRepository extends MongoRepository<GpsRecord, String> {

}
