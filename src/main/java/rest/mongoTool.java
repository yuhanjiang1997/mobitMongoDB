package rest;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import mode.lock.LockConnectionLog;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import persist.LockConnectionLogRepository;


import java.util.ArrayList;
import java.util.List;

public class mongoTool {
    @Autowired
    LockConnectionLogRepository lockConnectionLogRepository;
    private GeoJsonPoint geoPoint;

    public GeoJsonPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoJsonPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public void main() {
//10.0.0.64
//  MongoClient mongoClient = new MongoClient( new MongoClientURI("mongodb://192.168.255.241:27017,192.168.255.241:27017"));
    MongoClient mongoClient = new MongoClient( new MongoClientURI("mongodb://47.254.130.198:27017"));
// Select the MongoDB database and collection to open the change stream against
        MongoClient mongoClient2 = new MongoClient( new MongoClientURI("mongodb://47.254.176.249:27017"));
    MongoDatabase db = mongoClient.getDatabase("nodeserver");    //源数据库名称
    MongoCollection<Document> collection = db.getCollection("dev_status");  //表名
    MongoDatabase mdb = mongoClient2.getDatabase("mobit");   //连接数据库名称
    mdb.createCollection("MobitLock");  //建表
    MongoCollection<Document> newCollection = mdb.getCollection("MobitLock");

   FindIterable<Document> documents = collection.find();
    MongoCursor<Document> mongoCursor = documents.iterator();
        List<Object> list = new ArrayList<Object>();
    while(mongoCursor.hasNext()){
        Document object = mongoCursor.next();
        Document document = new Document();
        document.append("_id",object.get("_id"));
        notNull(object,document,"imsi","lockId");
       // document.append("lockId",object.get("imsi"));
        notNull(object,document,"cjh","bikeId");
        notNull(object,document,"qiancode","frontCode");
        notNull(object,document,"houcode","backCode");
        notNull(object,document,"ccid","simCardIccid");
        notNull(object,document,"mac","bleMac");
        notNull(object,document,"bleKey","bleKey");
        notNull(object,document,"blePassword","blePassword");
        notNull(object,document,"launched_city_id","launchedCityId");
        notNull(object,document,"typeName","mobitLockType");
        notNull(object,document,"rssi","signalStrength");
        notNull(object,document,"v1","voltagePercentage");
        notNull(object,document,"v2","voltage");
        notNull(object,document,"ver","versionNumber");
        notNull(object,document,"status","connectionStatus");
        notNull(object,document,"lockStatus","lockStatus");
        notNull(object,document,"location","geoPoint");
        notNull(object,document,"group","linkedGroup");
        notNull(object,document,"bonus_bike_id","bonusBikeId");
        notNull(object,document,"viewAble","showOnApp");
        notNull(object,document,"icon","icon");
        notNull(object,document,"is_delete","isDeleted");
        notNull(object,document,"isbroken","isDefect");
        notNull(object,document,"orderStatus","rideStatus");
        notNull(object,document,"lost","isLost");
        notNull(object,document,"addtime","creationDate");
        notNull(object,document,"offtime","offlineDate");
        notNull(object,document,"updatetime","lastUpdatedDate");
        notNull(object,document,"lastLockTime","lastLockedTime");

       /* document.append("bikeId",object.get("cjh"));
        document.append("frontCode",object.get("qiancode"));
        document.append("backCode",object.get("houcode"));
        document.append("simCardIccid",object.get("ccid"));//
        document.append("bleMac",object.get("mac"));
        document.append("bleKey",object.get("bleKey"));//
        document.append("blePassword",object.get("blePassword"));//
        document.append("launchedCityId",object.get("launched_city_id"));
        document.append("mobitLockType",object.get("typeName"));//
        document.append("signalStrength",object.get("rssi"));
        document.append("voltagePercentage",object.get("v1"));
        document.append("voltage",object.get("v2"));
        document.append("versionNumber",object.get("ver"));
        document.append("connectionStatus",object.get("status"));
        document.append("lockStatus",object.get("lockStatus"));
        document.append("geoPoint",object.get("location"));
        document.append("linkedGroup",object.get("group"));
        document.append("bonusBikeId",object.get("bonus_bike_id"));//
        document.append("showOnApp",object.get("viewAble"));
        document.append("icon",object.get("icon"));
        document.append("isDeleted",object.get("is_delete"));
        document.append("isDefect",object.get("isbroken"));
        document.append("rideStatus",object.get("orderStatus"));
        document.append("isLost",object.get("lost"));
        document.append("creationDate",object.get("addtime"));
        document.append("offlineDate",object.get("offtime"));
        document.append("lastUpdatedDate",object.get("updatetime"));
        document.append("lastLockedTime",object.get("lastLockTime"));*/
        newCollection.insertOne(document);
        System.out.println(object);
    }
        mdb.createCollection("Efence");
        MongoCollection<Document> newCollectionEfence = mdb.getCollection("Efence");
        MongoCollection<Document> collectionEfence = db.getCollection("geotable");
        FindIterable<Document> documentsEfence = collectionEfence.find();
        MongoCursor<Document> mongoCursor2 = documentsEfence.iterator();
        while(mongoCursor2.hasNext()) {
            Document object = mongoCursor2.next();
            Document document = new Document();
            document.append("_id", object.get("_id"));
           /* document.append("zone", object.get("loc"));
            document.append("automaticExpandedZone", object.get("autoDesignArea"));
            document.append("typeId", object.get("typeId"));
            document.append("typeName", object.get("typeName"));
            document.append("typeColor", object.get("typeColor"));
            document.append("borderColor", object.get("borderColor"));
            document.append("borderSize", object.get("borderSize"));
            document.append("showOnApp", object.get("showApp"));
            document.append("layer", object.get("layer"));
            document.append("title", object.get("title"));
            document.append("image", object.get("image"));
            document.append("linkedUserPass", object.get("userPassId"));*/
            notNull(object,document,"loc","lastLockedTime");
            notNull(object,document,"lastLockTime","zone");
            notNull(object,document,"autoDesignArea","automaticExpandedZone");
            notNull(object,document,"typeId","typeId");
            notNull(object,document,"typeName","typeName");
            notNull(object,document,"typeColor","typeColor");
            notNull(object,document,"borderColor","borderColor");
            notNull(object,document,"borderSize","borderSize");
            notNull(object,document,"showApp","showOnApp");
            notNull(object,document,"layer","layer");
            notNull(object,document,"title","title");
            notNull(object,document,"image","image");
            notNull(object,document,"userPassId","linkedUserPass");

            newCollectionEfence.insertOne(document);
            System.out.println(object);
        }
        //
        //new GeoJsonPoint(longitude,latitude)
        mdb.createCollection("GpsRecord");
        MongoCollection<Document> newCollectionGpsRecord = mdb.getCollection("GpsRecord");
        MongoCollection<Document> collection3 = db.getCollection("gps_info");
        FindIterable<Document> documentsGpsRecord = collection3.find();
        MongoCursor<Document> mongoCursor3 = documentsGpsRecord.iterator();
        while(mongoCursor3.hasNext()) {
            mongoTool mongoTool = new mongoTool();
            Document object = mongoCursor3.next();
            Double lon = (Double) object.get("lon");
            Double lat = (Double) object.get("lat");
            GeoJsonPoint geoJsonPoint = new GeoJsonPoint(lon ,lat );
            mongoTool.setGeoPoint(geoJsonPoint);
            JSONObject jsonRefund = new JSONObject();
            jsonRefund.put("coordinates",mongoTool.getGeoPoint().getCoordinates());
            jsonRefund.put("type",mongoTool.getGeoPoint().getType());
            Document document = new Document();
            document.append("_id", object.get("_id"));

            notNull(object,document,"imsi","lockId");
            notNull(object,document,"rssi","signalStrength");
            notNull(object,document,"v1","voltagePercentage");
            notNull(object,document,"v2","voltage");
            notNull(object,document,"ver","versionNumber");
            notNull(object,document,"from","source");
            notNull(object,document,"uuid","rideUuid");
            notNull(object,document,"receivetime","creationDate");
            if (object.get("lon")!=null || object.get("lat")!=null){
                document.append("geoPoint",jsonRefund);
            }
          /*  document.append("lockId", object.get("imsi"));
            document.append("signalStrength", object.get("rssi"));
            document.append("voltagePercentage", object.get("v1"));
            document.append("voltage", object.get("v2"));
            //Object point = new GeoJsonPoint(lon ,lat);
            document.append("versionNumber", object.get("ver"));
            document.append("creationDate", object.get("receivetime"));
            document.append("geoPoint",jsonRefund);
            document.append("source", object.get("from"));
            document.append("rideUuid", object.get("uuid"));*/
           // document.append("lockStatus", object.get("title"));//daozhe
            newCollectionGpsRecord.insertOne(document);
            System.out.println(object);

        }
        mdb.createCollection("LockConnectionLog");
        MongoCollection<Document> newCollectionLog = mdb.getCollection("LockConnectionLog");
        MongoCollection<Document> collectionLog = db.getCollection("Lock_Network_Log");
        FindIterable<Document> documentsLog = collectionLog.find();
        MongoCursor<Document> mongoCursor4 = documentsLog.iterator();
        while(mongoCursor4.hasNext()) {
            Document object = mongoCursor4.next();
            Document document = new Document();
            document.append("_id", object.get("_id"));
            notNull(object,document,"imsi","lockId");
            notNull(object,document,"addTime","creationDate");
            notNull(object,document,"type","type");
          /*  document.append("lockId", object.get("imsi"));
            document.append("creationDate", object.get("addTime"));
            document.append("type", object.get("type"));*/
            newCollectionLog.insertOne(document);
            System.out.println(object);
        }
    }

    public static void notNull(Document obj ,Document document,String k1,String k2){

        if (obj.get(k1) != null) {
            document.append(k2,obj.get(k1));
        }
    }

}
