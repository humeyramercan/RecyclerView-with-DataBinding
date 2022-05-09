package com.humeyramercan.recyclerviewtrials

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.humeyramercan.recyclerviewtrials.databinding.RecyclerRowBinding

class ClothesAdapter(var clothesList:List<ClothesModel>):RecyclerView.Adapter<ClothesAdapter.ClothesHolder>() {

    class ClothesHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root) {
            fun bind(clothesModel:ClothesModel){
                binding.setVariable(BR.clothes,clothesModel)
            }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ClothesHolder(binding)
    }

    override fun onBindViewHolder(holder: ClothesHolder, position: Int) {

        holder.bind(clothesList.get(position))

        /*if you don't want to define bind function in ClothesHolder, you can do binding as follows.It's optional.
         holder.binding.setVariable(BR.clothes,clothesList.get(position))*/

        holder.itemView.setOnClickListener {
           Toast.makeText(it.context,"${clothesList.get(position).title}",Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
       return clothesList.size
    }
}