package by.fro.testapp.dummy

import by.fro.testapp.network.service
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val items: MutableList<TodoItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, TodoItem> = HashMap()

    init {
        // Add some sample items.
        createDummyItem()
    }

    private fun createDummyItem() {

        service.getTodoList()
            .subscribe({
                items.addAll(it)
            }, {
                println("Error: ${it.message}")
            })
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    fun getTodoItems(): List<TodoItem> {
        return service.getTodoList().blockingFirst()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class TodoItem(
        var completed: Boolean?,
        var id: Int?,
        var title: String?,
        var userId: Int?
    )
}