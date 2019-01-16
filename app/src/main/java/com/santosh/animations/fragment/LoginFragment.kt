package com.santosh.animations.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.santosh.animations.R
import com.santosh.animations.activities.StartAnimationListener
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(), StartAnimationListener {
    override fun toEnd() {
        motionlayout_container_login.transitionToEnd()
    }

    override fun toStart() {
        motionlayout_container_login.transitionToStart()
    }

    companion object {
        fun newInstance(): LoginFragment {
            return LoginFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}
