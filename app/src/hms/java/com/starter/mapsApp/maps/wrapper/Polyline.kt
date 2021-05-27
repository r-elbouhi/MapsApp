package com.starter.mapsApp.maps.wrapper

import com.starter.mapsApp.maps.wrapper.LatLng

/**
 * Created by Rami El-bouhi on 14,March,2021
 */
data class Polyline(val huawei: com.huawei.hms.maps.model.Polyline) {

    fun setPoints(value: List<LatLng>) {
        val list: MutableList<com.huawei.hms.maps.model.LatLng> = arrayListOf()
        for (latLng in value) {
            list.add(latLng.huawei)
        }
        huawei.points = list
    }
}