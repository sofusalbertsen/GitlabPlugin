
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
public class PushEvent extends Entity{

    @SerializedName("object_kind")
    @Expose
    public String objectKind;
    @SerializedName("before")
    @Expose
    public String before;
    @SerializedName("after")
    @Expose
    public String after;
    @SerializedName("ref")
    @Expose
    public String ref;
    @SerializedName("user_id")
    @Expose
    public Integer userId;
    @SerializedName("user_name")
    @Expose
    public String userName;
    @SerializedName("user_email")
    @Expose
    public String userEmail;
    @SerializedName("project_id")
    @Expose
    public Integer projectId;
    @SerializedName("repository")
    @Expose
    @Relationship(type = "REPOSITORY")
    public Repository repository;
    @SerializedName("commits")
    @Expose
    @Relationship(type = "COMMITS")
    public List<Commit> commits = new ArrayList<Commit>();
    @SerializedName("total_commits_count")
    @Expose
    public Integer totalCommitsCount;

}
