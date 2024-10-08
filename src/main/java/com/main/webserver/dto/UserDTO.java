package com.main.webserver.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;

    public UserDTO(String username, String password) {
    }
}
