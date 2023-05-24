package com.example.assignmentrecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_ass.FibonacciRvAdapter
import com.example.recycler_ass.R

class MainActivity : AppCompatActivity() {

    fun generateFibonacciSequence(nums: Int): List<Int> {
        val result = mutableListOf(0, 1)
        if (nums > 2) {
            for (num in 2 until nums) {
                result.add(result[num-1] + result[num-2])
            }
        }
        return result
    }
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FibonacciRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvFibonacci)
        recyclerView.layoutManager = LinearLayoutManager(this, )
        adapter = FibonacciRvAdapter(generateFibonacciSequence(100))
        recyclerView.adapter = adapter
    }
}



