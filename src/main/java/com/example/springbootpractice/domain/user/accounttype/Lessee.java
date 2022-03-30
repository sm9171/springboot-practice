package com.example.springbootpractice.domain.user.accounttype;

import com.example.springbootpractice.domain.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Lessee extends User {
    @GeneratedValue(strategy = IDENTITY)
    private Long accountId;
}
