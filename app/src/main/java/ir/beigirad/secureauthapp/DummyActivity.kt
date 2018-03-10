package ir.beigirad.secureauthapp

import android.os.Bundle
import android.widget.Toast
import ir.beigirad.backbuttonhandler.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class DummyActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = this.javaClass.simpleName
        button.text = "Say Hello"

        button.setOnClickListener {
            Toast.makeText(this, "Hello world!", Toast.LENGTH_SHORT).show()
        }
    }
}
