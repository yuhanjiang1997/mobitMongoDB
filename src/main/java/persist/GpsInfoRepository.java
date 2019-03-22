package persist;


import mode.mongodb.GpsInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by cnjia on 2017-06-14.
 */
public interface GpsInfoRepository extends MongoRepository<GpsInfo, String> {

}
