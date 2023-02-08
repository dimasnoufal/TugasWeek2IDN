package com.dimasnoufal.tugasweek2idn

import android.app.GameManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dimasnoufal.tugasweek2idn.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding
    private val listGamesPoster:ArrayList<Games> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        this@DetailActivity.setTitle("Detail Game")

        binding.rvPosterGames.setHasFixedSize(true)
        listGamesPoster.addAll(GamesData.listGamesData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        binding.rvPosterGames.layoutManager = LinearLayoutManager(this@DetailActivity, LinearLayoutManager.HORIZONTAL, false)
        val detailAdapter = DetailAdapter(listGamesPoster)
        binding.rvPosterGames.adapter = detailAdapter
    }
}