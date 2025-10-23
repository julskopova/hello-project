package com.example.helloproject.note

import org.springframework.data.jpa.repository.JpaRepository

// Long = typ primárního klíče
interface NoteRepository : JpaRepository<Note, Long>

