package com.example.demo.service;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        Optional<Payment> optionalProduct = paymentRepository.findById(payment.getId());
        if (!optionalProduct.isPresent()) throw new RuntimeException("No se encontro el producto");
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(String id) {
        Optional<Payment> optionalProduct = paymentRepository.findById(id);
        if (!optionalProduct.isPresent()) throw new RuntimeException("No se encontro el producto");
        paymentRepository.deleteById(id);
    }
}
