package com.bignerdranch.android.criminalintent

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

class PhotoZoomInFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.zoom_layout, container, false)
        val imgView = view.findViewById(R.id.zoomImg) as ImageView
        val photoName = arguments?.getSerializable("PHOTO") as String
        imgView.setImageBitmap(BitmapFactory.decodeFile(requireContext().filesDir.path + "/" + photoName))
        return view
    }

    companion object {
        fun newInstance(photoName: String): PhotoZoomInFragment {
            val frag = PhotoZoomInFragment()
            val args = Bundle()
            args.putSerializable("PHOTO", photoName)
            frag.arguments = args
            return frag
        }
    }
}