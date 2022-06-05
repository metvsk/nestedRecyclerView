package com.appstallion.nestedrecyclerview

object GroupData {
    fun getData(): MutableList<Data> {
        val data: MutableList<Data> = mutableListOf()
        data.add(Data("Group 1", mutableListOf("Team 1", "Team 2")))
        data.add(Data("Group 2", mutableListOf("Team 6", "Team 9")))
        data.add(Data("Group 3", mutableListOf("Team 20", "Team 21")))
        data.add(Data("Group 4", mutableListOf("Team 99", "Team 108")))
        return data
    }
}

class Data(val groupName: String, val items: MutableList<String>)