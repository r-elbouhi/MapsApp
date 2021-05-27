package com.starter.mapsApp.maps.wrapper

import com.huawei.hms.maps.model.LatLng

/**
 * Created by Rami El-bouhi on 06,March,2021
 */
data class LatLng(val latitude: Double, val longitude: Double) {
    val huawei: LatLng = LatLng(latitude, longitude)
}