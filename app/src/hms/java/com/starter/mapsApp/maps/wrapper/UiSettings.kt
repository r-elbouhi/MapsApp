package com.starter.mapsApp.maps.wrapper

import com.huawei.hms.maps.HuaweiMap

/**
 * Created by Rami El-bouhi on 14,March,2021
 */
data class UiSettings(val huaweiMap: HuaweiMap) {

    fun setMyLocationButtonEnabled(value: Boolean) {
        huaweiMap.uiSettings.isMyLocationButtonEnabled = value
    }

    fun setCompassEnabled(value: Boolean) {
        huaweiMap.uiSettings.isCompassEnabled = value
    }
}