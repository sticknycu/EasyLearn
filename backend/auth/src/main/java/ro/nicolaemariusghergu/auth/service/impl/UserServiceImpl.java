package ro.nicolaemariusghergu.auth.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ro.nicolaemariusghergu.auth.dto.UserDto;
import ro.nicolaemariusghergu.auth.mapper.UserMapper;
import ro.nicolaemariusghergu.auth.repository.UserRepository;
import ro.nicolaemariusghergu.auth.service.UserService;

@Service
public record UserServiceImpl(UserRepository userRepository) implements UserService {

    @Override
    public ResponseEntity<UserDto> getUserInformationById(Integer userId) {
        return ResponseEntity.ok(userRepository.findById(userId).stream()
                .map(UserMapper.INSTANCE::userToUserDto)
                .findAny()
                .get());
    }
}
