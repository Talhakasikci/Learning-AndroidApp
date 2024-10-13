package com.talhakasikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talhakasikci.odev4.databinding.FragmentXBinding


class Fragment_X : Fragment() {

    private lateinit var binding:FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentXBinding.inflate(inflater,container,false)
        binding.GoToYFromX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment_X_to_fragment_Y)
        }

        return binding.root
    }


}