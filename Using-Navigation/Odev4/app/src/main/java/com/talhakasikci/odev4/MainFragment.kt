package com.talhakasikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talhakasikci.odev4.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding:FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)

        binding.GoToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_fragment_A)
        }
        binding.GoToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_fragment_X)
        }



        return binding.root
    }


}