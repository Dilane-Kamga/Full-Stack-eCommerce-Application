package com.teamsolutions.ecommerceapplication.dto;


import com.teamsolutions.ecommerceapplication.entity.Address;
import com.teamsolutions.ecommerceapplication.entity.Customer;
import com.teamsolutions.ecommerceapplication.entity.Order;
import com.teamsolutions.ecommerceapplication.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
