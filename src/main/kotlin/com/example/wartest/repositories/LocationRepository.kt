package com.example.wartest.repositories

import com.example.wartest.entity.Location
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LocationRepository : CrudRepository<Location, Long> {

    @Query("SELECT location.city FROM Location location" )
    fun getAllCity(): List<String>
}


