package persist;

//import com.magic.mobit.repository.mongodb.custom.DevStatusRepositoryCustom;

import mode.mongodb.DevStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by cnjia on 2017-06-19.
 */
public interface DevStatusRepository extends MongoRepository<DevStatus, String> {



}
