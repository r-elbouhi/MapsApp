package com.starter.mapsApp.maps.wrapper

import com.google.android.gms.maps.CameraUpdateFactory

/**
 * Created by Rami El-bouhi on 06,March,2021
 */
class CameraUpdateFactory {

    companion object {
        fun newLatLng(position: LatLng): CameraUpdate {
            var google: com.google.android.gms.maps.CameraUpdate? = null
            try {
                google = CameraUpdateFactory.newLatLng(position.google)
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }
            return CameraUpdate(google)
        }

        fun newLatLngZoom(position: LatLng, zoom: Float): CameraUpdate {
            var google: com.google.android.gms.maps.CameraUpdate? = null
            try {
                google = CameraUpdateFactory.newLatLngZoom(position.google, zoom)
            } catch (e: Exception) {
            }
            return CameraUpdate(google)
        }

        fun newCameraPosition(position: CameraPosition): CameraUpdate? {
            var google: com.google.android.gms.maps.CameraUpdate? = null
            try {
                google = CameraUpdateFactory.newCameraPosition(position.google)
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }

            return CameraUpdate(google)
        }
    }
}