package com.example.samojlov_av_homework_module_16_number_5_koala.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.samojlov_av_homework_module_16_number_5_koala.MainActivity
import com.example.samojlov_av_homework_module_16_number_5_koala.R
import com.example.samojlov_av_homework_module_16_number_5_koala.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var redBT: Button
    private lateinit var yellowBT: Button
    private lateinit var greenBT: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        redBT = binding.redBT
        yellowBT = binding.yellowBT
        greenBT = binding.greenBT

        (activity as MainActivity).menuBack = false

        redBT.setOnClickListener {
            (activity as MainActivity).menuBack = true
            (activity as MainActivity).invalidateOptionsMenu()

            val descriptionColor = getString(R.string.descriptionColor_Red)
            val name = getString(R.string.textFragment, redBT.text, descriptionColor)
            val action = StartFragmentDirections.actionStartFragmentToRedFragment(name)
            val extras = FragmentNavigatorExtras(
                redBT to "redBT"
            )
            findNavController().navigate(action, extras)
        }

        yellowBT.setOnClickListener {
            (activity as MainActivity).menuBack = true
            (activity as MainActivity).invalidateOptionsMenu()

            val descriptionColor = getString(R.string.descriptionColor_Yellow)
            val name = getString(R.string.textFragment, yellowBT.text, descriptionColor)
            val action = StartFragmentDirections.actionStartFragmentToYellowFragment(name)
            val extras = FragmentNavigatorExtras(
                yellowBT to "yellowBT"
            )
            findNavController().navigate(action, extras)
        }

        greenBT.setOnClickListener {
            (activity as MainActivity).menuBack = true
            (activity as MainActivity).invalidateOptionsMenu()

            val descriptionColor = getString(R.string.descriptionColor_Green)
            val name = getString(R.string.textFragment, greenBT.text, descriptionColor)
            val action = StartFragmentDirections.actionStartFragmentToGreenFragment(name)
            val extras = FragmentNavigatorExtras(
                greenBT to "greenBT"
            )
            findNavController().navigate(action, extras)
        }
    }
}