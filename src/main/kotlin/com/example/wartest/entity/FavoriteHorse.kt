package com.example.wartest.entity

import com.example.wartest.repositories.RepositoryKey
import javax.persistence.*

@Entity
@Table(name = "favorite_horse")
data class FavoriteHorse(
        @EmbeddedId
        val repositoryKey: RepositoryKey
)