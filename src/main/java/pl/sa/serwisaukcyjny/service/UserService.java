package pl.sa.serwisaukcyjny.service;

import org.springframework.stereotype.Service;
import pl.sa.serwisaukcyjny.model.User;
import pl.sa.serwisaukcyjny.model.dto.UserDto;

@Service
public class UserService {
    public User addUser(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setLastname(userDto.getLastname());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setCity(userDto.getCity());
        return null;
    }
}
