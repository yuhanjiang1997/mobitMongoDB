package mode.lock;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Copyright Mobit Belgium bvba
 * @Author: Jiubo.Jiang
 * @Date: 12/07/2017
 * @Description:
 */
@Document(collection = "Efence")
public class Efence {

    @Id
    private String _id;

    private GeoJsonPolygon zone;

    private GeoJsonPolygon automaticExpandedZone;

    private Long typeId;

    private String typeName;

    private String typeColor;

    private String borderColor;

    private Integer borderSize;

    private Integer showOnApp;

    private Integer layer;

    private String title;

    private String image;

    private Long linkedUserPass;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public GeoJsonPolygon getZone() {
        return zone;
    }

    public void setZone(GeoJsonPolygon zone) {
        this.zone = zone;
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

    public Integer getShowOnApp() {
        return showOnApp;
    }

    public void setShowOnApp(Integer showOnApp) {
        this.showOnApp = showOnApp;
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

    public Long getLinkedUserPass() {
        return linkedUserPass;
    }

    public void setLinkedUserPass(Long linkedUserPass) {
        this.linkedUserPass = linkedUserPass;
    }

    public GeoJsonPolygon getAutomaticExpandedZone() {
        return automaticExpandedZone;
    }

    public void setAutomaticExpandedZone(GeoJsonPolygon automaticExpandedZone) {
        this.automaticExpandedZone = automaticExpandedZone;
    }
}
