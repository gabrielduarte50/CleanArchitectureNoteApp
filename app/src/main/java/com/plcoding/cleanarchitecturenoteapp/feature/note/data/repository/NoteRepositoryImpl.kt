package com.plcoding.cleanarchitecturenoteapp.feature.note.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

//this layer is to implementation the interface and comunicate with da dataBase
class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}