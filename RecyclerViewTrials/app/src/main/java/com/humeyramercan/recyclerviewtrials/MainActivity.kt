package com.humeyramercan.recyclerviewtrials

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.humeyramercan.recyclerviewtrials.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        val list=ArrayList<ClothesModel>()
        list.add(ClothesModel("clothes 1","19.99",R.drawable.clothes_1))
        list.add(ClothesModel("clothes 2","20.99",R.drawable.clothes_2))
        list.add(ClothesModel("clothes 3","21.99",R.drawable.clothes_3))
        list.add(ClothesModel("clothes 4","22.99",R.drawable.clothes_4))
        list.add(ClothesModel("clothes 5","23.99",R.drawable.clothes_5))
        list.add(ClothesModel("clothes 6","24.99",R.drawable.clothes_6))

        val adapter=ClothesAdapter(list)
        binding.recyclerView.layoutManager=GridLayoutManager(this,2)
        binding.setVariable(BR.adapter,adapter)

        /*Also, you can set recyclerView adapter without dataBinding as follows. So, you don't need to define "adapter" variable in activity_main.xml.
        binding.recyclerView.adapter=adapter*/


    }
}