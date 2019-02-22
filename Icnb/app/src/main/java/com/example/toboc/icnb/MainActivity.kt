package com.example.toboc.icnb

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.toboc.icnb.view.ViewContract
import com.example.toboc.icnb.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.character_jokes_layout.*
import kotlinx.android.synthetic.main.endless_jokes_layout.*
import kotlinx.android.synthetic.main.jokes_random_layout.*

class MainActivity : AppCompatActivity(), ViewContract {
    val viewModel : ViewModel by lazy { ViewModelProviders.of(this).get(ViewModel::class.java) }

    override fun clickView(view: View){
        when(view.id) {
            R.id.btn_random -> viewModel.getRamdomJokes()
            R.id.btn_character ->{
                //todo create Fragment Transition
            }
            R.id.btn_endless ->{
                //todo create Fragment Endless
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_random.setOnClickListener{ v -> clickView(v)}
        btn_character.setOnClickListener{ v -> clickView(v) }
        btn_endless.setOnClickListener{ v -> clickView(v)}
    }
}
