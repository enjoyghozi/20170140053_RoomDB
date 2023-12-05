package com.example.roomdb

import android.app.Application
import com.example.roomdb.repositori.ContainerApp
import com.example.roomdb.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp (this)
    }
}