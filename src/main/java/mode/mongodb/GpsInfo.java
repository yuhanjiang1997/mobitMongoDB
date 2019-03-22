package mode.mongodb;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


/**
 * Created by cnjia on 2017-06-14.
 */
@Document(collection = "gps_info")
public class GpsInfo implements Comparable<GpsInfo>{
    @Id
    private String _id;
    private String imsi;
    private Double lat;
    private Double lon;
    private String speed;
    private Integer rssi;
    private Double v1;
    private Double v2;
    private Double v3;
    private String ver;
    private Date receivetime;
    /**
     * 0锁 1手机
     */
    private Integer from;
    private String uuid;
    private Integer acc;
    private Integer e2;
    /**
     * 定位方式
     * 如果为0 则是LBS基站定位
     * 大于0 则是卫星数量
     */
    private Integer dwfs;

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

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Double getV3() {
        return v3;
    }

    public void setV3(Double v3) {
        this.v3 = v3;
    }

    public Integer getE2() {
        return e2;
    }

    public void setE2(Integer e2) {
        this.e2 = e2;
    }

    public Integer getRssi() {
        return rssi;
    }

    @Override
    public int compareTo(GpsInfo o) {
        try {
            Long value=o.getReceivetime().getTime()-this.getReceivetime().getTime();
            if(value>0){
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        GpsInfo gpsInfo= (GpsInfo) obj;
        try {
            return gpsInfo.getLat().equals(this.getLat()) && gpsInfo.getLon().equals(this.getLon());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getAcc() {
        return acc;
    }

    public void setAcc(Integer acc) {
        this.acc = acc;
    }


    public Integer getDwfs() {
        return dwfs;
    }

    public void setDwfs(Integer dwfs) {
        this.dwfs = dwfs;
    }

    public void setRssi(Integer rssi) {
        this.rssi = rssi;
    }
}
