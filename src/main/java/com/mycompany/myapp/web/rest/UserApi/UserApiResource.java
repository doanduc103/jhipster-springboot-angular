package com.mycompany.myapp.web.rest.UserApi;

import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.service.UserService;
import com.mycompany.myapp.service.dto.AdminUserDTO;
import com.mycompany.myapp.web.rest.UserResource;
import com.mycompany.myapp.web.rest.errors.BadRequestAlertException;
import com.mycompany.myapp.web.rest.errors.EmailAlreadyUsedException;
import com.mycompany.myapp.web.rest.errors.LoginAlreadyUsedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserApiResource {
    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    UserService userService;

    private final Logger log = LoggerFactory.getLogger(UserApiResource.class);

    @PostMapping("/register")
    public ResponseEntity<User> RegisterInUserWeb(@RequestBody AdminUserDTO userDTO){
        log.debug("REST request to save User : {}", userDTO);
            User newUser = userService.RegisterInUserPage(userDTO);
        if(newUser == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(newUser);
        }
    }

    @PutMapping("/Edit/{id}")
    public ResponseEntity<User> EditUserInUserWeb(@PathVariable int id, AdminUserDTO userDTO){
        log.debug("REST request to save User : {}", userDTO);
        User newUser = userService.EditUserInUserPage(userDTO);
        if(newUser == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(newUser);
        }
    }
}
