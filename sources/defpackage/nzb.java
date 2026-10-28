package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzb implements nsc {
    private String b;
    private final nzw c;
    private final Executor d;
    private final long e;
    private final AtomicLong f = new AtomicLong(0);
    private final boolean g;
    private final adam h;
    private final aawb i;
    private final ci j;

    public nzb(aawb aawbVar, nzw nzwVar, Executor executor, adam adamVar, long j, boolean z, ci ciVar) {
        this.i = aawbVar;
        this.c = nzwVar;
        this.d = executor;
        this.b = nzwVar.b();
        this.h = adamVar;
        this.e = j;
        this.g = z;
        this.j = ciVar;
        c();
    }

    @Override // defpackage.nsc
    public final nse a(int i) {
        nzc nzcVar;
        long j = this.e;
        if (j > 0) {
            if ((SystemClock.elapsedRealtimeNanos() / 1000) - this.f.get() > j * 60000000) {
                c();
            }
        }
        if (this.g) {
            nzk nzkVarAk = this.j.ak();
            if (!nzkVarAk.a) {
                return nse.a;
            }
            nzcVar = new nzc(this.b, i, this.c, this.d, nzkVarAk);
        } else {
            nzcVar = new nzc(this.b, i, this.c, this.d, null);
        }
        return nzcVar;
    }

    @Override // defpackage.nsc
    public final boolean b() {
        return this.g || this.h.a(nzs.COMMAND_EXECUTION);
    }

    public final void c() {
        this.f.set(SystemClock.elapsedRealtimeNanos() / 1000);
        nzw nzwVar = this.c;
        String strB = nzwVar.b();
        this.b = strB;
        nzwVar.d(strB);
    }
}
