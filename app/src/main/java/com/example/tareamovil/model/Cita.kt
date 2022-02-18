package com.example.tareamovil.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "cita")
data class Cita(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    @ColumnInfo(name="nombre")
    val nombre: String?,
    @ColumnInfo(name="apellido1")
    val apellido1: String?,
    @ColumnInfo(name="apellido2")
    val apellido2: String?,
    @ColumnInfo(name="descripcion")
    val descripcion: String?,
    @ColumnInfo(name="padecimiento")
    val padecimiento: String/*,
    @ColumnInfo(name="hora")
    val horaCita: String?
*/
):Parcelable
