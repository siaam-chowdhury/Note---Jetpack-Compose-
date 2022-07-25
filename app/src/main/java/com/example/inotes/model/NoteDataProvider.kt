package com.example.inotes.model

object NoteDataProvider {


    fun pushFakeData(): ArrayList<NoteData> {
        val note = ArrayList<NoteData>()
        for (i in 0..50) {
            note.add(
                NoteData(
                    generateFakeData()[0],
                    "11/2/1232",
                    generateFakeData()[1]
                )
            )
        }
        return note
    }

}