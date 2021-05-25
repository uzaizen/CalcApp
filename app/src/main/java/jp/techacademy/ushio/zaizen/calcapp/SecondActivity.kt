package jp.techacademy.ushio.zaizen.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val ansstring = intent.getStringExtra("VALUE")
        Log.d("test","Answer = $ansstring")
        textView.text="$ansstring"
    }
}