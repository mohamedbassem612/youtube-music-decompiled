package com.google.android.libraries.youtube.notification;

import android.content.Context;
import android.content.Intent;
import defpackage.syi;
import defpackage.syn;
import defpackage.vxz;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;
import defpackage.zzo;
import defpackage.zzq;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationInteractionBroadcastReceiver extends zzo {
    public syi c;
    public vxz d;
    public syn e;

    @Override // defpackage.zzo, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((zzq) CommonApis.j(context)).dY(this);
                    this.a = true;
                }
            }
        }
        if (!this.d.l(5, 45352806L, false)) {
            this.c.a("notification_interaction", intent.getExtras());
            return;
        }
        try {
            this.e.d("notification_interaction", 0L, 1, 1, false, intent.getExtras(), null, false);
        } catch (RuntimeException e) {
            zvp.b(zvn.b, zvm.h, "Notification interaction extras exceed the size limit", e);
            this.c.a("notification_interaction", intent.getExtras());
        }
    }
}
