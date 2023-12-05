package com.example.roomdb.navigasi

interface DestinasiNavigasi {
    /**
     * Nama Unik untuk menentukan jalur untuk Composable.
     */
    val route : String

    /**
     * String Resource ID yang berisi judul yang akan ditampilkan di layar halaman.
     */
    val titleRes : Int
}