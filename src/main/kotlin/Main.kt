package org.example

fun main() {
    // list containing all tasks and it is mutable to add in it
    val list = mutableListOf<Task>()
    list.add(Task("Submit assignment",true))
    list.add(Task("Clean House"))
    list.add(Task("Watch recorded videos",true))
    println("All Tasks are: ")
    for (item in list) {
        if (item.isDone){
            print("✅")
        }else{
            print("❌")
        }
        println(" ${item.title}")
    }
    println("===================================")
    println("Not done tasks are: ")
    // for loop to display unfinished tasks
    for (item in list.filter { !it.isDone }) {
        println("-${item.title}")
    }
    println("===================================")
    // loop for finished tasks
    println("Done tasks are: ")
    for (item in list.filter { it.isDone }) {
        println("-${item.title}")
    }

}

data class Task (val title: String, val isDone: Boolean =  false){

}