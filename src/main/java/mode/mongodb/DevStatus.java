package mode.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by cnjia on 2017-06-19.
 */
@Document(collection = "dev_status")

public class DevStatus {
    @Id
    private String _id;
    private String imsi;
    private Double lat;
    private Double lon;
    private String speed;
    private String rssi;
    //v1 百分比 v2电压 v3充电电压
    private Double v1;
    private Double v2;
    private Double v3;
    private String ver;
    private String ccid;
    private Date updatetime;
    //0 离线 1在线
    private Integer status;
    private Date offtime;
    private Integer a;
    private Integer km;
    private Integer e;
    private String cmdstatus;
    @Field("lockStatus")
    private Integer lockStatus;
    private Date addtime;
    private String mac;
    private String qiancode;
    private String houcode;
    private String bleKey;
    private String blePassword;
    @Field("is_delete")
    private Integer isDelete;
    @Field("launched_city_id")
    private Integer launchedCityId;
    /**
     * 制造商简称
     */
    private String typeName;
    private GeoJsonPoint location;
    /**
     * 车架号
     */
    private String cjh;
    /**
     * 开锁状态上传时间
     */
    private Integer gpsrun;
    /**
     * 关锁状态上传时间
     */
    private Integer gpsstop;

    private String apn;

    private String ipaddr;

    private String port;
    /**
     * 1损坏车 0ornull 正常车辆
     */
    private Integer isbroken;

    /**
     * 是否可见 0 不可见 1可见
     */
    private Integer viewAble;

    private List<String> group;

    /**
     * 0没有丢失 1丢失
     */
    private Integer lost;

    private Integer bonus_bike_id;

    private String icon;

    /**
     * 0无状态 1暂停中 2被预约
     */
    private Integer orderStatus;

    private Date lastLockTime;

    public Integer getBonus_bike_id() {
        return bonus_bike_id;
    }

    public void setBonus_bike_id(Integer bonus_bike_id) {
        this.bonus_bike_id = bonus_bike_id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public Double getV1() {
        return v1;
    }

    public void setV1(Double v1) {
        this.v1 = v1;
    }

    public Double getV2() {
        return v2;
    }

    public void setV2(Double v2) {
        this.v2 = v2;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOfftime() {
        return offtime;
    }

    public void setOfftime(Date offtime) {
        this.offtime = offtime;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getE() {
        return e;
    }

    public void setE(Integer e) {
        this.e = e;
    }

    public String getCmdstatus() {
        return cmdstatus;
    }

    public void setCmdstatus(String cmdstatus) {
        this.cmdstatus = cmdstatus;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getQiancode() {
        return qiancode;
    }

    public void setQiancode(String qiancode) {
        this.qiancode = qiancode;
    }

    public Integer getGpsrun() {
        return gpsrun;
    }

    public void setGpsrun(Integer gpsrun) {
        this.gpsrun = gpsrun;
    }

    public Integer getGpsstop() {
        return gpsstop;
    }

    public void setGpsstop(Integer gpsstop) {
        this.gpsstop = gpsstop;
    }

    public Double getV3() {
        return v3;
    }

    public void setV3(Double v3) {
        this.v3 = v3;
    }

    public String getHoucode() {
        return houcode;
    }

    public void setHoucode(String houcode) {
        this.houcode = houcode;
    }

    public Integer getIsbroken() {
        return isbroken;
    }

    public void setIsbroken(Integer isbroken) {
        this.isbroken = isbroken;
    }

    public String getCjh() {
        return cjh;
    }

    public void setCjh(String cjh) {
        this.cjh = cjh;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public Integer getViewAble() {
        return viewAble;
    }

    public void setViewAble(Integer viewAble) {
        this.viewAble = viewAble;
    }

    public GeoJsonPoint getLocation() {
        return location;
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getLaunchedCityId() {
        return launchedCityId;
    }

    public void setLaunchedCityId(Integer launchedCityId) {
        this.launchedCityId = launchedCityId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getLastLockTime() {
        return lastLockTime;
    }

    public void setLastLockTime(Date lastLockTime) {
        this.lastLockTime = lastLockTime;
    }
}
