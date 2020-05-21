package com.example.hotel.dto;

import lombok.*;

import javax.validation.constraints.*;
import java.io.*;

@Data
public class KorisnikRequest implements Serializable {

    @NotBlank(message = "Username is mandatory")
    @Size(min=5, max=30)
    private String username;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Surname is mandatory")
    private String surname;
    @NotBlank(message = "Password is mandatory")
    @Size(min=5, max=10)
    private String password;




}