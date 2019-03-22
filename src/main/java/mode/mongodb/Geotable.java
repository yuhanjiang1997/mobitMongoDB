package mode.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by cnjia on 2017-07-12.
 */
@Document
/**
 * 电子围栏表
 */
public class Geotable{

    @Id
    private String _id;

    private GeoJsonPolygon loc;

    private GeoJsonPolygon autoDesignArea;

    private Long typeId;

    private String typeName;

    private String typeColor;

    private String borderColor;

    private Integer borderSize;

    private Integer showApp;

    private Integer layer;

    private String title;

    private String image;

    private Long userPassId;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

//    public String getGroupId() {
//        return groupId;
//    }
//
//    public void setGroupId(String groupId) {
//        this.groupId = groupId;
//    }
//
//    public Integer getType() {
//        return type;
//    }
//
//    public void setType(Integer type) {
//        this.type = type;
//    }

    public GeoJsonPolygon getLoc() {
        return loc;
    }

    public void setLoc(GeoJsonPolygon loc) {
        this.loc = loc;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeColor() {
        return typeColor;
    }

    public void setTypeColor(String typeColor) {
        this.typeColor = typeColor;
    }

    public Integer getShowApp() {
        return showApp;
    }

    public void setShowApp(Integer showApp) {
        this.showApp = showApp;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(Integer borderSize) {
        this.borderSize = borderSize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getUserPassId() {
        return userPassId;
    }

    public void setUserPassId(Long userPassId) {
        this.userPassId = userPassId;
    }

    public GeoJsonPolygon getAutoDesignArea() {
        return autoDesignArea;
    }

    public void setAutoDesignArea(GeoJsonPolygon autoDesignArea) {
        this.autoDesignArea = autoDesignArea;
    }
}
