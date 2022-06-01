package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "payment")
public class Payment {

    @Id

    private String id;
    private String type;
    private String number;
    private String date;
    private String cvv;

}
