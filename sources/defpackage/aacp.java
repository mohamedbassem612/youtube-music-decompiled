package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aacp implements aari {
    public static final long a;
    private final aauk b;
    private final aaqg c;
    private final syn d;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 14400L;
    }

    public aacp(syn synVar, aaqg aaqgVar, aauk aaukVar) {
        aaqgVar.getClass();
        this.c = aaqgVar;
        synVar.getClass();
        this.d = synVar;
        aaukVar.getClass();
        this.b = aaukVar;
    }

    @Override // defpackage.aari
    public final void a(String str) {
        d();
        this.c.y(str, 0L);
    }

    @Override // defpackage.aari
    public final void b(String str) {
        syn synVar = this.d;
        synVar.b("offline_pas_single");
        long jP = this.c.p(str);
        if (jP > 0) {
            aauk aaukVar = this.b;
            if (aaukVar.a() <= 0) {
                jP += a;
            }
            long jA = aaukVar.a() > 0 ? aaukVar.a() : a;
            boolean z = !aaukVar.D();
            syj syjVar = aacr.b;
            Bundle bundle = new Bundle();
            bundle.putString("identityId", str);
            synVar.c("offline_pas", jP, jA, false, 1, z, bundle, aacr.b);
        }
    }

    @Override // defpackage.aari
    public final void c(String str, long j) {
        if (j > 0) {
            syn synVar = this.d;
            aauk aaukVar = this.b;
            synVar.c("offline_pas", aaukVar.a() > 0 ? j : a + j, aaukVar.a() > 0 ? aaukVar.a() : a, true, 1, !aaukVar.D(), aacr.a(str), aacr.b);
            this.c.y(str, j);
        }
    }

    @Override // defpackage.aari
    public final void d() {
        this.d.b("offline_pas");
    }

    @Override // defpackage.aari
    public final void e(String str) {
        Bundle bundleA = aacr.a(str);
        bundleA.putBoolean("forceSync", false);
        this.d.d("offline_pas", 0L, 2, 1, false, bundleA, null, false);
    }
}
