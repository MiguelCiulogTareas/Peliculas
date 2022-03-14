package ciulog.miguel.peliculas.ui.home

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
import ciulog.miguel.peliculas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        llenarPeliculas()

        var adaptadorPeliculas = AdaptadorPeliculas(root.context, peliculas)
        var listView: ListView = binding.listviewPeliculas

        listView.adapter = adaptadorPeliculas

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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