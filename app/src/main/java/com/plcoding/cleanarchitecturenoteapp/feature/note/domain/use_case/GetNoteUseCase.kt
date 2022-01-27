package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note

interface GetNoteUseCase {
    suspend operator fun  invoke(id: Int): Note?
}