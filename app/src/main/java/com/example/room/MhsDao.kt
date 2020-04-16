package com.example.room

import androidx.room.*
import kotlinx.coroutines.selects.select

@Dao
interface MhsDao {
    @Query( "select * from mhsentity")
    fun getAll(): List<MhsEntity>

    @Query("select * from mhsentity where nama like :nama")
    fun findByName(nama: String): MhsEntity

    @Insert
    fun insertAll(vararg mhsData: MhsEntity)

    @Delete
    fun delete(mhs: MhsEntity)

    @Update
    fun updateData(vararg mhsData: MhsEntity)
}