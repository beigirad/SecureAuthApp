package ir.beigirad.backbuttonhandler

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log

/**
 * Created by farhad-mbp on 3/10/18.
 */
class MyReceiver(val baseActivity: BaseActivity) {
    val TAG = this.javaClass.simpleName

    val closeFilter = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
    val screenFilter = "android.intent.action.SCREEN_OFF"

    private var intentFilter: IntentFilter

    init {
        intentFilter = IntentFilter()
        intentFilter.addAction(closeFilter)
        intentFilter.addAction(screenFilter)
    }

    var bc = object : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            when (p1?.action) {
                screenFilter -> {
                    baseActivity.gotoAuth(baseActivity)
                }

                closeFilter -> {
                    baseActivity.gotoAuth(baseActivity)

                }
            }
        }
    }

    public fun register() {
        Log.i(TAG, "register in ${baseActivity.javaClass.simpleName}")
        baseActivity.registerReceiver(bc, intentFilter)
    }

    public fun unregister() {
        Log.i(TAG, "unregister in ${baseActivity.javaClass.simpleName}")
        baseActivity.unregisterReceiver(bc)
    }


}