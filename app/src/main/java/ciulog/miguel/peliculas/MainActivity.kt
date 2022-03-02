package ciulog.miguel.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun llenarPeliculas(){
        val peliculaBee = Pelicula(1, "Bee movie", "Pelicula de abejas salvando el mundo.", 120, R.drawable.bee_movie)
        val peliculaEncanto = Pelicula(2, "Encanto", "Una familia disfuncional con super poderes.", 110, R.drawable.encanto)
        val peliculaNemo = Pelicula(3, "Nemo", "Un pez buscando a su hijo perdido.", 130, R.drawable.nemo)
        val peliculaRPO = Pelicula(4, "Ready player one", "Una persona quiere descubrir el ultimo mensaje del creador de un juego.", 105, R.drawable.ready_player_one)
        val peliculaTopGun = Pelicula(5, "Top gun", "Piloto de fuerzas aereas en una competencia.", 125, R.drawable.top_gun)
        peliculas.add(peliculaBee)
        peliculas.add(peliculaEncanto)
        peliculas.add(peliculaNemo)
        peliculas.add(peliculaRPO)
        peliculas.add(peliculaTopGun)
    }
}