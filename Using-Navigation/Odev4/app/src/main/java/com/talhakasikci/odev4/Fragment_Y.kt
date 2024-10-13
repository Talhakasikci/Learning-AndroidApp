package com.talhakasikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.navOptions
import com.google.android.material.snackbar.Snackbar
import com.talhakasikci.odev4.databinding.FragmentYBinding


class Fragment_Y : Fragment() {
    private lateinit var binding:FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentYBinding.inflate(inflater,container,false)

        val backPress = object :OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
               Snackbar.make(binding.textView5,"Do You Wanna Go To Main Fragment?",Snackbar.LENGTH_SHORT)
                   .setAction("yes"){
                       isEnabled = false
                       Navigation.findNavController(requireView()).navigate(R.id.action_fragment_Y_to_mainFragment,
                           null,
                           NavOptions.Builder()
                               .setPopUpTo(R.id.mainFragment,false)
                               .build())

                   }.show()
            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backPress)


        return binding.root
    }

   


}