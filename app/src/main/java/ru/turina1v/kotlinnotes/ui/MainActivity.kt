package ru.turina1v.kotlinnotes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import ru.turina1v.kotlinnotes.R

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var adapter: NotesListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        recycler_notes.layoutManager = GridLayoutManager(this, 2)
        adapter = NotesListAdapter()
        recycler_notes.adapter = adapter
        viewModel.viewState().observe(this, Observer { state ->
            state?.let { adapter.notes = it.notes }
        })

    }
}
