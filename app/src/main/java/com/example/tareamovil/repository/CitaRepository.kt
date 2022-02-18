package com.example.tareamovil.repository

import androidx.lifecycle.LiveData
import com.example.tareamovil.data.CitaDao
import com.example.tareamovil.model.Cita

class CitaRepository(private val citaDao: CitaDao) {


    val getAllData: LiveData<List<Cita>> = citaDao.getAllData()



    suspend fun addCita(cita: Cita)
    {
        citaDao.addLugar(cita)
    }

    suspend fun updateCita(cita: Cita)
    {
        citaDao.updateLugar(cita)
    }
    suspend fun deleteCita(cita: Cita)
    {
        citaDao.deleteLugar(cita)
    }




}