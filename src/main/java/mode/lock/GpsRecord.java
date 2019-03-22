package mode.lock;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * @Copyright Mobit Belgium bvba
 * @Author: Jiubo.Jiang
 * @Date: 14/06/2017
 * @Description:
 */
@Document(collection = "GpsRecord")
public class GpsRecord implements Comparable<GpsRecord>{
    @Id
    private String _id;
    private String lockId;
    private Integer signalStrength;
    private Double voltagePercentage;
    private Double voltage;
    private String versionNumber;
    private Date creationDate;
    private GeoJsonPoint geoPoint;
    /**
     * 0 Lock
     * 1 Mobile phone
     */
    private Integer source;

    /**
     * Riding order unique number
     */
    private String rideUuid;
    /**
     * 0 Open
     * 1 Close
     */
    private Integer lockStatus;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public Double getVoltagePercentage() {
        return voltagePercentage;
    }

    public void setVoltagePercentage(Double voltagePercentage) {
        this.voltagePercentage = voltagePercentage;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getRideUuid() {
        return rideUuid;
    }

    public void setRideUuid(String rideUuid) {
        this.rideUuid = rideUuid;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getSignalStrength() {
        return signalStrength;
    }

    @Override
    public int compareTo(GpsRecord o) {
        try {
            Long value=o.getCreationDate().getTime()-this.getCreationDate().getTime();
            if(value>0){
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    public GeoJsonPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoJsonPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    @Override
    public boolean equals(Object obj) {
        GpsRecord gpsRecord = (GpsRecord) obj;
        try {
            return gpsRecord.getGeoPoint().getX()==this.getGeoPoint().getX() && gpsRecord.getGeoPoint().getY()==this.getGeoPoint().getY();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }


    public void setSignalStrength(Integer signalStrength) {
        this.signalStrength = signalStrength;
    }
}
