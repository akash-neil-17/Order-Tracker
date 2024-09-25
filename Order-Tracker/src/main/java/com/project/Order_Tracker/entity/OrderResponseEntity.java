package com.project.Order_Tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDERLIST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseEntity {
    @Id
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "INVOICE")
    private String invoice;

    @Column(name = "RCPN_ADDRESS")
    private String recipient_address;

    @Column(name = "RCPN_NAME")
    private String recipient_name;

    @Column(name = "RCPN_MOBILE")
    private String recipient_phone;

    @Column(name = "COD")
    private int cod_amount;

    @Column(name = "NOTE")
    private String note;

    @Column(name = "CID")
    private long consignment_id;

    @Column(name = "TRACKING_CODE")
    private String tracking_code;

    @Column(name = "DELIVERY_STATUS")
    private String status;

    @Column(name = "ORDER_CREATE")
    private String created_at;

    @Column(name = "ORDER_UPDATE")
    private String updated_at;

}
