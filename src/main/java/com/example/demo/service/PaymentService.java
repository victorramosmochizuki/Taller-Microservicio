package com.example.demo.service;

import com.example.demo.model.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> findAll();

    Payment create(Payment payment);

    Payment update(Payment payment);

    void delete(String id);
}
