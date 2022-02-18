package com.example.tareamovil.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tareamovil.databinding.CitaFilaBinding
import com.example.tareamovil.model.Cita

class CitaAdapter: RecyclerView.Adapter<CitaAdapter.CitaViewHolder>() {

    private var listaCita = emptyList<Cita>()
    inner class CitaViewHolder(private val itemBinding: CitaFilaBinding):
        RecyclerView.ViewHolder(itemBinding.root){

        fun  bind(cita: Cita){
            itemBinding.tvPadecimiento.text = cita.padecimiento
            itemBinding.tvDes.text = cita.descripcion
            itemBinding.tvNombre.text = cita.nombre


        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitaViewHolder {
        val itemBinding = CitaFilaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  CitaViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CitaViewHolder, position: Int) {
        val CitaActual = listaCita[position]
        holder.bind(CitaActual)
    }

    override fun getItemCount(): Int {
     return listaCita.size
    }

    fun setData(citas: List<Cita>){
        this.listaCita = citas
        notifyDataSetChanged() //Provoca q se redibuje la lista
    }
}