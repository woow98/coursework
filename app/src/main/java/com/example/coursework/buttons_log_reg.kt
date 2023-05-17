package com.example.coursework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController


class buttons_log_reg : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_buttons_log_reg, container, false)

        // Получаем ссылку на NavController
        navController = findNavController()

        // Назначаем слушатели для кнопок регистрации и входа
        val registrationButton = view.findViewById<Button>(R.id.registration)
        registrationButton.setOnClickListener {
            navController.navigate(R.id.user_registration2)
        }

        val loginButton = view.findViewById<Button>(R.id.login)
        loginButton.setOnClickListener {
            navController.navigate(R.id.user_login2)
        }

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            buttons_log_reg().apply {
                arguments = Bundle().apply {

                }
            }
    }
}