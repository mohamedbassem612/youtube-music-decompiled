package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atq extends auu {
    private CharSequence a;

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.a = bundle.getCharSequence("android.bigText");
    }

    public final void c(CharSequence charSequence) {
        this.a = atr.c(charSequence);
    }

    public final void d(CharSequence charSequence) {
        this.i = atr.c(charSequence);
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) depVar.c).setBigContentTitle(this.i).bigText(this.a);
        if (this.k) {
            bigTextStyleBigText.setSummaryText(this.j);
        }
    }
}
