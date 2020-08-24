package com.example.sun21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        swipeRefresh.setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener {
            println("Jessice:-------------xxx")
            /**
             * 关闭下拉动画
             */
            swipeRefresh.setRefreshing(false);
        })
    }
}