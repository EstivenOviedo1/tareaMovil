package com.example.tareamovil.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.tareamovil.data.CitaDatabase
import com.example.tareamovil.model.Cita
import com.example.tareamovil.repository.CitaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CitaViewModel(application: Application) : AndroidViewModel(application) {


    val getAllData: LiveData<List<Cita>>
    private  val repository: CitaRepository

    init {
        val citaDao = CitaDatabase.getDatabase(application).CitaDao()
        repository = CitaRepository(citaDao)
        getAllData = repository.getAllData
    }


    fun addCita(cita: Cita){
        viewModelScope.launch(Dispatchers.IO){repository.addCita(cita)}

    }
    fun updateCita(cita: Cita){
        viewModelScope.launch(Dispatchers.IO){repository.updateCita(cita)}

    }

    fun deleteCita(cita: Cita){
        viewModelScope.launch(Dispatchers.IO){repository.deleteCita(cita)}

    }

}