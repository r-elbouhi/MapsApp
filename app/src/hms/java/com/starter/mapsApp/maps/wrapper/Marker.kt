package com.starter.mapsApp.maps.wrapper

import com.starter.mapsApp.maps.wrapper.BitmapDescriptor
import com.starter.mapsApp.maps.wrapper.LatLng

/**
 * Created by Rami El-bouhi on 14,March,2021
 */
data class Marker(val huawei: com.huawei.hms.maps.model.Marker) {

    fun setPosition(latLng: LatLng) {
        huawei.position = latLng.huawei
    }

    fun getPosition(): LatLng {
        return LatLng(huawei.position.latitude, huawei.position.longitude)
    }

    fun setIcon(value: BitmapDescriptor?) {
        huawei.setIcon(value?.huawei)
    }

    fun setAnchor(x: Float, y: Float) {
        huawei.setAnchor(x, y)
    }

    fun setTitle(value: String?) {
        huawei.setTitle(value)
    }

    fun getTitle(): String? {
        return huawei.title
    }

    fun setSnippet(value: String?) {
        huawei.setSnippet(value)
    }

    fun getSnippet(): String? {
        return huawei.snippet
    }

    fun isInfoWindowShown(): Boolean {
        return huawei.isInfoWindowShown
    }

    fun setFlat(value: Boolean) {
        huawei.isFlat = value
    }

    fun isFlat(): Boolean {
        return huawei.isFlat
    }

    fun setRotation(value: Float) {
        huawei.rotation = value
    }

    fun getRotation(): Float {
        return huawei.rotation
    }

    fun setZIndex(value: Float) {
        huawei.zIndex = value
    }

    fun getZIndex(): Float {
        return huawei.zIndex
    }

    fun setAlpha(value: Float) {
        huawei.alpha = value
    }

    fun getAlpha(): Float {
        return huawei.alpha
    }

    fun setTag(value: Any?) {
        huawei.tag = value
    }

    fun getTag(): Any? {
        return huawei.tag
    }

    fun setVisible(value: Boolean) {
        huawei.isVisible = value
    }

    fun showInfoWindow() {
        huawei.showInfoWindow()
    }

    fun remove() {
        huawei.remove()
    }
}