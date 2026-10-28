package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecd {
    public final qv a;
    private final dzp b;
    private final long c;
    private final Object d = new Object();
    private final Map e = new LinkedHashMap();

    public ecd(dzp dzpVar, qv qvVar, long j) {
        this.b = dzpVar;
        this.a = qvVar;
        this.c = j;
    }

    public final void a(dov dovVar) {
        Runnable runnable;
        dovVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(dovVar);
        }
        if (runnable != null) {
            this.b.a(runnable);
        }
    }

    public final void b(dov dovVar) {
        br brVar = new br(this, dovVar, 11);
        synchronized (this.d) {
        }
        this.b.b(this.c, brVar);
    }
}
