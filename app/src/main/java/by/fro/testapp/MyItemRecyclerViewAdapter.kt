package by.fro.testapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView

import by.fro.testapp.dummy.DummyContent.TodoItem

/**
 * [RecyclerView.Adapter] that can display a [TodoItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter(
    private val values: List<TodoItem>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.userId.text = "ID: ${item.userId.toString()}"
        holder.title.text = "Title: ${item.title.toString()}"
        holder.isCompleted.isChecked = item.completed ?: false
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userId: TextView = view.findViewById(R.id.userId)
        val title: TextView = view.findViewById(R.id.title)
        val isCompleted: CheckBox = view.findViewById(R.id.isCompleted)
    }
}