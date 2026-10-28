package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aacw implements syk {
    private volatile long a = 0;
    private final awmd b;
    private final awmd c;
    private final aany d;
    private final agev e;
    private final aauk f;
    private final Executor g;
    private final mbc h;
    private final vxz i;
    private final abfv j;

    public aacw(awmd awmdVar, awmd awmdVar2, aany aanyVar, agev agevVar, aauk aaukVar, Executor executor, mbc mbcVar, abfv abfvVar, vxz vxzVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = aanyVar;
        this.e = agevVar;
        this.f = aaukVar;
        this.g = executor;
        this.h = mbcVar;
        this.j = abfvVar;
        this.i = vxzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, tpq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, tpq] */
    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        aaqn aaqnVarB;
        String string = bundle.getString("identityId");
        if (string == null || (aaqnVarB = aacv.b((aanb) this.b.io(), string)) == null) {
            return 1;
        }
        if (!this.f.J()) {
            ((aapr) this.c.io()).c(string, aaqnVarB);
            return aacv.a(0);
        }
        atpt atptVar = (atpt) this.j.b.c();
        atps atpsVar = atps.a;
        atps atpsVar2 = (atps) atptVar.d.get(string);
        if (atpsVar2 != null) {
            atpsVar = atpsVar2;
        }
        long j = atpsVar.e;
        synchronized (this) {
            long j2 = this.a + 36000000;
            mbc mbcVar = this.h;
            if (j2 < mbcVar.f().toEpochMilli() && j + 36000000 < mbcVar.f().toEpochMilli()) {
                long epochMilli = mbcVar.f().toEpochMilli();
                this.a = epochMilli;
                this.j.b.b(new rwf(string, epochMilli, 2));
                try {
                    if (!((Boolean) mci.a(aacv.c(this.d, aaqnVarB, ((Integer) ((agfa) this.e).a).intValue(), this.g, this.i))).booleanValue()) {
                        return 1;
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return 0;
    }
}
