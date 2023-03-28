package com.example.wikipedia_14.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.wikipedia_14.R
import com.example.wikipedia_14.databinding.FragmentPhotographerBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class FragmentPhotographer : Fragment() {
    lateinit var binding: FragmentPhotographerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPhotographerBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide
            .with(requireContext())
            .load(R.drawable.img_photographer)
            .transform(RoundedCornersTransformation(32, 8))
            .into(binding.imgPhotographer)

    }


}