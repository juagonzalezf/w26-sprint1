package com.api.socialmeli.controller;

import com.api.socialmeli.service.IBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import javax.xml.stream.events.EntityReference;

@RestController
public class SocialMeliController {

    @Autowired
    IBuyerService buyerService;

    @PostMapping("/users/{userId}/unfollow/{userIdToUnfollow}")
    public ResponseEntity<?> unfollowUser(@PathVariable int userId,
                                          @PathVariable int userIdToUnfollow){
        buyerService.unfollowUser(userId,userIdToUnfollow);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
