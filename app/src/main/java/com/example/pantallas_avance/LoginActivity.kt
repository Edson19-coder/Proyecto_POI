package com.example.pantallas_avance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    private Button button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button=(Button) findViewById(R.id.btn_entrar);
        button.setOnClickListener(new.setOnClickListener)
    }
}