package ciulog.miguel.peliculas.ui.gallery

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
import ciulog.miguel.peliculas.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    var series: ArrayList<Pelicula> = ArrayList()
    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textGallery
//        galleryViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        llenarSeries()

        var adaptadorPeliculas = AdaptadorPeliculas(root.context, series)
        var listView: ListView = binding.listviewSeries

        listView.adapter = adaptadorPeliculas
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun llenarSeries(){
        val serieGame = Pelicula(1, getString(R.string.serie1), getString(R.string.serie1_sinop), 120, R.drawable.game_of_thrones)
        val serieWalking = Pelicula(2, getString(R.string.serie2), getString(R.string.serie2_sinop), 110, R.drawable.walking_dead)
        val serieKingdom = Pelicula(3, getString(R.string.serie3), getString(R.string.serie3_sinop), 130, R.drawable.the_last_kingdom)
        val serieDR = Pelicula(4, getString(R.string.serie4), getString(R.string.serie4_sinop), 105, R.drawable.dr_house)
        val serieMalcom = Pelicula(5, getString(R.string.serie5), getString(R.string.serie5_sinop), 125, R.drawable.malcom_in_the_middle)
        series.add(serieGame)
        series.add(serieWalking)
        series.add(serieKingdom)
        series.add(serieDR)
        series.add(serieMalcom)
    }
}