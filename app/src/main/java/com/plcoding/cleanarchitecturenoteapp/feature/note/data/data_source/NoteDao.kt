package com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    //getAll and return a Flow
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    //getById and use suspend because return the final object expect
    @Query("SELECT * FROM note WHERE id =:id")
    suspend fun getNoteById(id: Int): Note?

    //update a data that exist in dataBase
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}