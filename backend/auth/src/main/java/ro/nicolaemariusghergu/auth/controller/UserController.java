package ro.nicolaemariusghergu.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ro.nicolaemariusghergu.auth.dto.UserDto;
import ro.nicolaemariusghergu.auth.service.UserService;

@RestController
public record UserController(UserService userService) {

    public ResponseEntity<UserDto> getUserInformations(Integer userId) {
        return userService.getUserInformationById(userId);
    }

}
