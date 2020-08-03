package com.khs.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khs.intent.databinding.ActivityMainBinding
import com.khs.intent.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        mBinding.btnGoSecondActivity.setOnClickListener {
            val intent = Intent(MainActivity@this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}