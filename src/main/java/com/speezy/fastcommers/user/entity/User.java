package com.speezy.fastcommers.user.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column (unique = true, nullable = false)
    private String email;

    @Column (nullable = false)
    private String password;

    @Column (nullable = false )
    private String role ;

    @Column (unique = true, nullable = false)
    private String phoneNumber;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    @Column
    private String address;

    @Column
    private String city;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

     @LastModifiedDate
    private LocalDateTime updatedAt;

}
