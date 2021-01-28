package br.com.hackerman.spacextracking.domain.model

import com.google.gson.annotations.SerializedName


data class Launch (
        val fairings: Fairings,
        val links: Links,

        @SerializedName("static_fire_date_utc")
        val staticFireDateUTC: Any? = null,

        @SerializedName("static_fire_date_unix")
        val staticFireDateUnix: Any? = null,

        val tbd: Boolean,
        val net: Boolean,
        val window: Long,
        val rocket: String,
        val success: Boolean,
        val details: String,
        val crew: List<Any?>,
        val ships: List<String>,
        val capsules: List<Any?>,
        val payloads: List<String>,
        val launchpad: String,

        @SerializedName("auto_update")
        val autoUpdate: Boolean,

        @SerializedName("launch_library_id")
        val launchLibraryID: Any? = null,

        val failures: List<Any?>,

        @SerializedName("flight_number")
        val flightNumber: Long,

        val name: String,

        @SerializedName("date_utc")
        val dateUTC: String,

        @SerializedName("date_unix")
        val dateUnix: Long,

        @SerializedName("date_local")
        val dateLocal: String,

        @SerializedName("date_precision")
        val datePrecision: String,

        val upcoming: Boolean,
        val cores: List<Core>,
        val id: String
)

data class Core (
        val core: String,
        val flight: Long,
        val gridfins: Boolean,
        val legs: Boolean,
        val reused: Boolean,

        @SerializedName("landing_attempt")
        val landingAttempt: Boolean,

        @SerializedName("landing_success")
        val landingSuccess: Boolean,

        @SerializedName("landing_type")
        val landingType: String,

        val landpad: String
)

data class Fairings (
        val reused: Boolean,

        @SerializedName("recovery_attempt")
        val recoveryAttempt: Boolean,

        val recovered: Boolean,
        val ships: List<String>
)

data class Links (
        val patch: Patch,
        val reddit: Reddit,
        val flickr: Flickr,
        val presskit: Any? = null,
        val webcast: String,

        @SerializedName("youtube_id")
        val youtubeID: String,

        val article: String,
        val wikipedia: Any? = null
)

data class Flickr (
        val small: List<Any?>,
        val original: List<String>
)

data class Patch (
        val small: String,
        val large: String
)

data class Reddit (
        val campaign: String,
        val launch: String,
        val media: Any? = null,
        val recovery: String
)
