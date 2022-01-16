package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note

interface AddNoteUseCase {
    suspend operator fun invoke(note: Note)
}