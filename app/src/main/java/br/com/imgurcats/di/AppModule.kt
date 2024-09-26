package br.com.imgurcats.di

import br.com.imgurcats.repository.RetrofitInstance.provideImgurApi
import br.com.imgurcats.repository.RetrofitInstance.provideOkHttpClient
import br.com.imgurcats.repository.RetrofitInstance.provideRetrofit
import br.com.imgurcats.viewmodel.ImgurViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { provideOkHttpClient() }
    single { provideRetrofit(get()) }
    factory { provideImgurApi(get()) }
    viewModel { ImgurViewModel(get()) }
}