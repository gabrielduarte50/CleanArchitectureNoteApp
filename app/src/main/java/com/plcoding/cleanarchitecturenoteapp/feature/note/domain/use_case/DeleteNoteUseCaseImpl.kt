package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository

class DeleteNoteUseCaseImpl(
    private val repo: NoteRepository
) : DeleteNoteUseCase {
    override suspend operator fun invoke(note: Note) {
        repo.deleteNote(note)
    }

}