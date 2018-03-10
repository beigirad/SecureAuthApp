package ir.beigirad.secureauthapp

import android.content.Intent
import android.os.Bundle
import ir.beigirad.backbuttonhandler.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = this.javaClass.simpleName
        button.text = "Dummy"
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, DummyActivity::class.java))
        }
    }
}
