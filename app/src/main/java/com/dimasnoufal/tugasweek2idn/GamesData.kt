package com.dimasnoufal.tugasweek2idn

object GamesData {
    private val posterGames = intArrayOf(
        R.drawable.poster_games_1,
        R.drawable.poster_games_1
    )

    val listGamesData: ArrayList<Games>
        get() {
            val listGames = arrayListOf<Games>()
            for (position in posterGames.indices) {
                val games = Games()
                games.poster = posterGames[position]
                listGames.add(games)
            }
            return listGames
        }
}