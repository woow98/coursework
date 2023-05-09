package com.example.coursework

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coursework.model.Product

class FragMainViewModel : ViewModel() {
    val towns =
        arrayOf("Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Нижний Новгород")
    private val _flowers: MutableLiveData<List<Product>> = MutableLiveData()
    val flowers: LiveData<List<Product>> get() = _flowers

    init {
        loadFlowers()
    }

    private fun loadFlowers() {
        val flowersList = listOf(
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            ),
            Product(
                "Роза",
                "https://cdn.leroymerlin.ru/lmru/image/upload/v1671106651/b_white,c_pad,d_photoiscoming.png,f_auto,h_600,q_auto,w_600/lmcode/zWizpMpjCUWp-5M5HK0MiA/82895031_04.png",
                100.00
            )
        )

        _flowers.postValue(flowersList)
    }

    //функция поиска цветов
    fun search(query: String) {

    }
}