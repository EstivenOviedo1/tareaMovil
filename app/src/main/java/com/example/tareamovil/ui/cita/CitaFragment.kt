package com.example.tareamovil.ui.cita

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tareamovil.databinding.FragmentCitaBinding
import com.example.tareamovil.viewmodel.CitaViewModel

class CitaFragment : Fragment() {

    private var _binding: FragmentCitaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(CitaViewModel::class.java)

        _binding = FragmentCitaBinding.inflate(inflater, container, false)
       val root: View = binding.root

        /*val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
       return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}