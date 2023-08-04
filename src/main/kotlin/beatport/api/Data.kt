package beatport.api

import kotlinx.serialization.Serializable


@Serializable
data class Auth(val access_token: String,
                val expires_in: Int,
                val token_type: String,
                val scope: String,
                val refresh_token: String)

@Serializable
data class Account(val id: Int)

@Serializable
data class Genre(val id: Int, val name: String)

@Serializable
data class Genres(val results: List<Genre>)

@Serializable
data class Artist(val id: Int, val name: String)

@Serializable
data class Image(val id: Long, val uri: String, val dynamic_uri: String)

@Serializable
data class Label(val id: Long, val name: String, val image: Image)

@Serializable
data class Release(val id: Long, val name: String, val image: Image, val label: Label)

data class Track(val id: String, val artists: List<Artist>, val name: String, val length_ms: Long, val release: Release)

@Serializable
data class TrackResponse(val id: Long, val artists: List<Artist>, val name: String, val length_ms: Long, val release: Release)

@Serializable
data class GenreTrackResponse(val results: List<TrackResponse>, val next: String)

@Serializable
data class QueryTrackResponse(val tracks: List<TrackResponse>, val next: String)

@Serializable
data class Download(val location: String, val stream_quality: String, val length_ms: Int)