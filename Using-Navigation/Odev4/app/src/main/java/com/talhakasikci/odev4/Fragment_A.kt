package com.talhakasikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talhakasikci.odev4.databinding.FragmentABinding

class Fragment_A : Fragment() {

    private lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater,container,false)
        binding.GoToB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_A_to_fragment_B)
        }


        return binding.root
    }


}