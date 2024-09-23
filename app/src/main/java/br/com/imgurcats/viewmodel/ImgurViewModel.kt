package br.com.imgurcats.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.imgurcats.model.ImgurAlbum
import br.com.imgurcats.network.ImgurApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ImgurViewModel(private val imgurApiService: ImgurApiService) : ViewModel() {

    private val _albums = MutableStateFlow<List<ImgurAlbum>>(emptyList())
    val albums: StateFlow<List<ImgurAlbum>> = _albums

    fun searchImages(query: String) {
        viewModelScope.launch {
            try {
                val response = imgurApiService.searchImages(query)
                // Filtra as imagens para remover as que têm link vazio ou nulo
                val validAlbums = response.data.filter { album ->
                    album.images?.all { image ->
                        !image.link.isNullOrBlank()
                    } ?: false
                }
                _albums.value = validAlbums
            } catch (e: Exception) {
                // Handle error
                _albums.value = emptyList()
            }
        }
    }

}