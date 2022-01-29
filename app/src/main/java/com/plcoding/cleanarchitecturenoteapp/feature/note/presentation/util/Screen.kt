package com.plcoding.cleanarchitecturenoteapp.feature.note.presentation.util

sealed class Screen(val route: String){
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_note_screen")
}
