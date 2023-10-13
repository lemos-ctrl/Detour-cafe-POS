package com.detour.detourcafe
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val openActivityButton = findViewById<Button>(R.id.openActivityButton)

        openActivityButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TargetActivity::class.java)
            startActivity(intent)
        })

    }
}