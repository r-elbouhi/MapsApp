package com.starter.mapsApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.huawei.hms.maps.HuaweiMap


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (HmsGmsUtil.isHmsAvailable(this)) {
            createAsH()
        } else {
            createAsG()
        }
    }

    /**
     * HMS creation process
     */
    private fun createAsH() {
        // Set the HMS resource file.
        setContentView(R.layout.activity_main_hms)
        // Initialize parameters.
        initMember()
        // Obtain the HMS fragment based on the ID.
        val hMapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as com.huawei.hms.maps.SupportMapFragment
        // Load a map.
        hMapFragment.getMapAsync { huaweiMap: HuaweiMap ->
            val sydney = com.huawei.hms.maps.model.LatLng(-34.0, 151.0)
            huaweiMap.addMarker(
                com.huawei.hms.maps.model.MarkerOptions()
                    .position(sydney)
                    .title("Marker in Sydney")
            )
            huaweiMap.moveCamera(com.huawei.hms.maps.CameraUpdateFactory.newLatLng(sydney))
        }
    }

    /**
     * GMS creation process
     */
    private fun createAsG() {
        // Set the GMS resource file.
        setContentView(R.layout.activity_main)
        // Initialize parameters.
        initMember()
        // Obtain the GMS fragment based on the ID.
        val gMapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as com.google.android.gms.maps.SupportMapFragment
        // Load a map.
        gMapFragment.getMapAsync { googleMap: GoogleMap ->
            val sydney = com.google.android.gms.maps.model.LatLng(-34.0, 151.0)
            googleMap.addMarker(
                com.google.android.gms.maps.model.MarkerOptions()
                    .position(sydney)
                    .title("Marker in Sydney")
            )
            googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(sydney))
        }
    }

    /**
     * Initialize member variables and extract them into independent methods.
     */
    private fun initMember() {
        // remaining member
    }
}