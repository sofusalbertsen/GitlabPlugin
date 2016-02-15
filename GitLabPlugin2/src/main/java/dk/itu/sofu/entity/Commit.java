
package dk.itu.sofu.entity;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@Generated("org.jsonschema2pojo")
@NodeEntity
public class Commit extends Entity {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("author")
    @Expose
    @Relationship(type = "AUTHOR")
    public Author author;
    @SerializedName("added")
    @Expose
    public List<String> added = new ArrayList<String>();
    @SerializedName("modified")
    @Expose
    public List<String> modified = new ArrayList<String>();
    @SerializedName("removed")
    @Expose
    public List<String> removed = new ArrayList<String>();

}
