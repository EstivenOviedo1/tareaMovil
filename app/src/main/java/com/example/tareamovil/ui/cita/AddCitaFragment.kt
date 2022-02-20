package com.example.tareamovil.ui.cita

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.tareamovil.R
import com.example.tareamovil.databinding.FragmentAddCitaBinding
import com.example.tareamovil.databinding.FragmentCitaBinding
import com.example.tareamovil.model.Cita
import com.example.tareamovil.viewmodel.CitaViewModel


class AddCitaFragment : Fragment() {


    private var _binding: FragmentAddCitaBinding?  = null

    private val binding get() = _binding!!

    private lateinit var citaViewModel: CitaViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        citaViewModel  = ViewModelProvider(this)[CitaViewModel::class.java]
        ViewModelProvider(this).get(CitaViewModel::class.java)

        _binding = FragmentAddCitaBinding.inflate(inflater, container, false)

        binding.btAgregar.setOnClickListener{
            addCita()

        }

return binding.root
    }


    private fun addCita(){
        var nombre = binding.etNombre.text.toString()
        if(nombre.isNotEmpty()){ //podemos insertar un lugar
            var descripcion = binding.etDes.text.toString()
            var apellido1 = binding.etApellido1.text.toString()
            var apellido2 = binding.etApellido2.text.toString()
            var padecimiento = binding.etPadecimiento.text.toString()
            var cita = Cita(0,nombre,descripcion,apellido1,apellido2,padecimiento)
            citaViewModel.addCita(cita)
            Toast.makeText(requireContext(),"Cita Agregado", Toast.LENGTH_SHORT).show()


        }else{

            Toast.makeText(requireContext(),"Faltan Datos", Toast.LENGTH_LONG).show()

        }

        findNavController().navigate(R.id.action_addCitaFragment_to_nav_cita)

    }

}