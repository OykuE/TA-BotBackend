


package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.api.dto.LoginDto;
import bitirmeprojesi.tabot.business.abstracts.UserService;
import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    private UserService userService;

    @PostMapping("/save-user")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        return ResponseEntity.ok(userService.getUser(id));
    }

}


