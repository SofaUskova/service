package com.example.wartest.repositories

import com.example.wartest.entity.Breed
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BreedRepository: CrudRepository<Breed, Long> {

    @Query("SELECT breed.breed FROM Breed breed" )
    fun getAllBreed(): List<String>
}