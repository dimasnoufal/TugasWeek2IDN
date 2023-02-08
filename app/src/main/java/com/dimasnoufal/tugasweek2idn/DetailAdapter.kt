package com.dimasnoufal.tugasweek2idn

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter(val listGames: ArrayList<Games>) : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {
    inner class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivPoster: ImageView = itemView.findViewById(R.id.iv_poster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_item_games, parent, false)
        return DetailViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGames.size
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.ivPoster.setImageResource(listGames[position].poster)
    }
}