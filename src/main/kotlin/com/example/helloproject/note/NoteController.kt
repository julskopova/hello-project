package com.example.helloproject.note   // nebo .controller, pokud ho máš v balíčku controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NoteController(
    private val repo: NoteRepository
) {
    @GetMapping("/notes")
    fun all(): List<Note> = repo.findAll()
}
