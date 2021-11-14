package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "sales_contract")
data class SalesContract(
        @Id
        @Column(name = "id_sales_contract")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        val idSalesContract: Int,
        @Column(name = "price")
        val price: String,
        @ManyToOne
        @JoinColumn(name = "id_seller")
        val seller: Seller,
        @OneToOne
        @JoinColumn(name = "id_horse")
        val horse: Horse
)
