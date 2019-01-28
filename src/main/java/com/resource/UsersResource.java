package com.resource;

import com.model.Users;
import com.repository.UsersRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UsersResource{


       @Autowired
       UsersRepository usersRepository;


    @GetMapping("/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }



    @GetMapping("/{name}")
    public List<Users> getUser(@PathVariable("name") final String name) {

        return usersRepository.findByName(name);

      /*  Optional<List<Users>> listOptional = usersRepository.findByName(name);
        List<Users> users = listOptional
                .orElseThrow(() -> new RuntimeException("No users Found"));
        //.orElse((new ArrayList<>()));
        return users;*/
    }

 /*  @GetMapping("/id/{id}")
   public Users gId(@PathVariable("id") final Integer id){
        return usersRepository.findOne(id);
   }

   @GetMapping("/update/{id}/{name}")
    public Users update(@PathVariable("id") final Integer id, @PathVariable("name") final String name)
   {

       Users users = gId(id);
       users.setName(name);
       return usersRepository.save(users);
   }*/
}
