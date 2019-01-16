package com.santosh.animations.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.santosh.animations.R
import com.santosh.animations.fragment.LoginFragment

interface StartAnimationListener {
    fun toStart()
    fun toEnd()
}

class SeanCodesLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sean_codes_login)

        val fragment = LoginFragment.newInstance()

        findViewById<Button>(R.id.button_login).setOnClickListener {
            fragment.toStart()
        }

        findViewById<Button>(R.id.button_register).setOnClickListener {
            fragment.toEnd()
        }

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout_login_register, fragment, "loginfragment").commit()
    }
}
