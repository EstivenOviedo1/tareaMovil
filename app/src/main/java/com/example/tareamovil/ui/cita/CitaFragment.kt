package com.example.tareamovil.ui.cita

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tareamovil.R
import com.example.tareamovil.adapter.CitaAdapter
import com.example.tareamovil.databinding.FragmentCitaBinding
import com.example.tareamovil.viewmodel.CitaViewModel

class CitaFragment : Fragment() {

    private var _binding: FragmentCitaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private  lateinit var citaViewModel: CitaViewModel
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(CitaViewModel::class.java)

        _binding = FragmentCitaBinding.inflate(inflater, container, false)

        binding.fbAgregar.setOnClickListener{

            findNavController().navigate(R.id.action_nav_cita_to_addCitaFragment)

        }

        //Activar el RecyclerView

        val citaAdapter = CitaAdapter()
        val reciclador = binding.reciclador
        reciclador.adapter = citaAdapter
        reciclador.layoutManager = LinearLayoutManager(requireContext())



        citaViewModel = ViewModelProvider(this)[citaViewModel::class.java]
        citaViewModel.getAllData.observe(viewLifecycleOwner){citas -> citaAdapter.setData(citas)}



       return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}