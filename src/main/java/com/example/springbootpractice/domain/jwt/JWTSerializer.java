package com.example.springbootpractice.domain.jwt;

import com.example.springbootpractice.domain.user.User;

public interface JWTSerializer {

    String jwtFromUser(User user);

}
