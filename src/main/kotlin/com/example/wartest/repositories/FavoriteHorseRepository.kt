package com.example.wartest.repositories

import com.example.wartest.entity.FavoriteHorse
import com.example.wartest.entity.SalesContract
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface FavoriteHorseRepository : CrudRepository<FavoriteHorse, Long> {

    @Query(value = "SELECT favorite.repositoryKey.salesContract FROM FavoriteHorse favorite where favorite.repositoryKey.seller.userPrincipal.login = :login")
    fun getFavoriteHorses(@Param("login") login: String): MutableIterable<SalesContract>
}