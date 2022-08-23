package id.gustonecrush.ngabuburittravelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()

        backBtnListener()
    }

    private fun backBtnListener() {
        ic_back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}