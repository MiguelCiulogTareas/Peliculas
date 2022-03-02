package ciulog.miguel.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenarPeliculas()

        var adaptadorPeliculas = AdaptadorPeliculas(this, peliculas)
        var listView: ListView = findViewById(R.id.listview)

        listView.adapter = adaptadorPeliculas
    }

    fun llenarPeliculas(){
        val peliculaBee = Pelicula(1, getString(R.string.peli1), getString(R.string.peli1_sinop), 120, R.drawable.bee_movie)
        val peliculaAkira = Pelicula(2, getString(R.string.peli2), getString(R.string.peli2_sinop), 110, R.drawable.akira)
        val peliculaNemo = Pelicula(3, getString(R.string.peli3), getString(R.string.peli3_sinop), 130, R.drawable.nemo)
        val peliculaRPO = Pelicula(4, getString(R.string.peli4), getString(R.string.peli4_sinop), 105, R.drawable.ready_player_one)
        val peliculaTopGun = Pelicula(5, getString(R.string.peli5), getString(R.string.peli5_sinop), 125, R.drawable.top_gun)
        peliculas.add(peliculaBee)
        peliculas.add(peliculaAkira)
        peliculas.add(peliculaNemo)
        peliculas.add(peliculaRPO)
        peliculas.add(peliculaTopGun)
    }
}