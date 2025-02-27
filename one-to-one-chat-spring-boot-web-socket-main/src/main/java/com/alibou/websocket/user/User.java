package com.alibou.websocket.user;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class User {
    @Id
    private String id;  // Auto-generated by MongoDB
    private String fullName;
    private Status status;
    private String role; 
}

