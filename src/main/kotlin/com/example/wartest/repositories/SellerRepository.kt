package com.example.wartest.repositories

import com.example.wartest.entity.Seller
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface SellerRepository : CrudRepository<Seller, Int> {

    @Query("SELECT seller FROM Seller seller WHERE seller.userPrincipal.login = :login")
    fun getSeller(@Param("login") login: String): Seller
}