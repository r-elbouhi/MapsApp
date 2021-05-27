package com.starter.mapsApp.maps.wrapper

import com.google.android.gms.maps.GoogleMap

/**
 * Created by Rami El-bouhi on 11,March,2021
 */
data class UiSettings(val googleMap: GoogleMap) {

    fun setMyLocationButtonEnabled(value: Boolean) {
        googleMap.uiSettings.isMyLocationButtonEnabled = value
    }

    fun setCompassEnabled(value: Boolean) {
        googleMap.uiSettings.isCompassEnabled = value
    }
}