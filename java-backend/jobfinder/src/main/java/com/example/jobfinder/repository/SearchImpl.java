package com.example.jobfinder.repository;

import com.example.jobfinder.model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchImpl implements SearchRepository {

    @Autowired
    MongoClient mongoClient;

    @Override
    public List<Post> findByText(String text) {

        final List<Post> list = new ArrayList<>();

        MongoDatabase database = mongoClient.getDatabase("jobfinder");
        MongoCollection<Document> collection = database.getCollection("JobPost");

        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("techs", "profile", "description")))),
                new Document("$sort",
                        new Document("exp", 1L)),
                new Document("$limit", 10L)));

        return list;
    }
}
