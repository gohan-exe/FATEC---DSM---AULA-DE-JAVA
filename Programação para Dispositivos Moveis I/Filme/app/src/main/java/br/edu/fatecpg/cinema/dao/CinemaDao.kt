package br.edu.fatecpg.cinema.dao

import br.edu.fatecpg.cinema.models.Cinema

interface CinemaDao {
    fun AdicionarFilme(cinema: Cinema)
    fun obterFilmes():List<Cinema>
}
