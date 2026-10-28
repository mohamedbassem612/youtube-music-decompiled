package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.agsj;
import defpackage.agsn;
import defpackage.msh;
import defpackage.pho;
import defpackage.pnv;
import defpackage.pnw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SystemTrayActivity extends Activity {
    public static final /* synthetic */ int a = 0;
    private static final agsn b = agsn.h("GnpSdk");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        pnw pnwVarA;
        Context applicationContext = getApplicationContext();
        Intent intent = getIntent();
        if (intent == null) {
            ((agsj) ((agsj) b.b()).k("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", 39, "SystemTrayActivity.java")).t("SystemTrayActivity received null intent");
        } else {
            intent.getAction();
            intent.getPackage();
            try {
                pnwVarA = pnv.a(getApplicationContext());
            } catch (IllegalStateException e) {
                ((agsj) ((agsj) ((agsj) b.c()).j(e)).k("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", 49, "SystemTrayActivity.java")).t("Chime component not initialized: Activity stopped.");
                pnwVarA = null;
            }
            if (pnwVarA != null) {
                pnwVarA.N().a(applicationContext);
                super.onCreate(bundle);
                agsn agsnVar = pho.a;
                if (intent.getBooleanExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", false)) {
                    pnv.a(applicationContext).G().a(new msh(applicationContext, intent, 20));
                } else {
                    Intent intent2 = new Intent(intent);
                    intent2.setFlags(268435456);
                    intent2.setClass(this, SystemTrayBroadcastReceiver.class);
                    sendBroadcast(intent2);
                }
            }
        }
        finish();
    }
}
