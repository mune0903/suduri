package com.mune0903.feature.favorite.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mune0903.feature.favorite.R
import com.mune0903.feature.favorite.databinding.FragmentFavoriteBinding

class FavoriteFragment: Fragment() {

    private lateinit var binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_favorite, container, false)
        binding.textView.text = "FavoriteFragment"
        return binding.root
    }
}