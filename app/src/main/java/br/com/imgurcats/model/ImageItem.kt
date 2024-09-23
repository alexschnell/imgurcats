package br.com.imgurcats.model

data class ImgurAlbum(
    val id: String,
    val title: String?,
    val link: String,
    val images: List<ImgurImage>?
)

data class ImgurImage(
    val id: String,
    val title: String?,
    val description: String?,
    val link: String
)

data class ImgurResponse(
    val data: List<ImgurAlbum>
)