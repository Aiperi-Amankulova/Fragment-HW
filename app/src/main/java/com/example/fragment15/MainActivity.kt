package com.example.fragment15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHttps.setOnClickListener(this)
        btnNumber.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        val web = etHttps.text.toString()
        val phone =etNumber.text.toString()

        when (view?.id){
            R.id.btnHttps-> {
                Links("Вы открыли барузер")

            }

            R.id.btnNumber -> {
                Number("Вы открыли набор номера")

            }
        }
    }
}