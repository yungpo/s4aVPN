package com.v2ray.ang.ui

import android.os.Bundle
import com.v2ray.ang.R

class ProfileActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentViewWithToolbar(R.layout.activity_profile, showHomeAsUp = true, title = getString(R.string.s4a_nav_profile))
    }
}
