package com.cash_note.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun AppCompatActivity.addFragmentToActivity(mng: FragmentManager, frag: Fragment, containerId: Int) {
    val transaction = mng.beginTransaction()
    transaction.add(containerId, frag)
    transaction.commit()
}

fun AppCompatActivity.replaceFragment(mng: FragmentManager, fragToInsert: Fragment, containerId: Int) {
    val transaction = mng.beginTransaction()
    transaction.replace(containerId, fragToInsert)
    transaction.commit()
}