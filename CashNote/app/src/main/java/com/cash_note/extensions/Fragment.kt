package com.elevation.extensions

import androidx.fragment.app.Fragment
import android.widget.Toast

fun Fragment.toast(text: String) {
    activity?.runOnUiThread {
        Toast.makeText(activity?.applicationContext, text, Toast.LENGTH_LONG).show()
    }
}