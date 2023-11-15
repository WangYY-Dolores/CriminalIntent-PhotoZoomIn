package com.bignerdranch.android.criminalintent

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4


import org.junit.Assert.*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragment
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
class PhotoZoomInFragmentTest {

    @Test
    fun fragment_instantiation() {
        val photoName = "IMG_Tue Nov 14 20:49:58 EST 2023.JPG"
        val fragmentScenario = launchFragment<PhotoZoomInFragment>(
            fragmentArgs = Bundle().apply { putSerializable("PHOTO", photoName) }
        )

        fragmentScenario.onFragment { fragment ->
            assertNotNull(fragment)
        }
    }

    @Test
    fun fragment_view_instantiation() {
        val photoName = "IMG_Tue Nov 14 20:49:58 EST 2023.JPG"
        val fragmentScenario = launchFragment<PhotoZoomInFragment>(
            fragmentArgs = Bundle().apply { putSerializable("PHOTO", photoName) }
        )

        fragmentScenario.onFragment { fragment ->
            val view = fragment.view
            assertNotNull(view)
        }
    }

    @Test
    fun fragment_image_loading() {
        val photoName = "IMG_Tue Nov 14 20:49:58 EST 2023.JPG"
        val fragmentScenario = launchFragment<PhotoZoomInFragment>(
            fragmentArgs = Bundle().apply { putSerializable("PHOTO", photoName) }
        )

        fragmentScenario.onFragment { fragment ->
            val imgView = fragment.view?.findViewById<ImageView>(R.id.zoomImg)
            assertNotNull(imgView)

        }
    }
}