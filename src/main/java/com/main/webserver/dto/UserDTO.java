package com.main.webserver.dto;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

@Data
@Getter
@Setter
public class UserDTO {

    private String username;
    private String password;
}
