package com.starter.mapsApp.maps.wrapper

import android.annotation.SuppressLint
import com.google.android.gms.maps.GoogleMap

/**
 * Created by Rami El-bouhi on 06,March,2021
 */
class ExtendedMap(private val googleMap: GoogleMap) {

    fun setOnCameraIdleListener(listener: OnCameraIdleListener) {
        googleMap.setOnCameraIdleListener { listener.onCameraIdle() }
    }

    fun setOnCameraMoveListener(listener: OnCameraMoveListener) {
        googleMap.setOnCameraMoveListener { listener.onCameraMove() }
    }

    @SuppressLint("MissingPermission")
    fun setMyLocationEnabled(value: Boolean) {
        googleMap.isMyLocationEnabled = value
    }

    fun getUiSettings(): UiSettings {
        return UiSettings(googleMap)
    }

    fun getCameraPosition(): CameraPosition {
        return CameraPosition(googleMap.cameraPosition)
    }

    fun animateCamera(value: CameraUpdate?) {
        googleMap.animateCamera(value?.google)
    }

    fun moveCamera(value: CameraUpdate?) {
        googleMap.moveCamera(value?.google)
    }

    fun clear() {
        googleMap.clear()
    }

    fun addMarker(markerOptions: MarkerOptions): Marker {
        return Marker(googleMap.addMarker(markerOptions.google))
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