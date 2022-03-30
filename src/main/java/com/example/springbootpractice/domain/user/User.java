package com.example.springbootpractice.domain.user;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "account_type")
@Entity
public class User {

    @Column(name = "user_id")
    @GeneratedValue(strategy = IDENTITY)
    @Id
    private Long id;

    @Embedded
    private Email email;

    @Embedded
    private Profile profile;

    @Embedded
    private Password password;
}
