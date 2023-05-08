package com.example.coursework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coursework.model.Product
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    val towns = arrayOf("Казань", "Набережные Челны", "Альметьевск")
    override fun onCreate(savedInstanceState: Bundle?) {

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        your_View_Pager_here.setOffscreenPageLimit(number_to_store);

        val products = arrayListOf<Product>()
        for(i in 0..50){
            products.add(Product("Розочки", "https://pro-dachnikov.com/uploads/posts/2021-09/1633002315_24-p-krasivie-rozi-v-sadu-foto-25.jpg", 1.99))
        }
        val rec_view = findViewById<RecyclerView>(R.id.recycler_view)
        rec_view.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ProductsAdapter(products)
        }

        val spinner = findViewById<Spinner>(R.id.spinner2)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, towns)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.main,
            R.id.fragBag,
            R.id.fragProfile))
        setupActionBarWithNavController(navController,appBarConfiguration)
        navView.setupWithNavController(navController)

        //setContentView(R.layout.header_activity)



    }
}