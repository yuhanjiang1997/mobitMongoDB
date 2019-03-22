package mode.lock;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Copyright Mobit Belgium bvba
 * @Author: Jiubo.Jiang
 * @Date: 19/06/2017
 * @Description:
 */
@Document(collection = "LockConnectionLog")
public class LockConnectionLog {
    @Id
    private String _id;
    private String lockId;
    private Date creationDate;
    /**
     * 0 Offline
     * 1 Online
     */
    private Integer type;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
