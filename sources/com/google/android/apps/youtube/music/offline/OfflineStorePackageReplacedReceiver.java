package com.google.android.apps.youtube.music.offline;

import android.content.Context;
import android.content.Intent;
import defpackage.hgx;
import defpackage.hlf;
import defpackage.hlv;
import defpackage.hma;
import internal.org.jni_zero.CommonApis;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class OfflineStorePackageReplacedReceiver extends hlf {
    public hlv c;
    public Executor d;

    @Override // defpackage.hlf, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            if (!this.a) {
                synchronized (this.b) {
                    if (!this.a) {
                        ((hma) CommonApis.j(context)).ea(this);
                        this.a = true;
                    }
                }
            }
            Executor executor = this.d;
            hlv hlvVar = this.c;
            hlvVar.getClass();
            executor.execute(new hgx(hlvVar, 6));
        }
    }
}
