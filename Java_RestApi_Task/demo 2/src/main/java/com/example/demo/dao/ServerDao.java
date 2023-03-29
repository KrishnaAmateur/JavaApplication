package com.example.demo.dao;

import com.example.demo.model.Server;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
public interface ServerDao {

    int insertServer(UUID id, Server server);

    default int addServer(Server server) {
        UUID id = UUID.randomUUID();
        return insertServer(id,server);
    }

    List<Server> getAllServers();

    Optional<Server> getServer(UUID id);

    void deleteServer(UUID id);

    List<Server> getServerByName(String name);


}
 */
