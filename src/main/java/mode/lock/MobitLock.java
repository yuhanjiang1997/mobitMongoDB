package mode.lock;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Copyright Mobit Belgium bvba
 * @Author: Jiubo.Jiang
 * @Date: 19/06/2017
 * @Description:
 */
@Document(collection = "MobitLock")
public class MobitLock implements Serializable {
    private static final long serialVersionUID = -287275468466244021L;
    @Id
    private String _id;
    private String lockId;
    /**
     * The bike id
     */
    private String bikeId;
    private String frontCode;
    private String backCode;

    private String simCardIccid;

    private String bleMac;
    private String bleKey;
    private String blePassword;

    private Integer launchedCityId;
    /**
     * Manufacturer abbreviation
     */
    private String mobitLockType;


    private String signalStrength;
    private Double voltagePercentage;
    private Double voltage;
    private String versionNumber;


    /**
     * 0 Offline
     * 1 Online
     */

    private Integer connectionStatus;

    /**
     * 0 Open
     * 1 Close
     */
    private Integer lockStatus;


    private GeoJsonPoint geoPoint;

    private List<String> linkedGroup;

    private Integer bonusBikeId;

    /**
     * 0 False
     * 1 True
     */
    private Integer showOnApp;

    private String icon;

    private Integer isDeleted;

    /**
     * 1 Defect bike
     * 0 or null Normal bicycle
     */
    private Integer isDefect;

    /**
     * Ride isEnded
     * o normal
     * 1 The user has a reservation but has not started riding.
     * 2 paused
     * 3 in riding
     */
    private Integer rideStatus;


    /**
     * 0 False
     * 1 True
     */
    private Integer isLost;

    private Date creationDate;
    private Date offlineDate;
    private Date lastUpdatedDate;
    private Date lastLockedTime;

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

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public String getFrontCode() {
        return frontCode;
    }

    public void setFrontCode(String frontCode) {
        this.frontCode = frontCode;
    }

    public String getBackCode() {
        return backCode;
    }

    public void setBackCode(String backCode) {
        this.backCode = backCode;
    }

    public String getSimCardIccid() {
        return simCardIccid;
    }

    public void setSimCardIccid(String simCardIccid) {
        this.simCardIccid = simCardIccid;
    }

    public String getBleMac() {
        return bleMac;
    }

    public void setBleMac(String bleMac) {
        this.bleMac = bleMac;
    }

    public String getBleKey() {
        return bleKey;
    }

    public void setBleKey(String bleKey) {
        this.bleKey = bleKey;
    }

    public String getBlePassword() {
        return blePassword;
    }

    public void setBlePassword(String blePassword) {
        this.blePassword = blePassword;
    }

    public Integer getLaunchedCityId() {
        return launchedCityId;
    }

    public void setLaunchedCityId(Integer launchedCityId) {
        this.launchedCityId = launchedCityId;
    }

    public String getMobitLockType() {
        return mobitLockType;
    }

    public void setMobitLockType(String mobitLockType) {
        this.mobitLockType = mobitLockType;
    }

    public String getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(String signalStrength) {
        this.signalStrength = signalStrength;
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

    public Integer getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(Integer connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public GeoJsonPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoJsonPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public List<String> getLinkedGroup() {
        return linkedGroup;
    }

    public void setLinkedGroup(List<String> linkedGroup) {
        this.linkedGroup = linkedGroup;
    }

    public Integer getBonusBikeId() {
        return bonusBikeId;
    }

    public void setBonusBikeId(Integer bonusBikeId) {
        this.bonusBikeId = bonusBikeId;
    }

    public Integer getShowOnApp() {
        return showOnApp;
    }

    public void setShowOnApp(Integer showOnApp) {
        this.showOnApp = showOnApp;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsDefect() {
        return isDefect;
    }

    public void setIsDefect(Integer isDefect) {
        this.isDefect = isDefect;
    }

    public Integer getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(Integer rideStatus) {
        this.rideStatus = rideStatus;
    }

    public Integer getIsLost() {
        return isLost;
    }

    public void setIsLost(Integer isLost) {
        this.isLost = isLost;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getOfflineDate() {
        return offlineDate;
    }

    public void setOfflineDate(Date offlineDate) {
        this.offlineDate = offlineDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getLastLockedTime() {
        return lastLockedTime;
    }

    public void setLastLockedTime(Date lastLockedTime) {
        this.lastLockedTime = lastLockedTime;
    }

    @Override
    public String toString() {
        return "MobitLock{" +
                "lockId='" + lockId + '\'' +
                ", frontCode='" + frontCode + '\'' +
                ", backCode='" + backCode + '\'' +
                ", simCardIccid='" + simCardIccid + '\'' +
                ", bleMac='" + bleMac + '\'' +
                ", bleKey='" + bleKey + '\'' +
                ", voltage=" + voltage +
                '}';
    }
}
