package ir.beigirad.backbuttonhandler

import android.app.Activity
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import ir.beigirad.secureauthapp.AuthActivity

/**
 * Created by farhad-mbp on 3/10/18.
 */
open class BaseActivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName


    private lateinit var bc: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate ${savedInstanceState.toString().subSequence(0, 4)}")
        var filter = IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS")
        bc = MyReceiver(this)
        bc.register()

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState     ${outState.toString().subSequence(0, 4)}")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i(TAG, "onSaveInstanceState2    ${outState.toString().subSequence(0, 4)}   ${outPersistentState.toString().subSequence(0, 4)}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
        bc.unregister()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState  ${savedInstanceState.toString().subSequence(0, 4)}")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.i(TAG, "onRestoreInstanceState  ${savedInstanceState.toString().subSequence(0, 4)}     ${persistentState.toString().subSequence(0, 4)}")
    }

    fun gotoAuth(baseActivity: BaseActivity) {
        Log.i(TAG, "gotoAuth ${baseActivity.javaClass.simpleName}")
        val intent = Intent(baseActivity, AuthActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        baseActivity.startActivity(intent)

        super.finish()
        baseActivity.finish()

    }
}