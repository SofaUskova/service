package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "role")
data class Role(
        @Id
        @Column(name = "id_role")
        val idRole: Int,
        @Column(name = "type_role")
        val typeRole: String
)
