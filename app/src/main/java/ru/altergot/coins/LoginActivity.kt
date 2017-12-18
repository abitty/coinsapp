package ru.altergot.coins

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val intent: Intent = getIntent()
        val msg: String = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
}
