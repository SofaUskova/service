package com.example.wartest.repositories

import com.example.wartest.entity.SalesContract
import com.example.wartest.entity.Seller
import java.io.Serializable
import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Embeddable
data class RepositoryKey(
        @ManyToOne
        @JoinColumn(name = "id_sales_contract")
        private val salesContract: SalesContract,
        @ManyToOne
        @JoinColumn(name = "id_seller")
        private val seller: Seller) : Serializable