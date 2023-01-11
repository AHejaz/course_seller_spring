package com.brehon.course_seller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",unique = true,nullable = false,length = 30)
    private String username;

    @Column(name = "password",nullable = false,length = 30)
    private String password;

    public Boolean validatePassword(String password){
        return this.password.equals(password);
    }
}
