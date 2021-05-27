package com.starter.mapsApp.maps.wrapper

/**
 * Created by Rami El-bouhi on 06,March,2021
 */
data class CameraPosition(val huawei: com.huawei.hms.maps.model.CameraPosition) {
    val tilt = huawei.tilt
    val zoom = huawei.zoom
    val target: LatLng = LatLng(huawei.target.latitude, huawei.target.longitude)
    val bearing = huawei.bearing

    companion object {

        fun builder(): Builder {
            return Builder()
        }

        class Builder {
            private var huawei = com.huawei.hms.maps.model.CameraPosition.Builder()

            init {
                huawei = com.huawei.hms.maps.model.CameraPosition.Builder()
            }

            fun bearing(value: Float): Builder {
                huawei = huawei.bearing(value)
                return this
            }

            fun target(value: LatLng): Builder {
                huawei = huawei.target(value.huawei)
                return this
            }

            fun tilt(value: Float): Builder {
                huawei = huawei.tilt(value)
                return this
            }

            fun zoom(value: Float): Builder {
                huawei = huawei.zoom(value)
                return this
            }

            fun build(): CameraPosition {
                return CameraPosition(huawei.build())
            }
        }
    }
}