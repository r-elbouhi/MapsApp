package com.starter.mapsApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.starter.mapsApp.maps.MapFragment
import com.starter.mapsApp.maps.wrapper.CameraUpdateFactory
import com.starter.mapsApp.maps.wrapper.ExtendedMap
import com.starter.mapsApp.maps.wrapper.LatLng
import com.starter.mapsApp.maps.wrapper.MarkerOptions


class MainActivity : AppCompatActivity(), MapFragment.OnMapReadyCallback {

    private var mMap: ExtendedMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mMapFragment = supportFragmentManager.findFragmentById(R.id.map) as MapFragment
        mMapFragment.getMapAsync(this)
    }

    override fun onMapReady(map: ExtendedMap?) {
        mMap = map
        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap?.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney")
        )
        mMap?.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}