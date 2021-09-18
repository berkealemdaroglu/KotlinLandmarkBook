package com.ersinberkealemdaroglu.kotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ersinberkealemdaroglu.kotlinlandmarkbook.databinding.RecyclerRowsBinding


class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

        class LandmarkHolder(val binding: RecyclerRowsBinding) : RecyclerView.ViewHolder(binding.root){

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            //chosenLandmark = landmarkList.get(position)
            mySinglenton.chosenLandmark = landmarkList.get(position)
            //intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}