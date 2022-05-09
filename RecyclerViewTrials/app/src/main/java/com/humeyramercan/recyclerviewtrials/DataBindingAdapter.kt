package com.humeyramercan.recyclerviewtrials

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageResource")
   fun ImageView.setImageResource(resource:Int){
       setImageResource(resource)
   }
