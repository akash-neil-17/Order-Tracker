package com.project.Order_Tracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestModel {

    private String invoice;

    private String recipient_address;

    private String recipient_name;

    private String recipient_phone;

    private int cod_amount;

    private String note;

}
