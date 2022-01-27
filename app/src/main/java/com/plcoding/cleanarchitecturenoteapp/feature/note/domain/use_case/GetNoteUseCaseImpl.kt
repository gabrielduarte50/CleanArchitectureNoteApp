package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository

class GetNoteUseCaseImpl(
    private val repo: NoteRepository
) : GetNoteUseCase {
    override suspend operator fun invoke(id: Int): Note? {
        return repo.getNoteById(id)
    }
}