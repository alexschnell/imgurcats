package br.com.imgurcats

import android.app.Application
import br.com.imgurcats.di.appModule
import org.koin.core.context.startKoin

class ImgurcatsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}