import br.edu.fatecpg.cinema.dao.CinemaDao
import br.edu.fatecpg.cinema.models.Cinema

class CinemaDaoImpl : CinemaDao {
    companion object {
        private val filmes = mutableListOf<Cinema>()
    }

    override fun AdicionarFilme(cinema: Cinema) {
        filmes.add(cinema)
    }

    override fun obterFilmes(): List<Cinema> {
        return filmes
    }
}
