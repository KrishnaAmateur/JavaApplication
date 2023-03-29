package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "server")
public class Server {
    @Id
    private final String id;
    private final String name;
    private final String language;
    private final String framework;

    public Server(String id,
                  String name,
                  String language,
                  String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getLanguage(){
        return language;
    }

    public String getFramework(){
        return framework;
    }






}
