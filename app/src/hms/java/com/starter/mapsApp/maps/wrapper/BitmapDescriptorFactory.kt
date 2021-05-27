package com.starter.mapsApp.maps.wrapper

import com.huawei.hms.maps.model.BitmapDescriptorFactory
import com.starter.mapsApp.maps.wrapper.BitmapDescriptor

/**
 * Created by Rami El-bouhi on 14,March,2021
 */
class BitmapDescriptorFactory {

    companion object{
        fun fromResource(id: Int): BitmapDescriptor {
            var huawei: com.huawei.hms.maps.model.BitmapDescriptor? = null
            try {
                huawei = BitmapDescriptorFactory.fromResource(id)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return BitmapDescriptor(huawei)
        }
    }
}