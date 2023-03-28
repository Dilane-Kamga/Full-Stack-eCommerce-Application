package com.teamsolutions.ecommerceapplication.controller;


import com.teamsolutions.ecommerceapplication.dto.Purchase;
import com.teamsolutions.ecommerceapplication.dto.PurchaseResponse;
import com.teamsolutions.ecommerceapplication.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}









