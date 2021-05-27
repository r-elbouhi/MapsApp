package com.starter.mapsApp.maps.wrapper


/**
 * Created by Rami El-bouhi on 06,March,2021
 */
data class CameraPosition(val google: com.google.android.gms.maps.model.CameraPosition) {
    val tilt = google.tilt
    val zoom = google.zoom
    val target: LatLng = LatLng(google.target.latitude, google.target.longitude)
    val bearing = google.bearing

    companion object {

        fun builder(): Builder {
            return Builder()
        }

        class Builder {
            private var google = com.google.android.gms.maps.model.CameraPosition.Builder()

            init {
                google = com.google.android.gms.maps.model.CameraPosition.Builder()
            }

            fun bearing(value: Float): Builder {
                google = google.bearing(value)
                return this
            }

            fun target(value: LatLng): Builder {
                google = google.target(value.google)
                return this
            }

            fun tilt(value: Float): Builder {
                google = google.tilt(value)
                return this
            }

            fun zoom(value: Float): Builder {
                google = google.zoom(value)
                return this
            }

            fun build(): CameraPosition {
                return CameraPosition(google.build())
            }
        }
    }
}

