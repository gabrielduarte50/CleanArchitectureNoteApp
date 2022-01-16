package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository

class AddNoteUseCaseImpl(
    private val repo: NoteRepository
) : AddNoteUseCase {

    @Throws(InvalidNoteException::class)
    override suspend fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("A nota não pode ter título vazio")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("A nota não pode ter conteúdo vazio")
        }
        repo.insertNote(note)
    }
}