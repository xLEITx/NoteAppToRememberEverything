package com.leit.noteapptoremembereverything.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.leit.noteapptoremembereverything.ui.theme.BabyBlue
import com.leit.noteapptoremembereverything.ui.theme.LightGreen
import com.leit.noteapptoremembereverything.ui.theme.RedOrange
import com.leit.noteapptoremembereverything.ui.theme.RedPink
import com.leit.noteapptoremembereverything.ui.theme.Violet

@Entity
data class Note(
    val title:String,
    val content:String,
    val timestamp:Long,
    val color: Int,
    @PrimaryKey val id:Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message:String):Exception(message)