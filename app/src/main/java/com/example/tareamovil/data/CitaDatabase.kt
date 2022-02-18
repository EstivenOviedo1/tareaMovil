package com.example.tareamovil.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tareamovil.model.Cita

@Database(entities = [Cita::class], version = 1, exportSchema = false)
abstract  class CitaDatabase: RoomDatabase() {

abstract fun CitaDao():CitaDao
    companion object {
        @Volatile
        private var INSTANCE: CitaDatabase? = null

        fun getDatabase(context: android.content.Context): CitaDatabase {
            val instance = INSTANCE
            if (instance != null) {

                return instance
            }
            synchronized(this){

                val basedatos =  Room.databaseBuilder(
                    context.applicationContext,
                    CitaDatabase::class.java,
                    "lugar_database"

                ).build()
                INSTANCE = basedatos
                return basedatos
            }
        }
    }
}
