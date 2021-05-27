package com.starter.mapsApp.maps.wrapper

import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.starter.mapsApp.maps.wrapper.BitmapDescriptor

/**
 * Created by Rami El-bouhi on 11,March,2021
 */
class BitmapDescriptorFactory {

    companion object{
        fun fromResource(id: Int): BitmapDescriptor {
            var google: com.google.android.gms.maps.model.BitmapDescriptor? = null
            try {
                google = BitmapDescriptorFactory.fromResource(id)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return BitmapDescriptor(google)
        }
    }
}