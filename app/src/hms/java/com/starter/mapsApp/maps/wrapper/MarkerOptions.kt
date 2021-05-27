package com.starter.mapsApp.maps.wrapper

/**
 * Created by Rami El-bouhi on 14,March,2021
 */
class MarkerOptions {
    var huawei = com.huawei.hms.maps.model.MarkerOptions()

    fun position(value: LatLng): MarkerOptions {
        huawei = huawei.position(value.huawei)
        return this
    }

    fun icon(value: BitmapDescriptor?): MarkerOptions {
        huawei = huawei.icon(value?.huawei)
        return this
    }

    fun title(value: String?): MarkerOptions {
        huawei = huawei.title(value)
        return this
    }
}