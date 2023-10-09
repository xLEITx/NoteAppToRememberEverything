package com.leit.noteapptoremembereverything.feature_note.domain.use_case

import com.leit.noteapptoremembereverything.feature_note.domain.model.InvalidNoteException
import com.leit.noteapptoremembereverything.feature_note.domain.model.Note
import com.leit.noteapptoremembereverything.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class InsertNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("Title is blank")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("Content is blank")
        }
        repository.insertNote(note)
    }
}