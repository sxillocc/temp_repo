package com.example.sayhello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class SayHelloController {

    @Autowired
    SayHelloRepository sayhelloRespository;

    @GetMapping("/")
    public List<Sayhello> index(){
        return sayhelloRespository.findAll();
    }


//    @GetMapping("/sayhello/{id}")
//    public Sayhello show(@PathVariable String id){
//        int sayhelloId = Integer.parseInt(id);
//        return sayhelloRespository.find(sayhelloId);
//    }

//    @PostMapping("/sayhello/search")
//    public List<Sayhello> search(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("text");
//        return sayhelloRespository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
//    }

//    @PostMapping("/sayhello")
//    public Sayhello create(@RequestBody Map<String, String> body){
//        String msg = body.get("msg");
//        return sayhelloRespository.save(new Sayhello(msg));
//    }

//    @PutMapping("/sayhello/{id}")
//    public Sayhello update(@PathVariable String id, @RequestBody Map<String, String> body){
//        int sayhelloId = Integer.parseInt(id);
//        Sayhello sayhello = sayhelloRespository.findOne(sayhelloId);
//        sayhello.setMsg(body.get("title"));
//        return sayhelloRespository.save(sayhello);
//    }

    @DeleteMapping("/sayhello/{id}")
    public boolean delete(@PathVariable String id){
        int sayhelloId = Integer.parseInt(id);
        sayhelloRespository.deleteById(sayhelloId);
        return true;
    }


}
