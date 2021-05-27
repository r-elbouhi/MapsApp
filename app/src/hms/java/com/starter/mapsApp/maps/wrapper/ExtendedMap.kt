package com.starter.mapsApp.maps.wrapper

import android.annotation.SuppressLint
import com.huawei.hms.maps.HuaweiMap

/**
 * Created by Rami El-bouhi on 06,March,2021
 */
class ExtendedMap(private val huaweiMap: HuaweiMap) {

    fun setOnCameraIdleListener(listener: OnCameraIdleListener) {
        huaweiMap.setOnCameraIdleListener { listener.onCameraIdle() }
    }

    fun setOnCameraMoveListener(listener: OnCameraMoveListener) {
        huaweiMap.setOnCameraMoveListener { listener.onCameraMove() }
    }

    @SuppressLint("MissingPermission")
    fun setMyLocationEnabled(value: Boolean) {
        huaweiMap.isMyLocationEnabled = value
    }

    fun getUiSettings(): UiSettings {
        return UiSettings(huaweiMap)
    }

    fun getCameraPosition(): CameraPosition {
        return CameraPosition(huaweiMap.cameraPosition)
    }

    fun animateCamera(value: CameraUpdate?) {
        huaweiMap.animateCamera(value?.huawei)
    }

    fun moveCamera(value: CameraUpdate?) {
        huaweiMap.moveCamera(value?.huawei)
    }

    fun clear() {
        huaweiMap.clear()
    }

    fun addMarker(markerOptions: MarkerOptions): Marker {
        return Marker(huaweiMap.addMarker(markerOptions.huawei))
    }

    interface OnCameraIdleListener {
        fun onCameraIdle()
    }

    interface OnCameraMoveListener {
        fun onCameraMove()
    }

    interface OnCameraMoveCanceledListener {
        fun onCameraMoveCanceled()
    }

    interface CancelableCallback {
        fun onFinish()
        fun onCancel()
    }
}