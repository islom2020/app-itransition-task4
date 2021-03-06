package com.example.itransitiontask4.payload.request;

import lombok.Data;
import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class RegisterDto {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email. Try again.")
    private String email;

    @NotBlank(message = "password is required")
    private String password;

}
