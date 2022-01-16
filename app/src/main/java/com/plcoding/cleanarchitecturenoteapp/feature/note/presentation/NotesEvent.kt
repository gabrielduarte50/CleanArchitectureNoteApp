package com.plcoding.cleanarchitecturenoteapp.feature.note.presentation

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util.NoteOrder

// sealdea class são classes com hierarquia restrita
// oferecem controle sobre herança. Todas as subclasses
// diretas de uma classe selada são conhecidas em tempo de compilação
// data class sao para armazenar dados e permite usar alguns
// metodos padrões

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
