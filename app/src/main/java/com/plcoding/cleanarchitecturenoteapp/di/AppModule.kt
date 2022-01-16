package com.plcoding.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source.NoteDatabase
import com.plcoding.cleanarchitecturenoteapp.feature.note.data.repository.NoteRepositoryImpl
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.AddNoteUseCaseImpl
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.DeleteNoteUseCaseImpl
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.GetNotesUseCaseImpl
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object AppModule {
    @Provides
    @Singleton
    fun provideNodeDataBase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNodeRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotesUseCaseImpl(repository),
            deleteNote = DeleteNoteUseCaseImpl(repository),
            addNote = AddNoteUseCaseImpl(repository),
        )
    }

}

// Module e InstallIn -> anotação adicional que determina em
// qual(is) componente(s) Hilt instalar o módulo
//instalar um módulo em um componente permite que
// essa vinculação seja acessada como uma dependência
// de outras vinculações nesse componente ou em qualquer
// componente filho abaixo dele
