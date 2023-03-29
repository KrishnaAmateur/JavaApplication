package com.example.demo.api;

import com.example.demo.model.Server;
import com.example.demo.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;


@RequestMapping("api/v1/server")
@RestController
public class ServerController {

    private final ServerService serverService;

    @Autowired
    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @PostMapping
    public void addServer(@RequestBody Server server){
        serverService.addServer(server);
    }

    @GetMapping
    public List<Server> getAllServer(){
        return serverService.getAllServers();
    }

    @GetMapping(path = "{id}")
    public Optional<Server> getServerById(@PathVariable("id") String id){
        if(serverService.getServerById(id).isEmpty()){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "server not found"
            );
        }else{
            return serverService.getServerById(id);
        }
    }

    @DeleteMapping(path = "{id}")
    public void deleteServer(@PathVariable("id") String id){
        serverService.deleteServer(id);
    }

    @GetMapping(path = "name/{name}")
    public List<Server> getServerByName(@PathVariable("name") String name){
        if(serverService.getServerByName(name).size()>0)
            return serverService.getServerByName(name);
        else{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "server not found"
            );
        }
    }

}
