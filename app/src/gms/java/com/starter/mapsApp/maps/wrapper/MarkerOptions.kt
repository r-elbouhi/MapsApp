package com.starter.mapsApp.maps.wrapper

/**
 * Created by Rami El-bouhi on 11,March,2021
 */
class MarkerOptions {
    var google = com.google.android.gms.maps.model.MarkerOptions()

    fun position(value: LatLng): MarkerOptions {
        google = google.position(value.google)
        return this
    }

    fun icon(value: BitmapDescriptor?): MarkerOptions {
        google = google.icon(value?.google)
        return this
    }
    fun title(value: String?): MarkerOptions {
        google = google.title(value)
        return this
    }
}