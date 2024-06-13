fun main() {
    val todoList = mutableListOf<String>()
    while (true) {
        println("\nTo-Do List Application")
        println("1. View To-Do List")
        println("2. Add Item")
        println("3. Remove Item")
        println("4. Exit")
        print("Choose an option: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> viewTodoList(todoList)
            2 -> addItem(todoList)
            3 -> removeItem(todoList)
            4 -> {
                println("Exiting...")
                return
            }
            else -> println("Invalid option. Please try again.")
        }
    }
}

fun viewTodoList(todoList: MutableList<String>) {
    if (todoList.isEmpty()) {
        println("Your to-do list is empty.")
    } else {
        println("Your To-Do List:")
        todoList.forEachIndexed { index, item ->
            println("${index + 1}. $item")
        }
    }
}

