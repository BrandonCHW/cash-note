package com.cash_note.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cash_note.R

class BudgetListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget_list)
        //val budgetListFrag = SpendingListFragment()
        //this.addFragmentToActivity(supportFragmentManager, budgetListFrag, R.id.BudgetFragmentContainer)
    }
}
