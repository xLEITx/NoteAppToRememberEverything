package com.leit.noteapptoremembereverything.feature_note.domain.use_case

import com.leit.noteapptoremembereverything.feature_note.domain.model.Note
import com.leit.noteapptoremembereverything.feature_note.domain.repository.NoteRepository

class GetNoteById(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(noteId:Int):Note?{
        return repository.getNoteById(noteId)
    }
}