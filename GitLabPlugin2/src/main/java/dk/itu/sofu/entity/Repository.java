
package dk.itu.sofu.entity;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.neo4j.ogm.annotation.NodeEntity;

@Generated("org.jsonschema2pojo")
@NodeEntity
public class Repository extends Entity {

    @SerializedName("name")
    @Expose
    public String name;
    
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("homepage")
    @Expose
    public String homepage;
    @SerializedName("git_http_url")
    @Expose
    public String gitHttpUrl;
    @SerializedName("git_ssh_url")
    @Expose
    public String gitSshUrl;
    @SerializedName("visibility_level")
    @Expose
    public Integer visibilityLevel;

}
