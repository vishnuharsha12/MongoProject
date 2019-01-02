package com.springwithmongo.restresource;

import com.springwithmongo.document.UserDetails;
import com.springwithmongo.repository.UserDetailsRepo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserDetailsRepo userDetailsRepo;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Iterable<UserDetails> user) {
        //user.set_id(ObjectId.get());
    userDetailsRepo.saveAll(user);
//        user.setUsername(new String());
//        user.setUseradd(new String());
//        user.setUserphno(new int);

    }
    @RequestMapping(method=RequestMethod.PUT,value="/{username}" )
    public void update(@PathVariable ObjectId username,@RequestBody UserDetails user){
        user.set_id(username);
//        user.setUserphno(userphno);
        userDetailsRepo.save(user);


    }
    @RequestMapping(method=RequestMethod.GET,value="/{username}" )
    public Optional<UserDetails> getUser(@PathVariable("username") String username){
//        user.setUsername(username);
//        user.setUserphno(userphno);
      return userDetailsRepo.findById(username);
    }
    @RequestMapping(method=RequestMethod.GET )
    public List<UserDetails> getAllUsers(){
//        user.setUsername(username);
//        user.setUserphno(userphno);
        return userDetailsRepo.findAll();
    }
//    @RequestMapping(method=RequestMethod.DELETE,value="/{id}" )
//    public void delete(@PathVariable ObjectId _id ){
////        user.setUserphno(userphno)
//    }
@RequestMapping(method=RequestMethod.DELETE,value="/{user}" )
public void delete(@PathVariable("user") String user){
//        user.setUsername(username);
//        user.setUserphno(userphno);
    // userDetailsRepo.deleteById(user);
    System.out.println("my program");
    System.out.println("my program");
     UserDetails us=new UserDetails();
     us.setUseradd(user);
     userDetailsRepo.delete(us);

}
}
