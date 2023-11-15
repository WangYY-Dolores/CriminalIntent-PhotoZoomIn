package com.bignerdranch.android.criminalintent



import android.os.Bundle
import android.widget.ImageView
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class PhotoZoomInFragmentTest {

    @Test
    fun fragmentNotNull() {
        val fragment = PhotoZoomInFragment.newInstance("IMG_Tue Nov 14 20:49:58 EST 2023.JPG")
        assertNotNull(fragment)
    }

    @Test
    fun fragmentViewNotNull() {
        val fragment = PhotoZoomInFragment.newInstance("IMG_Tue Nov 14 20:49:58 EST 2023.JPG")
        assertNotNull(fragment.view)
    }

    @Test
    fun imageViewNotNull() {
        val fragment = PhotoZoomInFragment.newInstance("IMG_Tue Nov 14 20:49:58 EST 2023.JPG")
        val imgView = fragment.view?.findViewById<ImageView>(R.id.zoomImg)
        assertNotNull(imgView)
    }

    @Test
    fun loadImageIntoImageView() {
        val fragment = PhotoZoomInFragment.newInstance("IMG_Tue Nov 14 20:49:58 EST 2023.JPG")
        val imgView = fragment.view?.findViewById<ImageView>(R.id.zoomImg)
        assertNotNull(imgView)

        val photoName = fragment.arguments?.getSerializable("PHOTO") as String
        val filePath = File(fragment.requireContext().filesDir, photoName).path

        assertTrue(File(filePath).exists())

    }
}