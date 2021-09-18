package com.ersinberkealemdaroglu.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ersinberkealemdaroglu.kotlinlandmarkbook.databinding.ActivityDetailsBinding


class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val intent = intent
        //casting
        //val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        val selectedLandmark = mySinglenton.chosenLandmark
        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)
        }




    }
}