package com.microservice.usermanagement.dao;

import com.microservice.usermanagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDao {
    private String response;
    private String state;
    private User user;
}
