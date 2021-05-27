package com.morniksa.maps.wrapper

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds

/**
 * Created by Rami El-bouhi on 16,March,2021
 */
class MapUtils {

    companion object {
        fun getStaticMapUrl(pickUpLat: Double, pickUpLng: Double, dropOffLat: Double, dropOffLng: Double): String {
            val builder = LatLngBounds.Builder()
            builder.include(LatLng(pickUpLat, pickUpLng))
            if (dropOffLat != 0.0 && dropOffLat != 0.0) builder.include(LatLng(dropOffLat, dropOffLng))
            val tmpBounds = builder.build()
            val center = tmpBounds.center
            return ("https://maps.googleapis.com/maps/api/staticmap?size=320x160&center=" + center.latitude + "," + center.longitude
                    + "&zoom=12&markers=color:blue|label:P|" + pickUpLat + "," + pickUpLng + "&markers=color:green|label:D|"
                    + dropOffLat + "," + dropOffLng + "&key=AIzaSyCDrLi-ZFpNBA-Qqymy_NUltkwncZX_Qp0")
        }
    }
}