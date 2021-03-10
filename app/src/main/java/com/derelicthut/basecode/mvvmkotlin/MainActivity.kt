package com.derelicthut.basecode.mvvmkotlin

import android.os.Bundle
import com.derelicthut.basecode.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}