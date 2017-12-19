package ru.altergot.coins

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View.OnClickListener
import android.support.v7.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tSupportActionBar(toolbar)
        val tb = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(tb)
/*
        login_button.setOnClickListener {
            // Handler code here.
            val intent: Intent = Intent(this, LoginActivity::class.java)
            val message = "auth state"
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent);
        }
*/
        val loginClick = OnClickListener {
            val intent: Intent = Intent(this, LoginActivity::class.java)
            val message = "auth state"
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent)
        }
        login_button.setOnClickListener(loginClick)

        //override fun loginClick(view: View): Unit


    }
}
