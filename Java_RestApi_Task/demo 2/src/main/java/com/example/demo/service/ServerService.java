package com.example.demo.service;


import com.example.demo.dao.ServerRepository;
import com.example.demo.model.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServerService {

    /**
    ServerDao serverDao;

    @Autowired
    public ServerService(@Qualifier("FakeDao") ServerDao serverDao){
        this.serverDao = serverDao;
    }

    public int addServer(Server server){
        return serverDao.addServer(server);
    }

    public int insertServer(UUID id, Server server){
        return serverDao.insertServer(id, server);
    }

    public List<Server> getAllServers(){
        return serverDao.getAllServers();
    }

    public Optional<Server> getServerById(UUID id){
        return serverDao.getServer(id);
    }

    public void deleteServer(UUID id) { serverDao.deleteServer(id);}

    public List<Server> getServerByName(String name) {return serverDao.getServerByName(name);}
    */

    @Autowired
    ServerRepository serverDao;

    public int addServer(Server server){
       serverDao.insert(server);
        return 1;
    }

    public List<Server> getAllServers(){
        return serverDao.findAll();
    }

    public Optional<Server> getServerById(String id){
        return serverDao.findById(id);
    }

    public void deleteServer(String  id){
        serverDao.deleteById(id);
    }

    public List<Server> getServerByName(String name){
        var servers = serverDao.findAll();
        List<Server> output= new ArrayList<>();
        for(int i=0;i<servers.size();i++){
            if(Objects.equals(servers.get(i).getName(), name)){
                output.add(servers.get(i));
            }
        }

        return output;
    }

}
