package com.khs.intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.khs.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        var uri: Uri?=null
        var intent:Intent?=null

        mBinding.btnGoSecondActivity.setOnClickListener {
            intent = Intent(MainActivity@this,SecondActivity::class.java)
            startActivity(intent)
        }

        mBinding.btnDial.setOnClickListener {
            uri = Uri.parse("tel:01049307013")
            intent = Intent(Intent.ACTION_DIAL,uri)
            startActivity(intent)
        }

        mBinding.btnCall.setOnClickListener {
            uri = Uri.parse("tel:01049307013")
            intent = Intent(Intent.ACTION_CALL,uri)
            startActivity(intent)
        }

        mBinding.btnContact.setOnClickListener {
            uri = Uri.parse("content://contacts/people/");
            intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }

        mBinding.btnWebsite.setOnClickListener {
            uri = Uri.parse("http://sba.seoul.kr")
            intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        mBinding.btnSms.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW);
            intent?.putExtra("sms_body", "문자 메시지 입니다.");
            intent?.setType("vnd.android-dir/mms-sms");
            startActivity(intent)
        }
    }
}