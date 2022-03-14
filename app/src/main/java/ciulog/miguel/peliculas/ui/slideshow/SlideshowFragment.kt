package ciulog.miguel.peliculas.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ciulog.miguel.peliculas.AdaptadorPeliculas
import ciulog.miguel.peliculas.Pelicula
import ciulog.miguel.peliculas.R
import ciulog.miguel.peliculas.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    var fav: ArrayList<Pelicula> = ArrayList()
    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textSlideshow
//        slideshowViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        llenarFav()

        var adaptadorPeliculas = AdaptadorPeliculas(root.context, fav)
        var listView: ListView = binding.listviewFavoritos

        listView.adapter = adaptadorPeliculas
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun llenarFav(){
        val peliculaBee = Pelicula(1, getString(R.string.peli1), getString(R.string.peli1_sinop), 120, R.drawable.bee_movie)
        val peliculaAkira = Pelicula(2, getString(R.string.peli2), getString(R.string.peli2_sinop), 110, R.drawable.akira)
        val serieWalking = Pelicula(2, getString(R.string.serie2), getString(R.string.serie2_sinop), 110, R.drawable.walking_dead)
        val serieKingdom = Pelicula(3, getString(R.string.serie3), getString(R.string.serie3_sinop), 130, R.drawable.the_last_kingdom)
        val peliculaTopGun = Pelicula(5, getString(R.string.peli5), getString(R.string.peli5_sinop), 125, R.drawable.top_gun)
        fav.add(peliculaBee)
        fav.add(peliculaAkira)
        fav.add(serieWalking)
        fav.add(serieKingdom)
        fav.add(peliculaTopGun)
    }
}