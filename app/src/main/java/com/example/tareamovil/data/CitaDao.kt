package com.example.tareamovil.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tareamovil.model.Cita


@Dao
interface CitaDao {

    @Query("Select * from CITA")
 fun getAllData(): LiveData<List<Cita>>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addLugar(cita: Cita)


    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateLugar(cita: Cita)
    @Delete
    suspend fun deleteLugar(cita: Cita)


}