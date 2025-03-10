package com.example.messageservice.application.service;

import com.example.messageservice.application.api.feign.AuthServiceFeign;
import com.example.messageservice.application.mapper.UserMapper;
import com.example.messageservice.application.model.UserDto;
import com.example.messageservice.domain.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//il feign deve usare un modello di application per User e convertirlo nello user di domain.
//Che succede se un giorno cambia il body del messaggio?
// Sarà il feign service a prendere il modello di domain e convertirlo in quello di application
//Done

@Service
@AllArgsConstructor
@Log4j2
public class AuthServiceFeignImpl {
    private final AuthServiceFeign authServiceFeign;
    private UserMapper userMapper;

    public User verifyToken(String token) {
        UserDto userDto = authServiceFeign.verifyToken("Bearer " + token);
        return userMapper.mapToDomain(userDto);
    }

    public List<User> getUsers() {
        return authServiceFeign.getUsers().stream()
                .map(userMapper::mapToDomain)
                .collect(Collectors.toList());
    }
}