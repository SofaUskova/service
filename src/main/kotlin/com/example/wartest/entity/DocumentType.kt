package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "doc_type")
data class DocumentType(
        @Id
        @Column(name = "id_doc_type")
        val idDoc: Int,
        @Column(name = "doc_type")
        val docType: String
)
