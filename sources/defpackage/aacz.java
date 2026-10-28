package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aacz implements aari {
    private final aaqg a;
    private final syn b;

    public aacz(syn synVar, aaqg aaqgVar) {
        this.b = synVar;
        this.a = aaqgVar;
    }

    @Override // defpackage.aari
    public final void a(String str) {
        d();
        this.a.x(str, 0L);
    }

    @Override // defpackage.aari
    public final void b(String str) {
        syn synVar = this.b;
        synVar.b("offline_pas");
        long jP = this.a.p(str);
        if (jP > 0) {
            synVar.d("offline_pas_single", jP, 1, 1, true, aacr.a(str), aacr.b, false);
        }
    }

    @Override // defpackage.aari
    public final void c(String str, long j) {
        if (j > 0) {
            this.b.d("offline_pas_single", j, 2, 1, true, aacr.a(str), aacr.b, false);
            this.a.y(str, j);
        }
    }

    @Override // defpackage.aari
    public final void d() {
        this.b.b("offline_pas_single");
    }

    @Override // defpackage.aari
    public final void e(String str) {
        Bundle bundleA = aacr.a(str);
        bundleA.putBoolean("forceSync", false);
        this.b.d("offline_pas_single", 0L, 2, 1, false, bundleA, null, false);
    }
}
