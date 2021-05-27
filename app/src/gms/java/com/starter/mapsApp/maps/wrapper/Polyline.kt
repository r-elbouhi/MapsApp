package com.starter.mapsApp.maps.wrapper

import com.starter.mapsApp.maps.wrapper.LatLng

/**
 * Created by Rami El-bouhi on 11,March,2021
 */
data class Polyline(val google: com.google.android.gms.maps.model.Polyline) {

    fun setPoints(value: List<LatLng>) {
        val list: MutableList<com.google.android.gms.maps.model.LatLng> = arrayListOf()
        for (latLng in value) {
            list.add(latLng.google)
        }
        google.points = list
    }
}