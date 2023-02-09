package com.dimasnoufal.tugasweek2idn

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.dimasnoufal.tugasweek2idn.databinding.RowItemGamesBinding

class DetailAdapter(val listGames: ArrayList<Games>) : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {
    inner class DetailViewHolder(var binding: RowItemGamesBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val binding = RowItemGamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetailViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listGames.size
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.binding.ivPoster.setImageResource(listGames[position].poster)
    }
}