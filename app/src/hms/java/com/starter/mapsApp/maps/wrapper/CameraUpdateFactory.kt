package com.starter.mapsApp.maps.wrapper

import com.huawei.hms.maps.CameraUpdateFactory

/**
 * Created by Rami El-bouhi on 06,March,2021
 */
class CameraUpdateFactory {

    companion object {

        fun newLatLng(position: LatLng): CameraUpdate {
            var huawei: com.huawei.hms.maps.CameraUpdate? = null
            try {
                huawei = CameraUpdateFactory.newLatLng(position.huawei)
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }
            return CameraUpdate(huawei)
        }

        fun newLatLngZoom(position: LatLng, zoom: Float): CameraUpdate? {
            var huawei: com.huawei.hms.maps.CameraUpdate? = null
            try {
                huawei = CameraUpdateFactory.newLatLngZoom(position.huawei, zoom)
            } catch (e: Exception) {
            }
            return CameraUpdate(huawei)
        }

        fun newCameraPosition(position: CameraPosition): CameraUpdate? {
            var huawei: com.huawei.hms.maps.CameraUpdate? = null
            try {
                huawei = CameraUpdateFactory.newCameraPosition(position.huawei)
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            }

            return CameraUpdate(huawei)
        }
    }
}