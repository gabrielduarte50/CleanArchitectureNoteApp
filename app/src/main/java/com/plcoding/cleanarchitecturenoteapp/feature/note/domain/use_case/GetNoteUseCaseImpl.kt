package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNoteUseCaseImpl(
    private val repo: NoteRepository
) : GetNotesUseCase {
    override operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)): Flow<List<Note>> {
        return repo.getNotes().map { notes ->
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> {
                            notes.sortedBy {
                                it.title.lowercase()
                            }
                        }
                        is NoteOrder.Date -> {
                            notes.sortedBy {
                                it.timeStamp
                            }
                        }
                        is NoteOrder.Color -> {
                            notes.sortedBy {
                                it.color
                            }
                        }
                    }
                }
                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> {
                            notes.sortedByDescending {
                                it.title.lowercase()
                            }
                        }
                        is NoteOrder.Date -> {
                            notes.sortedByDescending {
                                it.timeStamp
                            }
                        }
                        is NoteOrder.Color -> {
                            notes.sortedByDescending {
                                it.color
                            }
                        }
                    }
                }
            }
        }
    }
}