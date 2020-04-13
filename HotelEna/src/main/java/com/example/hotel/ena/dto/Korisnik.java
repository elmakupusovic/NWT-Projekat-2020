package com.example.hotel.ena.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class Korisnik implements Serializable {

    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String password;
    private Boolean employeeInd;




}
