package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class czs {
    public int a;
    public int b;
    public Object c;
    public final Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    public czs(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        this(intentSender);
    }

    public final ri a() {
        Object obj = this.c;
        int i = this.a;
        int i2 = this.b;
        return new ri((IntentSender) this.d, (Intent) obj, i, i2);
    }

    public final void b(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public czs(IntentSender intentSender) {
        intentSender.getClass();
        this.d = intentSender;
    }

    public czs(int i) {
        this.d = new yhk[i];
        this.b = 0;
    }
}
