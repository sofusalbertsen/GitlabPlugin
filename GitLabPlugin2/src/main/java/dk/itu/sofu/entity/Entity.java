/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.itu.sofu.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Transient;
import org.neo4j.ogm.annotation.GraphId;

/**
 *
 * @author sofus
 */
public abstract class Entity {
    @GraphId
    private Long graphId;

    public void setGraphId(Long graphId) {
        this.graphId = graphId;
    }

    public Long getId() {
        return graphId;
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || graphId == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        if (!graphId.equals(entity.graphId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (graphId == null) ? -1 : graphId.hashCode();
    }
}
