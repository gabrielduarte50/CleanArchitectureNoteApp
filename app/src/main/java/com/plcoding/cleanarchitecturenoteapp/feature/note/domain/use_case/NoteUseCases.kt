package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    )