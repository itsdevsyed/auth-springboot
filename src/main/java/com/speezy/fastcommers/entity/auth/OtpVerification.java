package com.speezy.fastcommers.entity.auth;

import com.speezy.fastcommers.entity.user.User;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "otp_verification")
public class OtpVerification {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String contact;
    private String otp;

    private Boolean isVerified = false;

    private String createdAt;
    private String expiresAt;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
