package defpackage;

import android.os.SystemClock;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yz {
    private static yz b;
    public Object a;

    public static /* synthetic */ Instant b() {
        return Instant.ofEpochMilli(SystemClock.uptimeMillis());
    }

    public static synchronized yz d() {
        yz yzVar;
        yzVar = b;
        if (yzVar == null) {
            yzVar = new yz();
            b = yzVar;
        }
        return yzVar;
    }

    public final synchronized ktw a() {
        if (this.a == null) {
            this.a = new ktw(aguu.al(new cln(4)), b());
        }
        return (ktw) this.a;
    }

    public final synchronized boolean c() {
        return this.a != null;
    }
}
