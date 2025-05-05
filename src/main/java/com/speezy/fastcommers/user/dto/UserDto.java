package com.speezy.fastcommers.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Phone number cannot be empty")
    private String phoneNumber;

    private String email;

    @NotBlank(message = "select the User Shoponwer or Deliveryguy")
    private String role;

}
