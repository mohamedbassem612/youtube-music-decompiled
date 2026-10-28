package com.google.android.libraries.youtube.rendering.customtabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CustomTabsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", dataString);
        Intent intentCreateChooser = Intent.createChooser(intent2, null);
        intentCreateChooser.setFlags(268435456);
        context.startActivity(intentCreateChooser);
    }
}
