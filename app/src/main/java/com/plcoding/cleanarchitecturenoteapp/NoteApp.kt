package com.plcoding.cleanarchitecturenoteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
//Todos os apps que usam o Hilt precisam conter uma classe Application
//aciona a geração de código do Hilt, incluindo uma classe base para seu aplicativo
//que serve como contêiner de dependências no nível do aplicativo.
class NoteApp : Application() {
}