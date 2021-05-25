package jp.techacademy.ushio.zaizen.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operator1.setOnClickListener(this)
        operator2.setOnClickListener(this)
        operator3.setOnClickListener(this)
        operator4.setOnClickListener(this)
    }

    override fun onClick(v:View?) {
        val msg1: String = number1.text.toString()
        val msg2: String = number2.text.toString()
        if (msg1.trim().length > 0 && msg2.trim().length > 0) {

            val intent = Intent(this, SecondActivity::class.java)

            var fnum1: Float
            var fnum2: Float
            var ans: Float = 0f
            var sans: String
            fnum1 = number1.text.toString().toFloat()
            fnum2 = number2.text.toString().toFloat()

            if (v!!.id == R.id.operator1) {
                ans = fnum1 + fnum2
            }
            if (v!!.id == R.id.operator2) {
                ans = fnum1 - fnum2
            }
            if (v!!.id == R.id.operator3) {
                ans = fnum1 * fnum2
            }
            if (v!!.id == R.id.operator4) {
                ans = fnum1 / fnum2
            }

            sans = ans.toString()

            Log.d("test", sans)

            intent.putExtra("VALUE", sans)
            startActivity(intent)

        } else v?.let { Snackbar.make(it, "Input some data", Snackbar.LENGTH_LONG).setAction("Action",null).show() }
    }
}