package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ywo {
    final ywn a;
    private Object b = null;
    private long c = -1000;

    public ywo(ywn ywnVar) {
        this.a = ywnVar;
    }

    public final synchronized void a(Object obj, String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b != obj || jElapsedRealtime - this.c >= 1000) {
            this.a.w("lcdi", str);
            this.b = obj;
            this.c = jElapsedRealtime;
        }
    }
}
