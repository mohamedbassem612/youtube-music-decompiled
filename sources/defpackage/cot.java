package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cot extends btn {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;
    private final bss g;
    private final bso h;

    static {
        bsi bsiVar = new bsi();
        bsiVar.a = "SinglePeriodTimeline";
        bsiVar.b = Uri.EMPTY;
        bsiVar.a();
    }

    public cot(long j, long j2, long j3, boolean z, boolean z2, bss bssVar) {
        bso bsoVar = z2 ? bssVar.d : null;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        bssVar.getClass();
        this.g = bssVar;
        this.h = bsoVar;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.btn
    public final int b() {
        return 1;
    }

    @Override // defpackage.btn
    public final int c() {
        return 1;
    }

    @Override // defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        ahno.W(i, 1);
        btlVar.j(null, z ? b : null, 0, this.c, -this.e, brp.a, false, -9223372036854775807L);
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        ahno.W(i, 1);
        boolean z = this.f;
        btmVar.e(btm.a, this.g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z, false, this.h, 0L, this.d, 0, this.e);
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        ahno.W(i, 1);
        return b;
    }
}
