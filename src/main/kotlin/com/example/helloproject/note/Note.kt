package com.example.helloproject.note

import jakarta.persistence.*

@Entity
@Table(name = "notes")
class Note(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var text: String = ""
)
