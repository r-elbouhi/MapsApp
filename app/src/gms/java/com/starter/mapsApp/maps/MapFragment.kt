package com.starter.mapsApp.maps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.SupportMapFragment
import com.starter.mapsApp.R
import com.starter.mapsApp.maps.wrapper.ExtendedMap

/**
 * Created by Rami El-bouhi on 27,May,2021
 */
class MapFragment : Fragment() {

    private val mapFragment: Fragment = SupportMapFragment.newInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentManager?.beginTransaction()?.replace(R.id.container, mapFragment)?.commit()
    }

    fun getMapAsync(callback: OnMapReadyCallback) {
        val googleFragment = mapFragment as SupportMapFragment
        googleFragment.getMapAsync { googleMap -> callback.onMapReady(ExtendedMap(googleMap)) }
    }

    interface OnMapReadyCallback {
        fun onMapReady(map: ExtendedMap?)
    }
}