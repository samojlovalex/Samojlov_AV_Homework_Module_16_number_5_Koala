package com.example.samojlov_av_homework_module_16_number_5_koala.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.example.samojlov_av_homework_module_16_number_5_koala.MainActivity
import com.example.samojlov_av_homework_module_16_number_5_koala.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {

    private lateinit var binding: FragmentGreenBinding
    private lateinit var greenColorTextTV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition =
            context?.let { TransitionInflater.from(it).inflateTransition(android.R.transition.move) }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentGreenBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        greenColorTextTV = binding.greenColorTextTV


        val args: GreenFragmentArgs by navArgs()
        val text = args.greenMyArg
        greenColorTextTV.text = text
    }
}