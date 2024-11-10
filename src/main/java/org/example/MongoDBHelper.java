package org.example;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class MongoDBHelper {

    public MongoDatabase mDB;

    public MongoDBHelper(String uri, String database){

        MongoClient mongoClient = MongoClients.create(uri);
        mDB = mongoClient.getDatabase(database);

        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(
                        PojoCodecProvider.builder().automatic(true).build()
                ));

        mDB = mDB.withCodecRegistry(codecRegistry);
    }

    public MongoDatabase getMDB() {
        return this.mDB;
    }
}

