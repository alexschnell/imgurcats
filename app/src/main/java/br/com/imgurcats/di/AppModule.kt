package br.com.imgurcats.di

import br.com.imgurcats.repository.provideImgurApi
import br.com.imgurcats.repository.provideOkHttpClient
import br.com.imgurcats.repository.provideRetrofit
import br.com.imgurcats.viewmodel.ImgurViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { provideOkHttpClient() }
    single { provideRetrofit(get()) }
    single { provideImgurApi(get()) }
    viewModel { ImgurViewModel(get()) }
}