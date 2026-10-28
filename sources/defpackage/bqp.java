package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bqp implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final brf d;
    public final HashMap e = new HashMap();
    public bqo f;
    public final /* synthetic */ bre g;
    public final zf h;

    public bqp(bre breVar, String str, int i, int i2, zf zfVar) {
        this.g = breVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new brf(str, i, i2);
        this.h = zfVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.e.post(new bkn(this, 3, null));
    }
}
