package ma.imad.spotifyclone.usercontext.mapper;

import ma.imad.spotifyclone.ReadUserDTO;
import ma.imad.spotifyclone.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ReadUserDTO readUserDTOToUser(User entity);
}
