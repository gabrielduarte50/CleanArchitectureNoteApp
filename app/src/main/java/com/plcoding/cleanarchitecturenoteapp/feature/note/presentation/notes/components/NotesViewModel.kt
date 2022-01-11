package com.plcoding.cleanarchitecturenoteapp.feature.note.presentation.notes.components

import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel // reference a hilt application e inject dependence in constructor
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel() {


}