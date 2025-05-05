package com.speezy.fastcommers.user.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;
import org.hibernate.Hibernate;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;


    @Column
    private String phoneNumber;

    @Column
    private String name;


    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String role ;




    @Override
    public boolean equals(Object o ) {
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode(){
         return Objects.hash(phoneNumber);
    }
}
