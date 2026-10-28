package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzi implements ntu {
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public final nzw c;
    public final Executor d;
    public String e;
    public final long f;
    public final AtomicLong g = new AtomicLong(0);
    public final boolean h;
    public final adam i;
    public final sdo j;
    public final aawb k;
    public final ci l;
    private final boolean m;

    public nzi(aawb aawbVar, nzw nzwVar, Executor executor, adam adamVar, long j, boolean z, boolean z2, ci ciVar) {
        this.k = aawbVar;
        this.c = nzwVar;
        this.i = adamVar;
        this.j = new sdo(nzwVar, executor, adamVar);
        this.d = executor;
        this.f = j;
        this.m = z;
        this.h = z2;
        this.l = ciVar;
    }

    @Override // defpackage.ntu
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.ntu
    public final nqs b() {
        if (!this.m) {
            return nqs.a;
        }
        long j = this.f;
        if (j > 0) {
            if ((SystemClock.elapsedRealtimeNanos() / 1000) - this.g.get() > j * 60000000) {
                f();
            }
        }
        if (TextUtils.isEmpty(this.e)) {
            f();
        }
        return new nqs() { // from class: nzf
            @Override // defpackage.nqs
            public final nqt a() {
                nzi nziVar = this.b;
                return new nyz(nziVar.e, nziVar.c, nziVar.d, nziVar.i, nziVar.h, nziVar.l);
            }
        };
    }

    @Override // defpackage.ntu
    public final nrg c() {
        if (TextUtils.isEmpty(this.e)) {
            f();
        }
        return new nzh(this);
    }

    @Override // defpackage.ntu
    public final /* synthetic */ nwy d(int i) {
        return e(i, nqt.a);
    }

    @Override // defpackage.ntu
    public final nwy e(final int i, final nqt nqtVar) {
        long j = this.f;
        if (j > 0) {
            if ((SystemClock.elapsedRealtimeNanos() / 1000) - this.g.get() > j * 60000000) {
                f();
            }
        }
        if (TextUtils.isEmpty(this.e)) {
            f();
        }
        return new nwy() { // from class: nzg
            @Override // defpackage.nwy
            public final nxa a() {
                nzi nziVar = this.b;
                String str = nziVar.e;
                int i2 = i;
                adam adamVar = nziVar.i;
                nqt nqtVar2 = nqtVar;
                return new nzn(str, i2, nziVar.c, nziVar.d, adamVar, nqtVar2, nziVar.h, nziVar.l);
            }
        };
    }

    @Override // defpackage.ntu
    public final void f() {
        this.g.set(SystemClock.elapsedRealtimeNanos() / 1000);
        nzw nzwVar = this.c;
        String strB = nzwVar.b();
        this.e = strB;
        nzwVar.d(strB);
    }
}
