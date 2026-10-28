package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csl implements crm {
    @Override // defpackage.crm
    public final void b() {
        synchronized (csm.a) {
            synchronized (csm.b) {
                try {
                    if (csm.c) {
                        return;
                    }
                    long jA = csm.a();
                    synchronized (csm.b) {
                        SystemClock.elapsedRealtime();
                        csm.d = jA;
                        csm.c = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.crm
    public final void a() {
    }
}
