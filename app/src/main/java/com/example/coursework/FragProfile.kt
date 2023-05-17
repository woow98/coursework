package com.example.coursework

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintSet
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController


class FragProfile : Fragment() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_profile, container, false)
        navController = findNavController()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.nav_host_profile) as NavHostFragment
        navController = navHostFragment.navController
    }
    private fun navigateToLoginFragment() {
        navController.navigate(R.id.user_login2)
    }
    private fun navigateToRegistrationFragment() {
        navController.navigate(R.id.user_registration2)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragProfile().apply {
                arguments = Bundle().apply {

                }
            }
    }
}