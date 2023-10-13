package com.leit.noteapptoremembereverything.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val insertNote: InsertNote,
    val getNoteById: GetNoteById
)