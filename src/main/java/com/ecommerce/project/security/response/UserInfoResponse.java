package com.ecommerce.project.security.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseCookie;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserInfoResponse {

    private Long Id;
    private String jwtToken;

    private String username;


    private List<String> roles;

    public UserInfoResponse(Long id, String username, List<String> roles) {
        Id = id;
        this.username = username;
        this.roles = roles;
    }
}
