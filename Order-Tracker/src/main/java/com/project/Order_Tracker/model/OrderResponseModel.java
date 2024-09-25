package com.project.Order_Tracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseModel {

    private String invoice;

    private String recipient_address;

    private String recipient_name;

    private String recipient_phone;

    private int cod_amount;

    private String note;

    private long consignment_id;

    private String tracking_code;

    private String status;

    private String created_at;

    private String updated_at;

}
