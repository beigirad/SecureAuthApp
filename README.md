# SecureAuthApp

<img src="https://raw.githubusercontent.com/beigirad/SecureAuthApp/master/files/screen.gif" alt="ZigzagView"  width="200" />

This is sample android app that require passcode in every action out of app

This implemented by two boradcast receiver whit this actions:

1.  ```android.intent.action.CLOSE_SYSTEM_DIALOGS```
1.  ```android.intent.action.SCREEN_OFF```

And I register and unregister this ```BroadcastReceiver``` in ```onCreate``` and ```onDestroy``` of ```BaseActivity```

This used for Securit Apps that should ask passcode when app goes in backgtound or paused for some one else!

If you have any suggestion , fork repo and take pull request.
Thanks
