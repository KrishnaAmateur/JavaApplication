package com.example.demo.dao;

import com.example.demo.model.Server;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
@Repository("FakeDao")
public class FakeServerDao implements ServerDao {

    private static List<Server> servers = new ArrayList<>();
    @Override
    public int insertServer(UUID id, Server server) {
        servers.add(new Server(
                id,
                server.getName(),
                server.getLanguage(),
                server.getFramework()
        ));
        return 1;
    }


    @Override
    public List<Server> getAllServers() {
        return servers;
    }

    @Override
    public Optional<Server> getServer(UUID id){
        return servers.stream()
                .filter(server -> server.getId().equals(id))
                .findFirst();
    }

    @Override
    public void deleteServer(UUID id) {
        Optional<Server> server = servers.stream().filter(server1 -> server1.getId().equals(id)).findFirst();

        if(server.isPresent()){

        }
    }

    public List<Server> getServerByName(String name){
        List<Server> output= new ArrayList<>();
        for(int i=0;i<servers.size();i++){
            if(Objects.equals(servers.get(i).getName(), name)){
                output.add(servers.get(i));
            }
        }

        return output;
    }


}
 */
