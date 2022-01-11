package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note

interface DeleteNoteUseCase {
    suspend operator fun invoke(note: Note)
}