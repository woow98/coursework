package com.example.coursework

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coursework.model.Product

class FragMainViewModel : ViewModel() {
    val towns =
        arrayOf("Казань", "Набережные Челны", "Альметьевск")
    private val _flowers: MutableLiveData<List<Product>> = MutableLiveData()
    val flowers: LiveData<List<Product>> get() = _flowers

    init {
        loadFlowers()
    }

    private fun loadFlowers() {
        val flowersList = listOf(
            Product(
                "Букет из 11 белых хризантем",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/buketiz11belyhhrizantem-0-large.webp",
                "2200 руб."
            ),
            Product(
                "Букет из 7 кустовых роз",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/buketizkustovyhrozovyhroz-0-large.webp",
                "2380 руб."
            ),
            Product(
                "Букет из 11 гипосфил",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/buketiz11belyhgipsofil-0-large.webp",
                "2899 руб."
            ),
            Product(
                "Букет из 7 роз Эквадор",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/buketizbelyhrozekvador0sm-0-large.webp",
                "2200 руб."
            ),
            Product(
                "Букет из сухоцветов",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/buketpuhovyepolya-0-large.webp",
                "2070 руб."
            ),
            Product(
                "Композиция в коробке 'Мировозрение'",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/czvety-v-korobke-mirovozzrenie-large.webp",
                "2650 руб."
            ),
            Product(
                "Сборный букет с пионами",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/buketvesennienoty-0-large.webp",
                "2850 руб."
            ),
            Product(
                "Букет с нежно-розовыми тюльпанами",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/tyulpany-nezhno-rozovye-large.webp",
                "2300 руб."
            ),
            Product(
                "Композиция в корзине 'Чтобы все упали'",
                "https://zelenodolsk.flowlove.ru/wp-content/themes/init/catalog/images/products/korzina-s-czvetami-lunnyj-zakat-large.webp",
                "5000 руб."
            )
        )

        _flowers.postValue(flowersList)
    }

    //функция поиска цветов
    fun search(query: String) {

    }
}