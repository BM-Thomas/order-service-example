package com.lotteria.example.orderservice.controller;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/order")
public class OrderController {

    public static int number = 0;

    @GetMapping()
    public ResponseEntity<?> getOrders() {
        return new ResponseEntity<>("order", HttpStatus.OK);
    }

    @GetMapping("/getTypeNumber")
    public ResponseEntity<?> getTypeNumber() {
        if(number %2 ==0) {
            return new ResponseEntity<>("even", HttpStatus.OK);
        }
        return new ResponseEntity<>("odd", HttpStatus.OK);
    }
}
