package com.teamsolutions.ecommerceapplication.service;


import com.teamsolutions.ecommerceapplication.dto.Purchase;
import com.teamsolutions.ecommerceapplication.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
