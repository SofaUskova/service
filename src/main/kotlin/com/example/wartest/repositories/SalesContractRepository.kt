package com.example.wartest.repositories

import com.example.wartest.entity.SalesContract
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface SalesContractRepository : CrudRepository<SalesContract, Long> {

    @Query("SELECT contract FROM SalesContract contract")
    fun getAllHorses(): MutableIterable<SalesContract>

    @Query("SELECT contract FROM SalesContract contract WHERE contract.horse.idHorse = :idHorse")
    fun getInformHorse(@Param("idHorse") idHorse: Int): SalesContract
}