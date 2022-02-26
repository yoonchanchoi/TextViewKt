package com.example.view.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.view.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private var mBinding: ActivityMainBinding? = null
//
//    private val binding get() = mBinding!!

//    private var tv_title: TextView?=null;

    private lateinit var tv_title: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {// 앱이 최소 실행됬을 때 수정
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결한다.

//        mBinding = ActivityMainBinding.inflate(layoutInflater)


        tv_title=findViewById(R.id.tv_title)
        tv_title.setText("제롱동이")



    }

}