package com.starter.mapsApp.maps.wrapper

import com.starter.mapsApp.maps.wrapper.BitmapDescriptor
import com.starter.mapsApp.maps.wrapper.LatLng

/**
 * Created by Rami El-bouhi on 11,March,2021
 */
data class Marker(val google: com.google.android.gms.maps.model.Marker) {

    fun setPosition(latLng: LatLng) {
        google.position = latLng.google
    }

    fun getPosition(): LatLng {
        return LatLng(google.position.latitude, google.position.longitude)
    }

    fun setIcon(value: BitmapDescriptor?) {
        google.setIcon(value?.google)
    }

    fun setAnchor(x: Float, y: Float) {
        google.setAnchor(x, y)
    }

    fun setTitle(value: String?) {
        google.setTitle(value)
    }

    fun getTitle(): String? {
        return google.title
    }

    fun setSnippet(value: String?) {
        google.setSnippet(value)
    }

    fun getSnippet(): String? {
        return google.snippet
    }

    fun isInfoWindowShown(): Boolean {
        return google.isInfoWindowShown
    }

    fun setFlat(value: Boolean) {
        google.isFlat = value
    }

    fun isFlat(): Boolean {
        return google.isFlat
    }

    fun setRotation(value: Float) {
        google.rotation = value
    }

    fun getRotation(): Float {
        return google.rotation
    }

    fun setZIndex(value: Float) {
        google.zIndex = value
    }

    fun getZIndex(): Float {
        return google.zIndex
    }

    fun setAlpha(value: Float) {
        google.alpha = value
    }

    fun getAlpha(): Float {
        return google.alpha
    }

    fun setTag(value: Any?) {
        google.tag = value
    }

    fun getTag(): Any? {
        return google.tag
    }

    fun setVisible(value: Boolean) {
        google.isVisible = value
    }

    fun showInfoWindow() {
        google.showInfoWindow()
    }

    fun remove() {
        google.remove()
    }
}