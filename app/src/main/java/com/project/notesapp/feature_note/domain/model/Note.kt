package com.project.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.project.notesapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(Purple200, Purple500, Purple700, SomeColor, SomeColor2)
    }
}

class InvalidNoteException(message: String): Exception(message)