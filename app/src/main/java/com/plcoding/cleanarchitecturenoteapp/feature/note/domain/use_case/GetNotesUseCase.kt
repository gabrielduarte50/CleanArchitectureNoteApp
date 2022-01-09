package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util.NoteOrder
import kotlinx.coroutines.flow.Flow

//different from the course, i create this interface
//but, for another analyse i understand why their use
//this form : duplicate interfaces with a single function
interface GetNotesUseCase {
    operator fun invoke(noteOrder: NoteOrder): Flow<List<Note>>
}