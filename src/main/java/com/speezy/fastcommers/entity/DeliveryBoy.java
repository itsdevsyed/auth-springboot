package com.speezy.fastcommers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_boys")
@Getter @Setter @NoArgsConstructor

public class DeliveryBoy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String contactNumber;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
