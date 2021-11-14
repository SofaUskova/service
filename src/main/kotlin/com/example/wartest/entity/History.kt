package com.example.wartest.entity

import com.example.wartest.entity.SalesContract
import com.example.wartest.entity.Seller
import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "history")
data class History(
        @Id
        @Column(name = "id_history")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        val idHistory: Int,
        @ManyToOne
        @JoinColumn(name = "id_sales_contract")
        val salesContract: SalesContract,
        @ManyToOne
        @JoinColumn(name = "id_seller")
        val seller: Seller,
        @Column(name = "date_buy")
        val dateBuy: Date,
)
