package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdi extends btn {
    private final long b;
    private final bss c;

    public zdi(bss bssVar) {
        zcf zcfVarB = zce.b(bssVar);
        zkf.d(zcfVarB);
        long j = zcfVarB.A.h;
        this.b = j > 0 ? bwp.y(j) : -9223372036854775807L;
        this.c = bssVar;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        return "YtVodPeriodUid".equals(obj) ? 0 : -1;
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
        azs.G(i);
        btlVar.m(true != z ? null : "YtVodPeriodId", true == z ? "YtVodPeriodUid" : null, this.b, 0L);
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        azs.G(i);
        btmVar.e(btm.a, this.c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, this.b, 0, 0L);
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        azs.G(i);
        return "YtVodPeriodUid";
    }
}
