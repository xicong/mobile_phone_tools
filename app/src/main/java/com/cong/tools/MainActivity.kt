package com.cong.tools

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mList= mutableListOf<Int>()

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleview.layoutManager=LinearLayoutManager(this).also {
          l -> l.orientation=LinearLayoutManager.VERTICAL
        }
        mList.clear()
        //0到1包含1
        for (i in 0..19){
            mList.add(i)
        }
        recycleview.adapter=MainAdapter(mList)
    }
}
