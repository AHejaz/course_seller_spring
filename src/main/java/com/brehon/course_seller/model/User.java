package com.brehon.course_seller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name",nullable = false,length = 20)
    private String firstname;

    @Column(name = "last_name",nullable = false,length = 30)
    private String lastname;

    @Column(name = "email",length = 50,unique = true)
    private String email;

    @Column(name = "national_code",nullable = false,length = 10,unique = true)
    private String nationalCode;

    @Column(name = "phone_number",nullable = false,length = 11,unique = true)
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id",referencedColumnName = "id",nullable = false)
    private Account account;
}
