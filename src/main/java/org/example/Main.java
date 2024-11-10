package org.example;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Main {

    public static void main(String[] args) {

        MongoDatabase mdb = new MongoDBHelper(
                "mongodb://localhost:27017",
                "whsdb"
        ).getMDB();

        MongoCollection<MasterStudent> col = mdb.getCollection("MasterStudent", MasterStudent.class);

        Document doc = new Document();
        doc.put("vorname", "Miau");
        FindIterable<MasterStudent> cursor = col.find(doc);

        try(MongoCursor<MasterStudent> cursorIterator = cursor.cursor()) {
            while(cursorIterator.hasNext()) {
                MasterStudent s = cursorIterator.next();
                System.out.println(s);
            }

        }

        col.updateOne(
                new Document("vorname", "IchBin"),
                new Document(
                        "$set",
                        new Document("semester", 420).append("anschrift.hausnr", 123)
                )
        );



    }
}