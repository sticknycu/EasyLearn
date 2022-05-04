package ro.nicolaemariusghergu.auth.service;

import org.springframework.http.ResponseEntity;
import ro.nicolaemariusghergu.auth.dto.UserDto;

public interface UserService {

    ResponseEntity<UserDto> getUserInformationById(Integer userId);
}
