/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.itu.sofu.db;

import dk.itu.sofu.entity.Author;
import dk.itu.sofu.entity.Commit;
import dk.itu.sofu.entity.PushEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
//import org.neo4j.ogm.session.SessionFactory;

/**
 *
 * @author sofus
 */
public class NeoFacade {
     private final static SessionFactory sessionFactory =
                                new SessionFactory("dk.itu.sofu.entity");
     
     public PushEvent saveOrUpdatePE (PushEvent pe){
        Session s =sessionFactory.openSession("http://localhost:7474");
     s.save(pe);
     return pe;
     }
//     public PushEvent loadCommit(Commit c){
//        Session s =sessionFactory.openSession("http://localhost:7474");
//        String query="MATCH (n:Commit{id:{id}})";
////        0df70dce0bd78e5d42e25c8013113eab8eb1de2b
//         Map<String, Object> parameters = new HashMap<>();
//        ResourceIterator out= s.query(PushEvent.class, query, parameters);
//        
//     }
//     public Author updateAuthor(Author au){
//          Session s =sessionFactory.openSession("http://localhost:7474");
//         String query="MERGE (n:Author {name: {name}, email: {email}}) RETURN n";
//         Map<String, Object> parameters = new HashMap<>();
//    parameters.put( "name", au.name );
//    parameters.put( "email", au.email );
//    s.query(Author.class, query, parameters);
//         return au; 
//    }
//     public static void main(String[] args) {
////        CREATE CONSTRAINT ON (author:Author) ASSERT author.email IS UNIQUE
//          SessionFactory sessionFactory =
//                                new SessionFactory("dk.itu.sofu.entity");
//          Session s =sessionFactory.openSession("http://localhost:7474");
//          s.purgeDatabase();
////          String query="MERGE (n:Author {name: {name}, email: {email}}) RETURN n";
////          Author au = new Author();
////          au.email="admin@example.com";
////          au.name="Administrator";
////         Map<String, Object> parameters = new HashMap<>();
////    parameters.put( "name", au.name );
////    parameters.put( "email", au.email );
////    s.query(Author.class, query, parameters);
//    }
}
