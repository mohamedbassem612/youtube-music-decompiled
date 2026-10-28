package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atw extends auu {
    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        ((Notification.Builder) depVar.c).setStyle(atv.a());
    }

    @Override // defpackage.auu
    public final void j() {
    }
}
