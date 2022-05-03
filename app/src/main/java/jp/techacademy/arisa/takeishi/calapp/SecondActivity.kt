package jp.techacademy.arisa.takeishi.calapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val id = intent.getIntExtra("BUTTON1", 0)

        //        button1.equals(R.id.button1) ←ここでエラー・・・・・・・・・・・・・・・・・・・・・・


        when(id){
            R.id.button1 -> Answer.text = "${value1 + value2}"
            R.id.button2 -> Answer.text = "${value1 - value2}"
            R.id.button3 -> Answer.text = "${value1 * value2}"
            R.id.button4 -> Answer.text = "${value1 / value2}"
           // Log.d("showText", "動作確認")
        }

       // Answer.text = "${value1 + value2}"
    }
}
