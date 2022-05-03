package jp.techacademy.arisa.takeishi.calapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    //onClickメソッド内でSecondActivityに遷移させるよう記術
    override fun onClick(p0: View?) {

        //Snackbar表示
        if (editText1.text.toString() == "" || editText2.text.toString() == "") {
            val rootLayout: View = findViewById(android.R.id.content)
            val snackbar = Snackbar.make(rootLayout, "数字をいれてください", Snackbar.LENGTH_LONG)
            snackbar.show()

        } else {

            //数値に変換
            val x : Double = editText1.text.toString().toDouble()
            val y : Double = editText2.text.toString().toDouble()

            //遷移
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", x)
            intent.putExtra("VALUE2", y)
            intent.putExtra("BUTTON1", p0?.id)
            startActivity(intent)
        }
    }
}