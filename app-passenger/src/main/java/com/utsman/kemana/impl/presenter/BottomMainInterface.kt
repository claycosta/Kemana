package com.utsman.kemana.impl.presenter

import com.utsman.kemana.remote.place.Places
import io.reactivex.disposables.Disposable

interface BottomMainInterface {
    fun onSearchStartLocation(query: String): Disposable
    fun onSearchDestLocation(query: String): Disposable
    fun onClickOrder(startPlaces: Places, destPlaces: Places)
}