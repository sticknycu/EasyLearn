package ro.nicolaemariusghergu.auth.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ro.nicolaemariusghergu.auth.dto.UserDto;
import ro.nicolaemariusghergu.auth.model.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);

    default String mapEmptyString(String string) {
        return string != null && !string.isEmpty() ? string : null;
    }
}
