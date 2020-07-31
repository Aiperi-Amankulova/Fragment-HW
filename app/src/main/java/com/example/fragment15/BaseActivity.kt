package com.example.fragment15

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    protected fun Links (http : String){
        Toast.makeText(this ,http, Toast.LENGTH_SHORT).show()
    }

    protected fun Number(num : String){
        Toast.makeText(this ,num, Toast.LENGTH_SHORT).show()
    }


}
